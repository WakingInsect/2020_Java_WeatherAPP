package a.weather.network.place;

import com.amap.api.services.district.DistrictItem;

import java.util.List;

// 对外提供一个获取数据查询的入口
public class PlaceData {
    private static final PlaceData placeData = new PlaceData();

    private String keyword;

    public List<DistrictItem> getData() {
        GetPlaceThread thread = new GetPlaceThread();
        thread.setKeyword(keyword);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return thread.result.getDistrict();
    }

    // 外部获取接口单例
    public static PlaceData getInstance(){
        return placeData;
    }

    // 设置关键字
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}

