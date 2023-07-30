package com.aviral.ecommerce.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;

import com.aviral.ecommerce.R;
import com.aviral.ecommerce.databinding.ActivityProductViewBinding;

public class ProductViewActivity extends AppCompatActivity {

    private ActivityProductViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProductViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.dummyText.setMovementMethod(new ScrollingMovementMethod());

        binding.productRating.setRating(3.7f);

        binding.back.setOnClickListener(view -> finish());

        binding.btnDescription.setOnClickListener(view -> {
            clearAllSelection();

            binding.btnDescription.setTextColor(Color.parseColor("#ffffff"));
            binding.btnDescription.setBackground(AppCompatResources.getDrawable(this, R.drawable.btn_log_in_background));

            binding.dummyText.setText(getString(R.string.dummy_text_small));

        });

        binding.btnMaterials.setOnClickListener(view -> {
            clearAllSelection();

            binding.btnMaterials.setTextColor(Color.parseColor("#ffffff"));
            binding.btnMaterials.setBackground(AppCompatResources.getDrawable(this, R.drawable.btn_log_in_background));

            binding.dummyText.setText(getString(R.string.dummy_text_medium));

        });

        binding.btnReviews.setOnClickListener(view -> {
            clearAllSelection();

            binding.btnReviews.setTextColor(Color.parseColor("#ffffff"));
            binding.btnReviews.setBackground(AppCompatResources.getDrawable(this, R.drawable.btn_log_in_background));

            binding.dummyText.setText(getString(R.string.dummy_text_large));

        });

    }

    private void clearAllSelection() {

        binding.btnDescription.setTextColor(Color.parseColor("#000000"));
        binding.btnDescription.setBackground(null);

        binding.btnMaterials.setTextColor(Color.parseColor("#000000"));
        binding.btnMaterials.setBackground(null);

        binding.btnReviews.setTextColor(Color.parseColor("#000000"));
        binding.btnReviews.setBackground(null);

    }
}