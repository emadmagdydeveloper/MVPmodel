package com.example.omd.mvpmodel.DisplayDetails;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.omd.mvpmodel.Models.ReposModel;
import com.example.omd.mvpmodel.R;

public class DetailsActivity extends AppCompatActivity implements DisplayDetailsView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        PresenterImp imp = new PresenterImp(this);
        imp.getDetails();

    }


    @Override
    public void setEmptyDetails() {
        Toast.makeText(this, "emptyData", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setDetalis(ReposModel detalis) {
        Toast.makeText(this, "RepoName "+detalis.getName(), Toast.LENGTH_SHORT).show();
    }
}
