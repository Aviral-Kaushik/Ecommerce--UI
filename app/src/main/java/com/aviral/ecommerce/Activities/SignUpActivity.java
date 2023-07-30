package com.aviral.ecommerce.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.aviral.ecommerce.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.exit.setOnClickListener(view -> startActivity(new Intent(this, WelcomeActivity.class)));

        binding.btnSignIn.setOnClickListener(view -> startActivity(new Intent(this, MainActivity.class)));

        binding.navigateToSignIn.setOnClickListener(view -> startActivity(new Intent(this, SignInActivity.class)));
    }
}