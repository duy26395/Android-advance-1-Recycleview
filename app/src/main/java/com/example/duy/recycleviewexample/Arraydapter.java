package com.example.duy.recycleviewexample;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
import  java.util.ArrayList;

/**
 * Created by duy on 12/05/2017.
 */

public class Arraydapter extends RecyclerView.Adapter<Arraydapter.viewholder> {
    List<Data> dataArraList;
    Context Context;

    public Arraydapter(List<Data> dataArraList, Context context) {
        this.dataArraList = dataArraList;
        Context = context;
    }

    @Override
    public viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemview = layoutInflater.inflate(R.layout.list_item,parent,false);
        return new viewholder(itemview);
    }

    @Override
    public void onBindViewHolder(viewholder holder, int position) {
        holder.idtext.setText(dataArraList.get(position).getName());
        holder.idsdt.setText(dataArraList.get(position).getPhone());
    }

    @Override
    public int getItemCount() {
        return dataArraList.size();
    }
    public class viewholder extends RecyclerView.ViewHolder{
        TextView idtext;
        TextView idsdt;
        public viewholder(View itemView) {
            super(itemView);
        idtext = (TextView)itemView.findViewById(R.id.idtext);
            idsdt = (TextView)itemView.findViewById(R.id.idsdt);
        }
    }
}

