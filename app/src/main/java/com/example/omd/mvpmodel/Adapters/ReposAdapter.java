package com.example.omd.mvpmodel.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.omd.mvpmodel.DisplayDetails.DetailsActivity;
import com.example.omd.mvpmodel.DisplayDetails.DetailsModelImp;
import com.example.omd.mvpmodel.Models.ReposModel;
import com.example.omd.mvpmodel.R;

import java.util.List;

/**
 * Created by Delta on 06/12/2017.
 */

public class ReposAdapter extends RecyclerView.Adapter<ReposAdapter.viewHolder>
{
    List<ReposModel>modelList;
    Context mContext;

    public ReposAdapter(List<ReposModel> modelList, Context mContext) {
        this.modelList = modelList;
        this.mContext = mContext;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycler_row,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(final viewHolder holder, int position) {
        ReposModel model = modelList.get(position);
        holder.BindData(model);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DetailsModelImp  detailsModelImp = new DetailsModelImp();
                ReposModel  reposModel = modelList.get(holder.getAdapterPosition());
                detailsModelImp.SetDetails(reposModel);
                mContext.startActivity(new Intent(mContext, DetailsActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelList.size()>0?modelList.size():0;
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        TextView reposName;
        public viewHolder(View itemView) {
            super(itemView);
            reposName = (TextView) itemView.findViewById(R.id.reposName);
        }
        public void BindData(ReposModel model)
        {
            reposName.setText(model.getName().toString());
        }
    }
}

