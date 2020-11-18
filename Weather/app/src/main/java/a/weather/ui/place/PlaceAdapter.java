package a.weather.ui.place;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amap.api.services.district.DistrictItem;

import java.util.List;

import a.weather.R;
import a.weather.WeatherApplication;
import a.weather.ui.weather.WeatherActivity;


public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder> {

    List<DistrictItem> data;

    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView cityName,placeAddress;
        public ViewHolder(View view){
            super(view);
            placeAddress = view.findViewById(R.id.placeAddress);
            cityName = view.findViewById(R.id.CityName);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.place_item,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DistrictItem item = data.get(position);
        holder.cityName.setText(item.getName());
        String builder = item.getCenter().getLongitude() + "\t" + item.getCenter().getLatitude();
        holder.placeAddress.setText(builder);
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(WeatherApplication.context, WeatherActivity.class);
            intent.putExtra("lng",item.getCenter().getLongitude());
            intent.putExtra("lat",item.getCenter().getLatitude());
            intent.putExtra("name",item.getName());
            v.getContext().startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return data.size();

    }

    public PlaceAdapter(List<DistrictItem> data){
        this.data = data;

    }

}
