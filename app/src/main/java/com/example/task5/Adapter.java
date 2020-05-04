package com.example.task5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<String> rvData;

    public Adapter(ArrayList <String> inputData){
            rvData = inputData;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_rv, parent,false);
        ViewHolder vH = new ViewHolder(v);
        return vH;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final  String name = rvData.get(position);
        holder.tvTitle.setText(rvData.get(position));
        holder.tvSubtitle.setText("12318000" + position);
    }


    @Override
    public int getItemCount() {
        return rvData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvSubtitle;
        TextView tvTitle;

        public ViewHolder(@NonNull View v) {
            super(v);
            tvTitle = v.findViewById(R.id.tv_title);
            tvSubtitle = v.findViewById(R.id.tv_subtitle);

        }
    }
}
