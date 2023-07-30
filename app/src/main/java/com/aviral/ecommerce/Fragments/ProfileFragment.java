package com.aviral.ecommerce.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aviral.ecommerce.Activities.SellerPanelActivity;
import com.aviral.ecommerce.R;
import com.aviral.ecommerce.databinding.FragmentProfileBinding;

public class ProfileFragment extends Fragment {

    public ProfileFragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentProfileBinding binding = FragmentProfileBinding.inflate(inflater, container, false);

        binding.btnSellerPanel.setOnClickListener(view -> startActivity(new Intent(requireContext(), SellerPanelActivity.class)));

        return binding.getRoot();
    }
}