package a.weather.ui.place;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.amap.api.services.district.DistrictItem;

import java.util.ArrayList;
import java.util.List;

public class PlaceViewModel extends ViewModel {

    public List<DistrictItem>  itemList = new ArrayList<>();
    private MutableLiveData<Double> lng;
    private MutableLiveData<Double> lat;
    private MutableLiveData<String> name;

    public double getLng() {
        if(lng==null) {
            lng = new MutableLiveData<>();
            lng.setValue(0.0);
        }
        return lng.getValue();
    }

    public double getLat() {
        if(lat ==null){
            lat = new MutableLiveData<>();
            lat.setValue(0.0);
        }
        return lat.getValue();
    }

    public String getName() {
        if(name==null){
            name = new MutableLiveData<>();
        }
        return name.getValue();
    }

    public void setLng(double lng) {
        this.lng.setValue(lng);
    }

    public void setLat(double lat) {
        this.lat.setValue(lat);
    }

    public void setName(String name) {
        this.name.setValue(name);
    }
}
