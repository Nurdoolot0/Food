package com.example.food;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.food.databinding.ActivityMainBinding;
import com.example.food.drinks.DrinksActivity;
import com.example.food.food.FoodActivity;
import com.example.food.desserts.DessertsActivity;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonFood.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FoodActivity.class);
            startActivity(intent);
        });

        binding.buttonDrinks.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DrinksActivity.class);
            startActivity(intent);
        });

        binding.buttonDesserts.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DessertsActivity.class);
            startActivity(intent);
        });
    }
}
