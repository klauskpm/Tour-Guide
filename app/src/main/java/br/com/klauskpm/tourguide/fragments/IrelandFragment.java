package br.com.klauskpm.tourguide.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import br.com.klauskpm.tourguide.Location;
import br.com.klauskpm.tourguide.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class IrelandFragment extends CategoryFragment {


    public IrelandFragment() {
        // Required empty public constructor
        setTitleResourceId(R.string.category_ireland);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        locationArrayList.add(new Location(getString(R.string.northern_forests), getString(R.string.tollymore_forest_park), -5.942564, 54.219669, R.drawable.tollymore_forest_park));
        locationArrayList.add(new Location(getString(R.string.winterfell), getString(R.string.ward_castle), -5.585427, 54.369072, R.drawable.ward_castle));
        locationArrayList.add(new Location(getString(R.string.dragonstone_castle_beach), getString(R.string.mussenden_temple), -6.810731, 55.167690, R.drawable.mussenden_temple));
        locationArrayList.add(new Location(getString(R.string.king_landing_road), getString(R.string.the_dark_hedges), -6.380715, 55.134564, R.drawable.the_dark_hedges));
        locationArrayList.add(new Location(getString(R.string.lordsport), getString(R.string.ballintoy_harbour), -6.368850, 55.244179, R.drawable.ballintoy_harbour));
    }
}
