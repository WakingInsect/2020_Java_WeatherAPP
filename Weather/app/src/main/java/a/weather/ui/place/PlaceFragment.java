package a.weather.ui.place;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.amap.api.services.district.DistrictItem;

import java.util.ArrayList;
import java.util.List;

import a.weather.R;
import a.weather.WeatherApplication;
import a.weather.network.place.PlaceData;

public class PlaceFragment extends Fragment {

    View view;
    EditText searchPlaceEdit;
    RecyclerView recyclerView;
    List<DistrictItem> result;
    PlaceViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_place,container,false);
        initViews();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        searchPlaceEdit.setOnEditorActionListener((v, actionId, event) -> {
            if(actionId== EditorInfo.IME_ACTION_SEARCH){
                initList(v.getEditableText());
                return true;
            }
            return false;
        });
    }

    public void initList(Editable s){
        if(result == null){
            result = new ArrayList<>();
        }else if(result.size()!=0){
            result.clear();
        }

        PlaceData.getInstance().setKeyword(s.toString());

        viewModel.itemList = PlaceData.getInstance().getData();
        
        for (DistrictItem item :PlaceData.getInstance().getData()) {
            result.add(item);
            if(item.getSubDistrict().size() != 0){
                result.addAll(item.getSubDistrict());
            }
        }
        recyclerView.setAdapter(new PlaceAdapter(result));
        recyclerView.setVisibility(View.VISIBLE);
    }

    /**
     * 获取布局中的控件.
     */
    private void initViews(){
        viewModel = new ViewModelProvider(requireActivity()).get(PlaceViewModel.class);
        searchPlaceEdit = view.findViewById(R.id.searchPlaceEdit);
        recyclerView = view.findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(WeatherApplication.context));

    }
}
