package com.example.omd.mvpmodel.DisplayDetails;

import com.example.omd.mvpmodel.Models.ReposModel;

/**
 * Created by Delta on 06/12/2017.
 */

public interface DetailsModel {
    void SetDetails(ReposModel model);
    ReposModel getDetails();
}
