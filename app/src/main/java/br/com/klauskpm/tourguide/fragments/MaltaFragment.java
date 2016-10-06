package br.com.klauskpm.tourguide.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import br.com.klauskpm.tourguide.Location;
import br.com.klauskpm.tourguide.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MaltaFragment extends CategoryFragment {


    public MaltaFragment() {
        // Required empty public constructor
        setTitleResourceId(R.string.category_malta);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        locationArrayList.add(new Location("Kings Landing Gate", "Mdina Gate"));
        locationArrayList.add(new Location("Red Keep Gate", "Fort Ricasoli"));
        locationArrayList.add(new Location("Daenerys and Khal Drogo's Wedding", "Azure Window"));
        locationArrayList.add(new Location("Illyrio Mopatis's House", "Verdala Palace"));
    }
}
