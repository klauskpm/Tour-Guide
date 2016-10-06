package br.com.klauskpm.tourguide.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import br.com.klauskpm.tourguide.Location;
import br.com.klauskpm.tourguide.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CroatiaFragment extends CategoryFragment {


    public CroatiaFragment() {
        // Required empty public constructor

        setTitleResourceId(R.string.category_croatia);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        locationArrayList.add(new Location("Kings Landing", "Dubrovnik", 42.649654, 18.093098));
        locationArrayList.add(new Location("Red Keep", "Lovrijenac Fortress"));
        locationArrayList.add(new Location("House of the Undying", "Minčeta Tower"));
        locationArrayList.add(new Location("Qarth", "Lokrum"));
    }
}
