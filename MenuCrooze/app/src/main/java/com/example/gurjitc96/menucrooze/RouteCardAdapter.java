package com.example.gurjitc96.menucrooze;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Malachi on 2/20/2017.
 */

public class RouteCardAdapter extends ArrayAdapter<RouteCard>{



    public RouteCardAdapter(Context context, ArrayList<RouteCard> routeCards) {
        super(context, 0, routeCards);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View routeCardView = convertView;
        if (routeCardView == null) {
            routeCardView = LayoutInflater.from(getContext()).inflate(
                    R.layout.route_card, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        RouteCard currentRouteCard = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView bikeType = (TextView) routeCardView.findViewById(R.id.type_text);
        //bikeType.setText(currentRouteCard.getBikeText());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView bikeTypeView = (ImageView) routeCardView.findViewById(R.id.bike_type);
        // Check if an image is provided for this word or not
        bikeTypeView.setImageResource(currentRouteCard.getmBikeTypeId());

        TextView difficulty = (TextView) routeCardView.findViewById(R.id.difficulty_text);
       // difficulty.setText(currentRouteCard.getDifficultyText());

        ImageView difficultyView = (ImageView) routeCardView.findViewById(R.id.difficulty_scale);
        difficultyView.setImageResource(currentRouteCard.getmDifficultyId());

        TextView rating_text = (TextView) routeCardView.findViewById(R.id.rating_text);
        //rating_text.setText(currentRouteCard.getRatingText());

        RatingBar rating = (RatingBar) routeCardView.findViewById(R.id.rating);
        //rating.setRating(currentRouteCard.getratingBarId());

        return routeCardView;
    }
}


