package com.example.recyclerviewwithmultipleviewtypes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;

    ArrayList<ModalClass> list;
    ArrayList<ChildModal> sitesVisited;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rv_parent);

        list = new ArrayList<>();

        list.add(new ModalClass(ModalClass.LAYOUT_ONE, R.drawable.google));
        list.add(new ModalClass(ModalClass.LAYOUT_TWO));
        list.add(new ModalClass(ModalClass.LAYOUT_THREE, R.drawable.imga, "dbjbjud  juwdgbujw gwugduj wggwudgh ugwiughi udgwi"));
        list.add(new ModalClass(ModalClass.LAYOUT_THREE, R.drawable.imgc, "dbjbjud  juwdgbujw gwugduj wggwudgh ugwiughi udgwi"));
        list.add(new ModalClass(ModalClass.LAYOUT_THREE, R.drawable.imga, "dbjbjud  juwdgbujw gwugduj wggwudgh ugwiughi udgwi"));

        sitesVisited.add(new ChildModal(R.drawable.imga, "chatGpt"));
        sitesVisited.add(new ChildModal(R.drawable.imga, "purplle"));
        sitesVisited.add(new ChildModal(R.drawable.imga, "github"));
        sitesVisited.add(new ChildModal(R.drawable.imga, "wikipedia"));
        sitesVisited.add(new ChildModal(R.drawable.imga, "facebook"));
        sitesVisited.add(new ChildModal(R.drawable.imga, "flipkart"));
        sitesVisited.add(new ChildModal(R.drawable.imga, "amazon"));

        adapter = new Adapter(list, MainActivity.this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }
}