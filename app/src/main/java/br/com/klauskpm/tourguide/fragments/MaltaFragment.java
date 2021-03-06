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

        locationArrayList.add(new Location(getString(R.string.kings_landing_gate), getString(R.string.mdina_gate), 14.403344, 35.884589, R.drawable.mdina_gate));
        locationArrayList.add(new Location(getString(R.string.red_keep_gate), getString(R.string.fort_ricasoli), 14.527209, 35.896228, R.drawable.fort_ricasoli));
        locationArrayList.add(new Location(getString(R.string.daenerys_and_drogo_wedding), getString(R.string.azure_window), 14.188042, 36.053517, R.drawable.azure_window));
        locationArrayList.add(new Location(getString(R.string.illyrio_mopatis_house), getString(R.string.verdala_palace), 14.400482, 35.861507, R.drawable.verdala_palace));
    }
}
