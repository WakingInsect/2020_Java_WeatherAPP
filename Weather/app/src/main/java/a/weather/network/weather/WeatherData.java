package a.weather.network.weather;

import com.google.gson.Gson;

import a.weather.WeatherApplication;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// 单例类，提供一个访问天气数据的入口.
public class WeatherData {

    // 用于拼接的API网址.
    public static final String BASE_URL = "https://api.caiyunapp.com/";

    // 创建访问网络数据的封装类，实现网络接口
    Retrofit retrofit;
    GetData getdata;

    private static WeatherData weatherData;

    /**
     * 对外提供的获取单例的方法.
     * @return  返回一个单例对象.
     */
    public static WeatherData getInstance(){
        if(weatherData == null){
            weatherData = new WeatherData();
        }
        return weatherData;

    }

    /**
     * 获取即时天气数据.
     * @param lng 目标城市的经度.
     * @param lat 目标城市的纬度.
     * @return 返回一个即时天气信息类.
     */
    public Call<RealTimeData> getRealTimeData(double lng,double lat){
        return getdata.getRealtimeData(WeatherApplication.TOKEN,String.valueOf(lng),String.valueOf(lat));

    }

    /**
     * 获取未来几天的天气信息.
     * @param lng 目标城市的经度.
     * @param lat 目标城市的纬度.
     * @return 返回一个天气信息类.
     */
    public Call<DailyData> getDailyData(double lng, double lat){
        return getdata.getDailyData(WeatherApplication.TOKEN,String.valueOf(lng),String.valueOf(lat));

    }

    /**
     * 构造方法，在调用时初始化组件.
     */
    public WeatherData(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
        getdata = retrofit.create(GetData.class);
    }
}
