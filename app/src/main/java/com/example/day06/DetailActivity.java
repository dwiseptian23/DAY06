package com.example.day06;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.EdgeToEdge;

public class DetailActivity extends AppCompatActivity {
    private String nama;
    private int logo;
    private String detailTambahan1;
    private String detailTambahan2;
    private String detailTambahan3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        EdgeToEdge.enable(this);
        nama = getIntent().getStringExtra("nama");
        logo = getIntent().getIntExtra("logo", 0);
        detailTambahan1 = getIntent().getStringExtra("detail_tambahan1");
        detailTambahan2 = getIntent().getStringExtra("detail_tambahan2");
        detailTambahan3 = getIntent().getStringExtra("detail_tambahan3");
        TextView namaDetail = findViewById(R.id.nama_detail);
        ImageView logoDetail = findViewById(R.id.logo_detail);
        TextView detailTambahan1TextView = findViewById(R.id.harga);
        TextView detailTambahan2TextView = findViewById(R.id.type);
        TextView detailTambahan3TextView = findViewById(R.id.mesin);
        namaDetail.setText(nama);
        logoDetail.setImageResource(logo);
        detailTambahan1TextView.setText(detailTambahan1);
        detailTambahan2TextView.setText(detailTambahan2);
        detailTambahan3TextView.setText(detailTambahan3);
    }
    public void shareItem(View view) {
        String textToShare = "Nama: " + nama + "\n" + detailTambahan1 + "\n" +  detailTambahan2 + "\n" + detailTambahan3;
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, textToShare);
        startActivity(Intent.createChooser(shareIntent, "Bagikan"));
    }
}