package com.aviral.ecommerce.Activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;

import com.aviral.ecommerce.R;
import com.aviral.ecommerce.databinding.ActivityWithdrawBinding;

public class WithdrawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityWithdrawBinding binding = ActivityWithdrawBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();

        if (intent.hasExtra(getString(R.string.payment_method))) {
            String paymentMethod = intent.getStringExtra(getString(R.string.payment_method));

            if (paymentMethod.equals(getString(R.string.paypal))) {

                binding.ivPaymentMode.setImageDrawable(AppCompatResources.getDrawable(this,
                        R.drawable.ic_paypal));

                binding.editTextName.setHint("Enter Paypal Account Holder Name");

                binding.textView13.setText("Paypal Id");

                binding.editTextAccount.setHint("Enter Paypal ID");

            } else if (paymentMethod.equals(getString(R.string.paytm))) {

                binding.ivPaymentMode.setImageDrawable(AppCompatResources.getDrawable(this,
                        R.drawable.ic_paytm));

                binding.editTextName.setHint("Enter Paytm's Account Name");

                binding.textView13.setText("Paytm UPI ID");

                binding.editTextAccount.setHint("Enter Paytm UPI ID");

            } else if (paymentMethod.equals(getString(R.string.gpay))) {

                binding.ivPaymentMode.setImageDrawable(AppCompatResources.getDrawable(this,
                        R.drawable.ic_google_pay));

                binding.editTextName.setHint("Enter GPay's Account Name");

                binding.textView13.setText("GPay UPI ID");

                binding.editTextAccount.setHint("Enter GPay UPI ID");

            }

        }

    }
}