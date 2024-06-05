package com.example.day06;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.day06.Model;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<com.example.day06.Model> models;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
        recyclerView = findViewById(R.id.recyclerview);
        adapter = new Adapter(MainActivity.this, models);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void getData() {
        models = new ArrayList<>();
        models.add(new Model("Gozeal | Hoodie | Drain",R.drawable.hooide1,"Harga: RP. 279.000.00", "Type: Hoodie", "Bahan: Cotton Fleece 330GSM"));
        models.add(new Model("Gozeal | Hoodie | Forgot",R.drawable.hoodie2,"Harga: RP. 279.000.00", "Type: Hoodie", "Bahan: Cotton Fleece 330GSM"));
        models.add(new Model("Gozeal | Hoodie | Washed Gone",R.drawable.hooide3,"Harga: RP. 279.000.00", "Type: Hoodie", "Bahan: Cotton Fleece 330GSM"));
        models.add(new Model("Gozeal | Hoodie | Tone Dijon Beige",R.drawable.hoodie4,"Harga: RP. 279.000.00", "Type: Hoodie", "Bahan: Cotton Fleece 330GSM"));
        models.add(new Model("Gozeal | Hoodie | Lucid",R.drawable.hoodie5,"Harga: RP. 279.000.00", "Type: Hoodie", "Bahan: Cotton Fleece 330GSM"));
        models.add(new Model("Gozeal | Tees | Brown",R.drawable.kaos1,"Harga: RP. 119.000.00", "Type: Tees", "Bahan: Cotton Combed"));
        models.add(new Model("Gozeal | Tees | Small Step",R.drawable.kaos2,"Harga: RP. 119.000.00", "Type: Tees", "Bahan: Cotton Combed"));
        models.add(new Model("Gozeal | Tees | Bella White",R.drawable.kaos3,"Harga: RP. 119.000.00", "Type: Tees", "Bahan: Cotton Combed"));
        models.add(new Model("Gozeal | Tees | Cats",R.drawable.kaos4 ,"Harga: RP. 119.000.00", "Type: Tees", "Bahan: Cotton Combed"));
        models.add(new Model("Gozeal | Tees | Washed Trace",R.drawable.kaos5,"Harga: RP. 119.000.00", "Type: Tees", "Bahan: Cotton Combed"));
        models.add(new Model("Gozeal | Head Wear | Nicco",R.drawable.topi1,"Harga: RP. 100.000.00", "Type: 5 Panels", "Bahan: Nylon"));
        models.add(new Model("Gozeal | Head Wear | Fire",R.drawable.topi2,"Harga: RP. 100.000.00", "Type: Trucker hat", "Bahan: Nylon"));
        models.add(new Model("Gozeal | Head Wear | Damian",R.drawable.topi3,"Harga: RP. 100.000.00", "Type: Trucker hat", "Bahan: Nylon"));
        models.add(new Model("Gozeal | Head Wear | Bear Black",R.drawable.topi4,"Harga: RP. 100.000.00", "Type: Polo caps", "Bahan: Nylon"));
        models.add(new Model("Gozeal | Head Wear | Slay",R.drawable.topi5,"Harga: RP. 100.000.00", "Type: Polo caps", "Bahan: Nylon"));
    }
}