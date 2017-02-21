package com.example.gurjitc96.menucrooze;

/**
 * Created by Malachi on 2/20/2017.
 */

public class RouteCard {

    private int bikeText = R.id.type_text;

    private int mBikeTypeId;

    private int difficultyText = R.id.difficulty_text;

    private int mDifficultyId;

    private int ratingText = R.id.rating_text;

    private int mratingId;

    RouteCard(int bikeTypeId, int difficultyId, int ratingBarId){
        mBikeTypeId = bikeTypeId;
        mDifficultyId = difficultyId;
        mratingId = ratingBarId;
    }

    public int getBikeText(){

        return bikeText;
    }
    public int getmBikeTypeId (){

        return mBikeTypeId;
    }

    public int getDifficultyText(){

        return difficultyText;
    }

    public int getmDifficultyId(){

        return mDifficultyId;
    }

    public int getRatingText(){

        return ratingText;
    }
    public int getratingBarId(){

        return mratingId;
    }
}
