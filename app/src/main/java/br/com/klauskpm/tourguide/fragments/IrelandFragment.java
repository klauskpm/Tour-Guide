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

        locationArrayList.add(new Location("Northern Forests", "Tollymore Forest Park", -5.942564, 54.219669));
        locationArrayList.add(new Location("Winterfell", "Ward Castle", -5.585427, 54.369072));
        locationArrayList.add(new Location("Dragonstone Castle beach", "Mussenden Temple", -6.810731, 55.167690));
        locationArrayList.add(new Location("King's Landing road", "The Dark Hedges", -6.380715, 55.134564));
        locationArrayList.add(new Location("Lordsport", "Ballintoy Harbour", -6.368850, 55.244179));
    }
}
