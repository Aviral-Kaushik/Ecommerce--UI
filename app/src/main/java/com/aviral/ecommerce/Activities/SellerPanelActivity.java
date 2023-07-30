package com.aviral.ecommerce.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.aviral.ecommerce.databinding.ActivitySellerPanelBinding;

public class SellerPanelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySellerPanelBinding binding = ActivitySellerPanelBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAddProduct.setOnClickListener(view -> startActivity(new Intent(this, AddNewProductActivity.class)));

        binding.btnModifyProduct.setOnClickListener(view -> startActivity(new Intent(this, ModifyExistingProductActivity.class)));

        binding.btnWithdrawBalance.setOnClickListener(view -> startActivity(new Intent(this, PaymentActivity.class)));

        binding.btnExit.setOnClickListener(view -> finish());
    }
}