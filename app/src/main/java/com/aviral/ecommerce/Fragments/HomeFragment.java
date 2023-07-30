package com.aviral.ecommerce.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aviral.ecommerce.Adapters.CategoryAdapter;
import com.aviral.ecommerce.Adapters.HomeProductAdapter;
import com.aviral.ecommerce.Models.Category;
import com.aviral.ecommerce.R;
import com.aviral.ecommerce.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public HomeFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        // Inflate the layout for this fragment
        return binding.getRoot();
    }

    @Override
    public void onStart() {
        super.onStart();

        setUpCategoryAdapter();
        setUpProductAdapter();
    }

    private void setUpProductAdapter() {

        ArrayList<Integer> images = new ArrayList<>();

        images.add(R.drawable.ic_product1);
        images.add(R.drawable.ic_product2);
        images.add(R.drawable.ic_product3);
        images.add(R.drawable.ic_product4);
        images.add(R.drawable.ic_product5);
        images.add(R.drawable.ic_product6);
        images.add(R.drawable.ic_product7);
        images.add(R.drawable.ic_product8);

        HomeProductAdapter homeProductAdapter = new HomeProductAdapter(requireContext(), images);
        binding.productsGridView.setAdapter(homeProductAdapter);

    }

    private void setUpCategoryAdapter() {

        ArrayList<Category> categories = new ArrayList<>();

        categories.add(new Category(
                "Home\nItems",
                "#89E581",
                R.drawable.ic_home_items
        ));

        categories.add(new Category(
                "Watches",
                "#CCDB71",
                R.drawable.ic_watch
        ));

        categories.add(new Category(
                "Laptops",
                "#9CF0E6",
                R.drawable.ic_computer_led
        ));

        categories.add(new Category(
                "Mobile\nPhones",
                "#3681F0",
                R.drawable.ic_smartphone
        ));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                requireContext(), LinearLayoutManager.HORIZONTAL, false
        );

        binding.categoriesRecyclerView.setLayoutManager(linearLayoutManager);

        CategoryAdapter categoryAdapter = new CategoryAdapter(categories);

        binding.categoriesRecyclerView.setAdapter(categoryAdapter);

    }
}