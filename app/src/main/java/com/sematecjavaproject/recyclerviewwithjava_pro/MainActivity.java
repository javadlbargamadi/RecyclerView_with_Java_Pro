package com.sematecjavaproject.recyclerviewwithjava_pro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ClickInterface {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    ArrayList<InfoModel> infoModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        infoModelArrayList = new ArrayList<>();
        infoModelArrayList.add(new InfoModel("Reza", "Akbari", 25));
        infoModelArrayList.add(new InfoModel("Mohammad", "Gholami", 24));
        infoModelArrayList.add(new InfoModel("Akbar", "Taghavi", 29));
        infoModelArrayList.add(new InfoModel("Hamed", "Soltani", 21));
        infoModelArrayList.add(new InfoModel("Sina", "Moosavi", 31));
        infoModelArrayList.add(new InfoModel("Kasra", "Shirazi", 32));
        infoModelArrayList.add(new InfoModel("Hanif", "Abbasi", 26));


        recyclerAdapter = new RecyclerAdapter(infoModelArrayList, this);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));


    }

    @Override
    public void onRecyclerViewItemClicked(String family, Integer age) {

        Toast.makeText(this, family + " " + age, Toast.LENGTH_SHORT).show();
    }
}
