package com.example.food.drinks;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.food.databinding.ItemDrinkBinding;

import java.util.ArrayList;

public class DrinkAdapter extends RecyclerView.Adapter<DrinkAdapter.DrinkViewHolder> {

    private ArrayList<Drink> drinkList;

    public DrinkAdapter(ArrayList<Drink> drinkList) {
        this.drinkList = drinkList;
    }

    @NonNull
    @Override
    public DrinkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemDrinkBinding binding = ItemDrinkBinding.inflate(inflater, parent, false);
        return new DrinkViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull DrinkViewHolder holder, int position) {
        Drink drink = drinkList.get(position);
        holder.binding.drinkName.setText(drink.getName());
        holder.binding.drinkDescription.setText(drink.getDescription());

        Glide.with(holder.binding.drinkImage.getContext())
                .load(drink.getImageUrl())
                .into(holder.binding.drinkImage);
    }

    @Override
    public int getItemCount() {
        return drinkList.size();
    }

    public static class DrinkViewHolder extends RecyclerView.ViewHolder {
        ItemDrinkBinding binding;

        public DrinkViewHolder(ItemDrinkBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}

