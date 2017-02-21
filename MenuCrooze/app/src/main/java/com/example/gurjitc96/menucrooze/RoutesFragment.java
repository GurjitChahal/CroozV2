package com.example.gurjitc96.menucrooze;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RoutesFragment extends Fragment {


    public RoutesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.routes_list, container, false);

        ArrayList<RouteCard> routeCards = new ArrayList<RouteCard>();

        for(int i = 0; i < 120; i++){
            if(i%2 == 0) {
                routeCards.add(new RouteCard(R.drawable.bike_1, R.drawable.easy_difficulty, R.id.rating));
            }
            else{
                routeCards.add(new RouteCard(R.drawable.bike_3, R.drawable.medium_difficulty, R.id.rating));
            }
        }

        RouteCardAdapter adapter = new RouteCardAdapter(getActivity(), routeCards);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        GridView gridView = (GridView) rootView.findViewById(R.id.gridview);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        gridView.setAdapter(adapter);

        return rootView;
    }


}
