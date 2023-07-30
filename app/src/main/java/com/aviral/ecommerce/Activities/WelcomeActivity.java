package com.aviral.ecommerce.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.aviral.ecommerce.databinding.ActivityWelcomeBinding;

public class WelcomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityWelcomeBinding binding = ActivityWelcomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogIn.setOnClickListener(view -> startActivity(new Intent(this, SignInActivity.class)));

        binding.btnSignIn.setOnClickListener(view -> startActivity(new Intent(this, SignUpActivity.class)));
    }
}