package com.example.omd.mvpmodel.GetRepos;

import com.example.omd.mvpmodel.Models.ReposModel;

import java.util.List;

/**
 * Created by Delta on 06/12/2017.
 */

public interface Model_interactor {
    interface OnCompleateListner
    {
        void OnSuccess(List<ReposModel> reposModels);
        void OnFailed(String Error);
    }
    void getRepos(Model_interactor.OnCompleateListner listner);
}
