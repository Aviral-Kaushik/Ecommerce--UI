package com.aviral.ecommerce.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.aviral.ecommerce.Adapters.ModifyProductAdapter;
import com.aviral.ecommerce.Models.CartProduct;
import com.aviral.ecommerce.R;
import com.aviral.ecommerce.databinding.ActivityModifyExistingProductBinding;

import java.util.ArrayList;

public class ModifyExistingProductActivity extends AppCompatActivity {

    private ActivityModifyExistingProductBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityModifyExistingProductBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupModifyAdapter();
    }

    private void setupModifyAdapter() {
        ArrayList<CartProduct> cartProducts = new ArrayList<>();

        cartProducts.add(new CartProduct(
                R.drawable.ic_cart_product1,
                "Sitron Sofa",
                "10,000",
                3.7f
        ));

        cartProducts.add(new CartProduct(
                R.drawable.ic_cart_product2,
                "Breitling - Shark ",
                "5,50",
                4.3f
        ));

        cartProducts.add(new CartProduct(
                R.drawable.ic_cart_product3,
                "Breitling - Vintage",
                "4,000",
                4.5f
        ));

        cartProducts.add(new CartProduct(
                R.drawable.ic_cart_product4,
                "Calleen",
                "9,000",
                3.5f
        ));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                this, LinearLayoutManager.VERTICAL, false
        );

        binding.modifyRecyclerView.setLayoutManager(linearLayoutManager);

        ModifyProductAdapter cartProductAdapter = new ModifyProductAdapter(cartProducts);

        binding.modifyRecyclerView.setAdapter(cartProductAdapter);
    }
}