package com.example.duy.recycleviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    ListView myListview;
    Arraydapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }
    public void initView(){
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.item);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        //DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,layoutManager.getOrientation());
        //recyclerView.addItemDecoration(dividerItemDecoration);
        ArrayList<Data> personArray = new ArrayList<>();
        personArray.add(new Data("Nguyen Van A", "1234345323"));
        personArray.add(new Data("Nguyen Van B", "2433425542"));
        personArray.add(new Data("Nguyen Van C", "2131545534"));
        personArray.add(new Data("Nguyen Van D", "4531231313"));
        myAdapter =new Arraydapter(personArray,this);
       // Arraydapter arraydapter = new Arraydapter(personArray,getApplicationContext());
        recyclerView.setAdapter(myAdapter);
    }

}
