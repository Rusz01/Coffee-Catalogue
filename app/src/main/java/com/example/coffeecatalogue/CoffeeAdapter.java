package com.example.coffeecatalogue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class CoffeeAdapter extends RecyclerView.Adapter<MyViewHolder>{

    Context context;
    ArrayList <Item> items;


    public CoffeeAdapter(Context context, ArrayList<Item> items) {
        this.context = context;
        this.items = items;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false));


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Item currentItem = items.get(position);

        holder.img.setImageResource(items.get(position).getImage());

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itemHeading = currentItem.getHeading();
                Toast.makeText(context, itemHeading, Toast.LENGTH_SHORT).show();
            }

;

        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
