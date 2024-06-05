package com.example.day06;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<com.example.day06.Model> model;
    private Context context;
    public Adapter(Context context, ArrayList<com.example.day06.Model> model) {
        this.context = context;
        this.model = model;
    }
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.namaLogo.setText(model.get(position).getNama());
        holder.logo.setImageResource(model.get(position).getLogo());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("nama", model.get(position).getNama());
                intent.putExtra("logo", model.get(position).getLogo());
                intent.putExtra("detail_tambahan1", model.get(position).getDetailTambahan1());
                intent.putExtra("detail_tambahan2", model.get(position).getDetailTambahan2());
                intent.putExtra("detail_tambahan3", model.get(position).getDetailTambahan3());
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return model.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView namaLogo;
        ImageView logo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namaLogo = itemView.findViewById(R.id.nama_logo);
            logo = itemView.findViewById(R.id.logo);
        }
    }
}