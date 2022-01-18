package com.geektech.twoprojectrecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonHolder extends RecyclerView.ViewHolder {
    private TextView tv_names;

    public PersonHolder(@NonNull View itemView) {
        super(itemView);
        tv_names = itemView.findViewById(R.id.personName);
    }

    public void bind(String name) {
        tv_names.setText(name);
    }
}
