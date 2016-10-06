package br.com.klauskpm.tourguide.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import br.com.klauskpm.tourguide.Location;
import br.com.klauskpm.tourguide.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MorrocoFragment extends CategoryFragment {


    public MorrocoFragment() {
        // Required empty public constructor

        setTitleResourceId(R.string.category_morroco);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        locationArrayList.add(new Location("Yunkai and Pentos", "Aït Benhaddou"));
        locationArrayList.add(new Location("Astapor", "Essaouira"));
    }
}
