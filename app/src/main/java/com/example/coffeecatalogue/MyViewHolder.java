package com.example.coffeecatalogue;

import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageButton img;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.imageView);

    }
}
