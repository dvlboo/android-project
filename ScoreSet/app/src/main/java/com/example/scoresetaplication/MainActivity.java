package com.example.scoresetaplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    RecyclerView.Adapter rvAdapter;
    RecyclerView.LayoutManager rvLayoutManager;
    ArrayList<ItemModel> itemData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv_ChoiceSports);
        rv.setHasFixedSize(true);

        rvLayoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(rvLayoutManager);
//        rv.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        itemData = new ArrayList<>();
        for (int i = 0; i < MyItem.imageList.length; i++){
            itemData.add(new ItemModel(
                    MyItem.imageList[i],
                    MyItem.TitleList[i],
                    MyItem.DescList[i])
            );
        }

        rvAdapter = new RvAdapter(this, itemData);
        rv.setAdapter(rvAdapter);
    }
}