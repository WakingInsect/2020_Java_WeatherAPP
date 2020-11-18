package a.weather.network.weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Retrofit2可以通过注解实现访问网络数据.
 * token是API的访问令牌，再调用此方法时以参数的形式传入.
 */
public interface GetData {
    // 获取即时的天气数据
    @GET("v2.5/{token}/{lng},{lat}/realtime.json")
    Call<RealTimeData> getRealtimeData(@Path("token") String token,@Path("lng") String lng,@Path("lat") String lat);

    // 获取几天的天气数据
    @GET("v2.5/{token}/{lng},{lat}/daily.json")
    Call<DailyData> getDailyData(@Path("token") String token,@Path("lng") String lng,@Path("lat") String lat);

    // 获取未来几个小时的天气数据
    @GET("v2.5/{token}/{lng},{lat}/hourly.json")
    Call<HourlyData> getHourlyData(@Path("token") String token,@Path("lng") String lng,@Path("lat") String lat);

}
