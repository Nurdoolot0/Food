package com.example.food.desserts;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.food.databinding.ItemDessertBinding;

import java.util.ArrayList;

public class DessertAdapter extends RecyclerView.Adapter<DessertAdapter.DessertViewHolder> {

    private ArrayList<Dessert> dessertList;

    public DessertAdapter(ArrayList<Dessert> dessertList) {
        this.dessertList = dessertList;
    }

    @NonNull
    @Override
    public DessertViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemDessertBinding binding = ItemDessertBinding.inflate(inflater, parent, false);
        return new DessertViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull DessertViewHolder holder, int position) {
        Dessert dessert = dessertList.get(position);
        holder.binding.dessertName.setText(dessert.getName());
        holder.binding.dessertDescription.setText(dessert.getDescription());

        Glide.with(holder.binding.dessertImage.getContext())
                .load(dessert.getImageUrl())
                .into(holder.binding.dessertImage);
    }

    @Override
    public int getItemCount() {
        return dessertList.size();
    }

    public static class DessertViewHolder extends RecyclerView.ViewHolder {
        ItemDessertBinding binding;

        public DessertViewHolder(ItemDessertBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
