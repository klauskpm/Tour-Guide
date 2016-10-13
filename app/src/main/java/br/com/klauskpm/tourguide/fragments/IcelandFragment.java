package br.com.klauskpm.tourguide.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import br.com.klauskpm.tourguide.Location;
import br.com.klauskpm.tourguide.R;

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

        locationArrayList.add(new Location(getString(R.string.beyond_the_wall), getString(R.string.vatnajokull), -17.043083, 64.411942, R.drawable.vatnajokull));
        locationArrayList.add(new Location(getString(R.string.frostfangs_mountains), getString(R.string.hofoabrekkuheioi), -18.903275, 63.506709, R.drawable.hofoabrekkuheioi));
        locationArrayList.add(new Location(getString(R.string.john_and_ygritte_spring), getString(R.string.grjotagja_cave), -16.883197, 65.626983, R.drawable.grjotagja_cave));
    }
}
