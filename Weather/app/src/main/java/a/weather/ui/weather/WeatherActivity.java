package a.weather.ui.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.Objects;

import a.weather.R;
import a.weather.R.id;
import a.weather.WeatherApplication;
import a.weather.network.weather.WeatherData;
import a.weather.network.weather.DailyData;
import a.weather.network.weather.RealTimeData;
import a.weather.ui.place.PlaceViewModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherActivity extends AppCompatActivity {

    PlaceViewModel placeViewModel;
    WeatherViewModel weatherViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        // 获取ViewModel对象并将数据保存在View Model中
        placeViewModel = new ViewModelProvider(this).get(PlaceViewModel.class);
        // 创建intent对象用作Activity中的信息交互器.
        Intent intent = getIntent();
        if (placeViewModel.getName() == null) {
            placeViewModel.setName(intent.getStringExtra("name"));
        }
        if (placeViewModel.getLat() == 0) {
            placeViewModel.setLat(intent.getDoubleExtra("lat", 0));
        }
        if (placeViewModel.getLng() == 0) {
            placeViewModel.setLng(intent.getDoubleExtra("lng", 0));
        }
        /*
        获取Weather Activity的页面布局.
        设置布局可见.
         */
        ScrollView layout = findViewById(R.id.weatherLayout);
        layout.setVisibility(View.VISIBLE);
        GetWeatherData();

    }

    /**
     * 访问网络并获取数据.
     */
    private void GetWeatherData() {
        // 创建ViewModel对象，保存页面数据.
        weatherViewModel = new ViewModelProvider(this).get(WeatherViewModel.class);
        weatherViewModel.initData();

        /*
          发送请求并接收返回数据.
          获取实时天气数据.
          获取预报天气数据.
         */
        Call<RealTimeData> realTimeData = WeatherData.getInstance().getRealTimeData(placeViewModel.getLng(), placeViewModel.getLat());
        Call<DailyData> dailyData = WeatherData.getInstance().getDailyData(placeViewModel.getLng(),placeViewModel.getLat());

        // 在子线程中对请求到的数据进行处理.
        realTimeData.enqueue(new Callback<RealTimeData>() {
            @Override
            public void onResponse(@NotNull Call<RealTimeData> call, @NotNull Response<RealTimeData> response) {
                if (response.body() != null && response.body().getStatus().equals("ok")) {
                    RealTimeData.ResultDTO.RealtimeDTO real = response.body().getResult().getRealtime();
                    weatherViewModel.temp.setValue(real.getTemperature());
                    weatherViewModel.skyCon.setValue(real.getSkycon());
                    weatherViewModel.currentAQI.setValue(real.getAir_quality().getDescription().getChn());
                    showRealTimeInfo();

                }
            }

            @Override
            public void onFailure(@NotNull Call<RealTimeData> call, @NotNull Throwable t) {
                Toast.makeText(WeatherApplication.context, "实时天气信息获取失败", Toast.LENGTH_SHORT).show();
            }
        });
        dailyData.enqueue(new Callback<DailyData>() {
            @Override
            public void onResponse(@NotNull Call<DailyData> call, @NotNull Response<DailyData> response) {
                if(response.body()!=null&&response.body().getStatus().equals("ok")){
                    DailyData.ResultDTO.DailyDTO daily =  response.body().getResult().getDaily();
                    // 获取未来五天的温度信息.
                    weatherViewModel.daily_temp.setValue(daily.getTemperature());
                    // 获取未来五天的天气信息.
                    weatherViewModel.daily_skyCon.setValue(daily.getSkycon());
                    showForecastInfo();
                    // 获取生活指数信息
                    weatherViewModel.coldRisk.setValue(daily.getLife_index().getColdRisk().get(0));
                    weatherViewModel.dressing.setValue(daily.getLife_index().getDressing().get(0));
                    weatherViewModel.ultraviolet.setValue(daily.getLife_index().getUltraviolet().get(0));
                    weatherViewModel.carWashing.setValue(daily.getLife_index().getCarWashing().get(0));
                    showLifeIndex();

                }

            }

            @Override
            public void onFailure(@NotNull Call<DailyData> call, @NotNull Throwable t) {
                Toast.makeText(WeatherApplication.context, "未来天气信息获取失败", Toast.LENGTH_SHORT).show();
                t.printStackTrace();
            }
        });

    }

    /**
     * 将实时天气信息填充到页面中去。
     */
    @SuppressLint("SetTextI18n")
    private void showRealTimeInfo() {
        ConstraintLayout nowLayout;
        TextView placeName, currentAQI, currentSky;

        nowLayout = findViewById(id.nowLayout);
        placeName = findViewById(id.placeName);
        currentAQI = findViewById(id.currentAQI);
        currentSky = findViewById(id.currentSky);

        TextView curTem = findViewById(R.id.currentTemp);
        // 获取背景图片id
        int id = ConvertData.getId("bg_"+ Objects.requireNonNull(weatherViewModel.skyCon.getValue()).toLowerCase());
        // 设置背景图片
        nowLayout.setBackgroundResource(id);
        // 设置城市名称
        placeName.setText(placeViewModel.getName());
        // 设置温度
        curTem.setText(weatherViewModel.temp.getValue() + "℃");
        // 设置空气质量
        currentAQI.setText("空气质量：" + weatherViewModel.currentAQI.getValue());
        // 设置天气
        currentSky.setText("天气：" + ConvertData.convertToWeather(weatherViewModel.skyCon.getValue()));

    }

    /**
     * 将预报天气信息填充到页面中.
     */
    @SuppressLint("SetTextI18n")
    private void showForecastInfo(){
        /*
            创建页面布局对象，并于页面布局绑定.
            声明布局中的控件.
         */
        LinearLayout forecastLayout = findViewById(id.forecastLayout);
        View forecast_item;
        TextView dateInfo,skyInfo,temperatureInfo;
        ImageView skyIcon;

        /*
        获取数据对象的迭代器.
         */
        Iterator<DailyData.ResultDTO.DailyDTO.TemperatureDTO> daily_tem_it = Objects.requireNonNull(weatherViewModel.daily_temp.getValue()).iterator();
        Iterator<DailyData.ResultDTO.DailyDTO.SkyconDTO> daily_skyCon_it = Objects.requireNonNull(weatherViewModel.daily_skyCon.getValue()).iterator();
        /*
        通过迭代器对数据集合进行遍历，并填充控件内容。
         */
        while (daily_tem_it.hasNext()&&daily_skyCon_it.hasNext()){
            /*
              初始化控件对象并与布局控件绑定.
             */
            forecast_item = LayoutInflater.from(WeatherApplication.context).inflate(R.layout.forecast_item,forecastLayout,false);
            dateInfo = forecast_item.findViewById(id.dateInfo);
            skyIcon = forecast_item.findViewById(id.skyIcon);
            skyInfo = forecast_item.findViewById(id.skyInfo);
            temperatureInfo = forecast_item.findViewById(id.temperatureInfo);

            /*
            获取ViewModel中的数据并填充到空间当中.
             */
            DailyData.ResultDTO.DailyDTO.TemperatureDTO daily_temp =  daily_tem_it.next();
            DailyData.ResultDTO.DailyDTO.SkyconDTO daily_skyCon = daily_skyCon_it.next();
            dateInfo.setText(daily_skyCon.getDate().substring(0,10));
            int id = ConvertData.getId("ic_"+daily_skyCon.getValue().toLowerCase());
            Log.d("TAG", "展示天气信息："+"ic_"+daily_skyCon.getValue().toLowerCase());
            skyIcon.setImageResource(id);
            temperatureInfo.setText(daily_temp.getMin()+"~"+daily_temp.getMax()+"℃");
            skyInfo.setText(ConvertData.convertToWeather(daily_skyCon.getValue()));
            /*
            将控件添加到布局当中.
             */
            forecastLayout.addView(forecast_item);
        }
    }

    /**
     * 填充生活指数信息.
     */
    private void showLifeIndex(){
        TextView coldRiskText,dressingText,ultravioletText,carWashingText;

        coldRiskText = findViewById(id.coldRiskText);
        dressingText = findViewById(id.dressingText);
        ultravioletText = findViewById(id.ultravioletText);
        carWashingText = findViewById(id.carWashingText);

        coldRiskText.setText(weatherViewModel.coldRisk.getValue().getDesc());
        dressingText.setText(weatherViewModel.dressing.getValue().getDesc());
        ultravioletText.setText(weatherViewModel.ultraviolet.getValue().getDesc());
        carWashingText.setText(weatherViewModel.carWashing.getValue().getDesc());

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}