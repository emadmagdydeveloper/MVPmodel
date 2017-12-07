package com.example.omd.mvpmodel.Services;

import com.example.omd.mvpmodel.Models.ReposModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Delta on 06/12/2017.
 */

public interface ReposServices {
    @GET("/users/{user}/repos")
    Call<List<ReposModel>> getReposForUser(@Path("user") String user);
}
