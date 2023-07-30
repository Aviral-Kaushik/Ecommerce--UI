package com.aviral.ecommerce.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aviral.ecommerce.Adapters.CartProductAdapter;
import com.aviral.ecommerce.Models.CartProduct;
import com.aviral.ecommerce.R;
import com.aviral.ecommerce.databinding.FragmentCartBinding;

import java.util.ArrayList;

public class CartFragment extends Fragment {

    private FragmentCartBinding binding;

    public CartFragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentCartBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onStart() {
        super.onStart();

        setUpCartAdapter();
    }

    private void setUpCartAdapter() {

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
                requireContext(), LinearLayoutManager.VERTICAL, false
        );

        binding.cardRecyclerView.setLayoutManager(linearLayoutManager);

        CartProductAdapter cartProductAdapter = new CartProductAdapter(cartProducts);

        binding.cardRecyclerView.setAdapter(cartProductAdapter);

    }
}