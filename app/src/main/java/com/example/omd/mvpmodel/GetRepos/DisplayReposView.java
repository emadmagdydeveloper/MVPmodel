package com.example.omd.mvpmodel.GetRepos;

import com.example.omd.mvpmodel.Models.ReposModel;

import java.util.List;

/**
 * Created by Delta on 06/12/2017.
 */

public interface DisplayReposView {
    void ShowProgress();
    void HideProgress();
    void ShowRecyclerView();
    void HideRecyclerView();
    void OnSuccess(List<ReposModel> reposModels);
    void OnFailed(String message);
}
