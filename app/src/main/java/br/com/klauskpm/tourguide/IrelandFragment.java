package br.com.klauskpm.tourguide;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

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

        locationArrayList.add(new Location("Northern Forests", "Tollymore Forest Park"));
        locationArrayList.add(new Location("Winterfell", "Ward Castle"));
        locationArrayList.add(new Location("Dragonstone Castle beach", "Messendun Temple"));
        locationArrayList.add(new Location("King's Landing road", "Dark Hedges"));
        locationArrayList.add(new Location("Lordsport", "Ballintoy Harbour"));
    }
}
