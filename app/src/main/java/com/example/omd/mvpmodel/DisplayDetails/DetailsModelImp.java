package com.example.omd.mvpmodel.DisplayDetails;

import com.example.omd.mvpmodel.Models.ReposModel;

/**
 * Created by Delta on 06/12/2017.
 */

public class DetailsModelImp implements DetailsModel{
     static ReposModel mModel;
    @Override
    public void SetDetails(ReposModel model) {
        this.mModel = model;
    }

    @Override
    public ReposModel getDetails() {
        return mModel;
    }
}
