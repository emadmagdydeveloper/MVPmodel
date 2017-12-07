package com.example.omd.mvpmodel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.omd.mvpmodel.Adapters.ReposAdapter;
import com.example.omd.mvpmodel.GetRepos.DisplayReposView;
import com.example.omd.mvpmodel.GetRepos.PresenterImp;
import com.example.omd.mvpmodel.Models.ReposModel;

import java.util.List;

public class MainActivity extends AppCompatActivity implements DisplayReposView{

    private ProgressBar progressBar;
    private RecyclerView mRecyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager manager;
    PresenterImp presenterImp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        mRecyclerView = (RecyclerView) findViewById(R.id.RecView);
        presenterImp = new PresenterImp(this);
        manager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setHasFixedSize(true);
        presenterImp.GetRepos();

    }


    @Override
    public void ShowProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void HideProgress() {
        progressBar.setVisibility(View.GONE);

    }

    @Override
    public void ShowRecyclerView() {
        mRecyclerView.setVisibility(View.VISIBLE);

    }

    @Override
    public void HideRecyclerView() {
        mRecyclerView.setVisibility(View.GONE);

    }

    @Override
    public void OnSuccess(List<ReposModel> reposModels) {
        adapter = new ReposAdapter(reposModels,MainActivity.this);
        mRecyclerView.setAdapter(adapter);
        Toast.makeText(this, "sucess", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnFailed(String message) {
        Toast.makeText(this, "Error "+message, Toast.LENGTH_SHORT).show();
    }
}
