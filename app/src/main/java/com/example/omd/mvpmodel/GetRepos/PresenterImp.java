package com.example.omd.mvpmodel.GetRepos;

import com.example.omd.mvpmodel.Models.ReposModel;

import java.util.List;

/**
 * Created by Delta on 06/12/2017.
 */

public class PresenterImp implements Presenter,Model_interactor.OnCompleateListner {
    DisplayReposView view;
    ModelImp modelImp;

    public PresenterImp(DisplayReposView view) {
        this.view = view;
        modelImp = new ModelImp();


    }

    @Override
    public void GetRepos() {
        if (view!=null)
        {
            view.ShowProgress();
            view.HideRecyclerView();
            modelImp.getRepos(this);

        }
    }

    @Override
    public void OnSuccess(List<ReposModel> reposModels) {
        if (view!=null)
        {
            if (reposModels.size()>0)
            {
                view.OnSuccess(reposModels);
                view.HideProgress();
                view.ShowRecyclerView();
            }
            else
            {
                if (view!=null){}

                view.HideProgress();
                view.HideRecyclerView();

            }
        }

    }

    @Override
    public void OnFailed(String Error) {
        if (view!=null)
        {
            view.HideRecyclerView();
            view.HideProgress();
            view.OnFailed(Error);
        }


    }
}
