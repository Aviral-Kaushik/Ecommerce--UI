package com.aviral.ecommerce.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.aviral.ecommerce.databinding.ActivitySignInBinding;

public class SignInActivity extends AppCompatActivity {

    private ActivitySignInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.exit.setOnClickListener(view -> startActivity(new Intent(this, WelcomeActivity.class)));

        binding.btnSignIn.setOnClickListener(view -> startActivity(new Intent(this, MainActivity.class)));

        binding.navigateToSignUp.setOnClickListener(view -> startActivity(new Intent(this, SignUpActivity.class)));
    }
}