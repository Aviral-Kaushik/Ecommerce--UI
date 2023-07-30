package com.aviral.ecommerce.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.aviral.ecommerce.databinding.ActivityAddNewProductBinding;

public class AddNewProductActivity extends AppCompatActivity {

    private ActivityAddNewProductBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddNewProductBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}