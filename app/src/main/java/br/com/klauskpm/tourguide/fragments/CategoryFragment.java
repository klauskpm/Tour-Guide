package br.com.klauskpm.tourguide.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import br.com.klauskpm.tourguide.Location;
import br.com.klauskpm.tourguide.Map;
import br.com.klauskpm.tourguide.R;
import br.com.klauskpm.tourguide.adapters.LocationAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class CategoryFragment extends Fragment {
    private int mTitleResourceId;
    protected ArrayList<Location> locationArrayList = new ArrayList<Location>();

    /**
     * Instantiates a new Category fragment.
     */
    public CategoryFragment() {
        // Required empty public constructor
    }

    /**
     * Gets title resource id.
     *
     * @return the title resource id
     */
    public int getTitleResourceId() {
        return mTitleResourceId;
    }

    /**
     * Sets title resource id.
     *
     * @param mTitleResourceId the title resource id
     */
    public void setTitleResourceId(int mTitleResourceId) {
        this.mTitleResourceId = mTitleResourceId;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.simple_list, container, false);

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), R.layout.simple_item,
                locationArrayList);

        ListView simpleList = (ListView) rootView.findViewById(R.id.simple_list);
        assert simpleList != null;
        simpleList.setAdapter(locationAdapter);

        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Location location = locationArrayList.get(position);
                Log.d("TAGE", "onItemClick: " + location.getRealPlaceTitle());
                Map.callIntent(getContext(), location.getLat(), location.getLong(),
                        location.getRealPlaceTitle());
            }
        });

        return rootView;
    }

}
