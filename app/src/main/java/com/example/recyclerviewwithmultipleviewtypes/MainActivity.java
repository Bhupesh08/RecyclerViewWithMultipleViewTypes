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

        adapter = new Adapter(list, MainActivity.this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }
}