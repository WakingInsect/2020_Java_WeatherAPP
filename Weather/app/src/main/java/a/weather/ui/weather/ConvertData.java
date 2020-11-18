package a.weather.ui.weather;

import android.content.res.Resources;

import a.weather.WeatherApplication;

public class ConvertData {
    /**
     * 中文描述与英文描述按下表对应，详情可查看彩云天气官方API.
     * https://open.caiyunapp.com/%E5%A4%A9%E7%BA%A7%E9%A2%84%E6%8A%A5%E6%8E%A5%E5%8F%A3/v2.5#.E5.A4.A9.E6.B0.94.E7.8E.B0.E8.B1.A1.E4.BB.A3.E7.A0.81.
     */
    static String[] weatherList_C = new String[]{
      "晴","晴","多云","多云","阴","轻度雾霾", "中度雾霾", "重度雾霾", "小雨",
            "中雨", "大雨", "暴雨", "雾", "小雪", "中雪", "大雪", "暴雪",
            "浮尘", "沙尘", "大风"
    };
    static String[] weatherList_E = new String[]{
            "CLEAR_DAY","CLEAR_NIGHT","PARTLY_CLOUDY_DAY","PARTLY_CLOUDY_NIGHT",
            "CLOUDY","LIGHT_HAZE","MODERATE_HAZE","HEAVY_HAZE","LIGHT_RAIN","MODERATE_RAIN",
            "HEAVY_RAIN","STORM_RAIN","FOG","LIGHT_SNOW","MODERATE_SNOW","HEAVY_SNOW","STORM_SNOW",
            "DUST","SAND","WIND"
    };

    /**
     * 将接收到的英文关键字转换为中文描述.
     * @param desc 英文关键字.
     * @return 中文描述.
     */
    public static String convertToWeather(String desc){
        for(int x = 0;x < weatherList_E.length;x++){
            if(desc.equals(weatherList_E[x])){
                return weatherList_C[x];
            }
        }
        return "";

    }

    /**
     * 通过传入天气描述，返回对应的背景图片id
     * @param name 字符串名称
     * @return  资源id
     */
    public static int getId(String name){
        Resources r = WeatherApplication.context.getResources();
        return r.getIdentifier(name,"drawable",WeatherApplication.context.getPackageName());

    }
}
