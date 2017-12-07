package com.example.omd.mvpmodel.DisplayDetails;

/**
 * Created by Delta on 06/12/2017.
 */

public class PresenterImp implements Presenter {
    DisplayDetailsView view;
    DetailsModelImp detailsModelImp;

    public PresenterImp(DisplayDetailsView view) {
        this.view = view;
        detailsModelImp =new DetailsModelImp();
    }

    @Override
    public void getDetails() {

        if (detailsModelImp.getDetails()!=null)
        {
            view.setDetalis(detailsModelImp.getDetails());
        }
        else
            {
                view.setEmptyDetails();
            }
    }
}
