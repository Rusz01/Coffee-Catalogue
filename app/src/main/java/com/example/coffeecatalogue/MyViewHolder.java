package com.example.coffeecatalogue;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView img;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.imageView);

    }
}
