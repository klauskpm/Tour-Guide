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

        locationArrayList.add(new Location(getString(R.string.kings_landing), getString(R.string.dubrovnik), 18.093226, 42.650215, R.drawable.dubrovnik));
        locationArrayList.add(new Location(getString(R.string.red_keep), getString(R.string.lovrijenac_fortress), 18.104176, 42.640565, R.drawable.lovrijenac_fortress));
        locationArrayList.add(new Location(getString(R.string.house_of_the_undying), getString(R.string.minceta_tower), 18.108474, 42.642745, R.drawable.minceta_tower));
        locationArrayList.add(new Location(getString(R.string.qarth), getString(R.string.lokrum), 18.120097, 42.628536, R.drawable.lokrum));
    }
}
