package br.com.klauskpm.tourguide;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends CategoryFragment {


    public EventsFragment() {
        // Required empty public constructor

        setTitleResourceId(R.string.category_events);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        locationArrayList.add(new Location("Rua da Quitanda", -74.1231, 42.1231));
    }
}
