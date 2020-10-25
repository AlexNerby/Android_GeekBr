package com.example.geekbrainsandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.VerticalViewHolder> {

    Context context;
    ArrayList<MainModels> mainModels;

    public VerticalAdapter(Context context, ArrayList<MainModels> mainModels) {
        this.context = context;
        this.mainModels = mainModels;
    }

    @NonNull
    @Override
    public VerticalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.vertical_list, parent, false);
        return new VerticalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VerticalViewHolder holder, int position) {
        holder.daysMonths.setText(mainModels.get(position).getDay());
    }

    @Override
    public int getItemCount() {
        return mainModels.size();
    }

    public class VerticalViewHolder extends RecyclerView.ViewHolder {

        TextView daysMonths;

        public VerticalViewHolder(@NonNull View itemView) {
            super(itemView);
            daysMonths = itemView.findViewById(R.id.day_weekly);

        }
    }
}
