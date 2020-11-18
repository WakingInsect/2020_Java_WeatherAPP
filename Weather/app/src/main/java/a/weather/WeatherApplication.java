package a.weather;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

/**
 * 一个全局常量类，保存部分Android开发中会经常被调用的数据.
 */
public class WeatherApplication extends Application {

    // Android用于全局的上下文.
    @SuppressLint("StaticFieldLeak")
    public static Context context;
    // 彩云天气的开发者token，用于拼接url并获取数据.
    public static String TOKEN = "IraSOhKrpAavKN7Z";

    /**
     * 当此应用程序类被创建时初始化context.
     */
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}
