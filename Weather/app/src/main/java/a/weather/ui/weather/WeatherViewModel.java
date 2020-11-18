package a.weather.ui.weather;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import a.weather.network.weather.DailyData;

public class WeatherViewModel extends ViewModel {

    // 实时天气需要的属性.
    public MutableLiveData<Double> temp;
    public MutableLiveData<String> skyCon;
//    public MutableLiveData<String> ultraviolet;
    public MutableLiveData<String> currentAQI;
    // 未来天气需要的属性.
    public MutableLiveData<List<DailyData.ResultDTO.DailyDTO.TemperatureDTO>> daily_temp;
    public MutableLiveData<List<DailyData.ResultDTO.DailyDTO.SkyconDTO>> daily_skyCon;

    // 生活指数数据
    public MutableLiveData<DailyData.ResultDTO.DailyDTO.LifeIndexDTO.ColdRiskDTO> coldRisk;
    public MutableLiveData<DailyData.ResultDTO.DailyDTO.LifeIndexDTO.DressingDTO> dressing;
    public MutableLiveData<DailyData.ResultDTO.DailyDTO.LifeIndexDTO.UltravioletDTO> ultraviolet;
    public MutableLiveData<DailyData.ResultDTO.DailyDTO.LifeIndexDTO.CarWashingDTO> carWashing;

    /**
     * 初始化数据.
     */
    public void initData(){
        temp = new MutableLiveData<>();
        skyCon = new MutableLiveData<>();
        currentAQI = new MutableLiveData<>();

        daily_temp = new MutableLiveData<>();
        daily_skyCon = new MutableLiveData<>();

        coldRisk = new MutableLiveData<>();
        dressing = new MutableLiveData<>();
        ultraviolet = new MutableLiveData<>();
        carWashing = new MutableLiveData<>();
    }
}
