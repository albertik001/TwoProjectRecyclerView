package com.geektech.twoprojectrecyclerview;

import android.content.pm.LauncherActivityInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<PersonHolder> {
    ArrayList<String> names = new ArrayList<>();

    public Adapter(ArrayList<String> names) {
        this.names = names;
    }

    @NonNull
    @Override
    public PersonHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PersonHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PersonHolder holder, int position) {
        holder.bind(names.get(position));

    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}
