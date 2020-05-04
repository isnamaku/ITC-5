package com.example.task5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class List extends AppCompatActivity {


    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataSet;
    Button btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        btnInfo = findViewById(R.id.btn_info);

        dataSet = new  ArrayList<>();
        iniDataset();

        rvView = findViewById(R.id.rv_main);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new Adapter(dataSet);
        rvView.setAdapter(adapter);

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                switch (a.getId()){
                    case R.id.btn_info :
                        Intent b = new Intent(List.this,Info.class);
                        startActivity(b);
                }
            }
        });


    }

    private void iniDataset() {
        dataSet.add("Budi Ariadi");
        dataSet.add("Ani Rohmah");
        dataSet.add("Dian Daniati");
        dataSet.add("Ali Noah");
        dataSet.add("Ida Gusta");
        dataSet.add("Hadi Kusumi");
        dataSet.add("Ina Halo");
        dataSet.add("Dipo Lio");
        dataSet.add("Giring Nidja");
        dataSet.add("Steffan Wilain");
        dataSet.add("Yuki Kota");
        dataSet.add("Usus ");
        dataSet.add("Raditya Diko");
        dataSet.add("Bunga Catri Listira");
        dataSet.add("Bambang Pamangkus");

    }


}
