package com.example.coffeecatalogue;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList <Item> items;
    ViewPager2 viewPager;

//    TextView mheading, mdescription;
//    ImageView mimageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        items = new ArrayList<>();
        populateCoffeeList();

        // Set the adapter for the RecyclerView
        CoffeeAdapter adapter = new CoffeeAdapter(this, items);
        recyclerView.setAdapter(adapter);

        viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(items);
        viewPager.setAdapter(viewPagerAdapter);



    }





        private void populateCoffeeList() {
        items.add(new Item(
                "V60",
                "The Hario V60 is a pour over device. And what is pour over? It’s a manual way of making filter coffee where you pour hot water over your ground coffee. Gravity is your friend here, as the water trickles through the grounds and into your mug or container below. The coffee sits in a filter, separating the brewed coffee from the grounds.",
                R.drawable.v60));

        items.add(new Item(
                "Chemex",
                "The Chemex coffeemaker consists of an hourglass-shaped glass flask with a conical funnel-like neck and proprietary filters, made of bonded paper. The thicker paper of the Chemex filters removes most of the coffee oils and makes coffee that is much \"cleaner\" than coffee brewed in other coffee-making systems.",
                R.drawable.chemex));
        items.add(new Item(
                "Syphon",
                "The coffee aroma is more intense. Siphon brewing method enhances the coffee aroma more than many other brewing methods. Most importantly, it is actually unique and fun experience to watch this old process of brewing. Fascination comes when art and science intersects",
                R.drawable.syphon));
        items.add(new Item(
                "Aeropress",
                "The AeroPress is a manual coffeemaker invented by Alan Adler, founder of AeroPress, Inc. It consists of a cylindrical chamber, and a plunger with an airtight silicone seal, similar to a syringe. Ground coffee beans and water are steeped inside, then forced through a filter at the bottom of the chamber by pressing the plunger down through the chamber.",
                R.drawable.coffee));
    }

}
