package br.com.klauskpm.tourguide;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class IcelandFragment extends CategoryFragment {


    public IcelandFragment() {
        // Required empty public constructor
        setTitleResourceId(R.string.category_iceland);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        locationArrayList.add(new Location("Beyond the Wall", "Vatnajokull"));
        locationArrayList.add(new Location("Frostfangs Mountains", "Hofdabrekka"));
        locationArrayList.add(new Location("John Snow and Ygritte Thermal Spring", "Grjótagjá Thermal Spring"));
    }
}
