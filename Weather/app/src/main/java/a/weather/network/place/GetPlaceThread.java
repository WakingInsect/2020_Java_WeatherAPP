package a.weather.network.place;

import com.amap.api.services.core.AMapException;
import com.amap.api.services.district.DistrictResult;
import com.amap.api.services.district.DistrictSearch;
import com.amap.api.services.district.DistrictSearchQuery;

import a.weather.WeatherApplication;

// 城市信息数据查询的线程
public class GetPlaceThread extends Thread implements Runnable {
    public DistrictResult result;   // 查询的结果
    private String keyword;         // 用于查询城市数据的关键字
    private final DistrictSearch search;    // 城市数据查询类
    private final DistrictSearchQuery query;    // 查询类能直接使用的关键字类

    @Override
    public void run() {
        query.setKeywords(keyword); // 设置查询关键字
        search.setQuery(query);
        try {
            result = search.searchDistrict();   // 返回查询结果
        } catch (AMapException e) {
            e.printStackTrace();
        }
    }

    // 创建对象时初始化组件
    public GetPlaceThread(){
        search = new DistrictSearch(WeatherApplication.context);
        query = new DistrictSearchQuery();
    }

    // 外部设置关键字
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
