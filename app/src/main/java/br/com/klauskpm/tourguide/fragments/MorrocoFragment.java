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

        locationArrayList.add(new Location("Yunkai and Pentos", "Aït Ben Haddou", -7.130282, 31.045886, R.drawable.ait_ben_haddou));
        locationArrayList.add(new Location("Astapor", "Essaouira", -9.760760, 31.507504, R.drawable.essaouira));
    }
}
