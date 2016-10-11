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

        locationArrayList.add(new Location("Beyond the Wall", "Vatnajokull", -17.043083, 64.411942, R.drawable.vatnajokull));
        locationArrayList.add(new Location("Frostfangs Mountains", "Höfðabrekkuheiði", -18.903275, 63.506709, R.drawable.hofoabrekkuheioi));
        locationArrayList.add(new Location("John Snow and Ygritte Spring", "Grjótagjá cave", -16.883197, 65.626983, R.drawable.grjotagja_cave));
    }
}
