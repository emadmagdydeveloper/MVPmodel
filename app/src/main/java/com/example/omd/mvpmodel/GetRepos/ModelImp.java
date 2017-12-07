package com.example.omd.mvpmodel.GetRepos;

import com.example.omd.mvpmodel.Models.ReposModel;
import com.example.omd.mvpmodel.Services.ReposServices;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Delta on 06/12/2017.
 */

public class ModelImp implements Model_interactor {
    @Override
    public void getRepos(final OnCompleateListner listner) {
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.build();
        ReposServices services = retrofit.create(ReposServices.class);
        Call<List<ReposModel>> call = services.getReposForUser("fs-opensource");
        call.enqueue(new Callback<List<ReposModel>>() {
            @Override
            public void onResponse(Call<List<ReposModel>> call, Response<List<ReposModel>> response) {

                    List<ReposModel> list = response.body();
                    listner.OnSuccess(list);
            }

            @Override
            public void onFailure(Call<List<ReposModel>> call, Throwable t) {
                listner.OnFailed(t.getMessage());
            }
        });

    }

}
