package com.geektech.twoprojectrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        names = new ArrayList<>();
        names.add("Ololo");
        names.add("Ololo");
        names.add("Ololo");
        names.add("Ololo");
        names.add("Ololo");
        names.add("Ololo");
        names.add("Ololo");
        names.add("Shamal");
        names.add("Shamal");
        names.add("Shamal");
        names.add("Shamal");
        names.add("Shamal");
        names.add("Shamal");
        names.add("Shamal");
        names.add("Shamal");
        adapter = new Adapter(names);
        recyclerView.setAdapter(adapter);

    }
}