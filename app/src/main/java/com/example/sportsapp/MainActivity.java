package com.example.sportsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements itemClickListener{

    RecyclerView recyclerView;
    List<ModelClass> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);

        list=new ArrayList<>();

        list.add(new ModelClass(R.drawable.basketball, "Basketball"));
        list.add(new ModelClass(R.drawable.football, "Football"));
        list.add(new ModelClass(R.drawable.ping, "Ping"));
        list.add(new ModelClass(R.drawable.tennis, "Tennis"));
        list.add(new ModelClass(R.drawable.volley, "Volley"));

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        AdapterClass adapterClass=new AdapterClass(list, this, this);
        recyclerView.setAdapter(adapterClass);
    }

    @Override
    public void onItemClickListener(ModelClass modelClass) {
        Toast.makeText(this, modelClass.getName(), Toast.LENGTH_SHORT).show();
    }
}