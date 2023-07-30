package com.aviral.ecommerce.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.aviral.ecommerce.R;
import com.aviral.ecommerce.databinding.ActivityPaymentBinding;
import com.google.android.material.snackbar.Snackbar;

public class PaymentActivity extends AppCompatActivity {

    private ActivityPaymentBinding binding;

    private boolean isPayPalSelected = false,
            isPaytmSelected = false,
            isBankAccountSelected = false,
            isGooglePaySelected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPaymentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.paypal.setOnClickListener(view -> {
            resetAllPaymentMethods();

            binding.paypal.setBackground(AppCompatResources.getDrawable(this,
                    R.drawable.payment_method_selected_background));
            binding.tvPaypal.setTextColor(Color.parseColor("#FFFFFFFF"));

            isPayPalSelected = true;
        });

        binding.paytm.setOnClickListener(view -> {
            resetAllPaymentMethods();

            binding.paytm.setBackground(AppCompatResources.getDrawable(this,
                    R.drawable.payment_method_selected_background));
            binding.tvPaytm.setTextColor(Color.parseColor("#FFFFFFFF"));

            isPaytmSelected = true;
        });

        binding.google.setOnClickListener(view -> {
            resetAllPaymentMethods();

            binding.google.setBackground(AppCompatResources.getDrawable(this,
                    R.drawable.payment_method_selected_background));
            binding.tvGooglePay.setTextColor(Color.parseColor("#FFFFFFFF"));

            isGooglePaySelected = true;
        });

        binding.bank.setOnClickListener(view -> {
            resetAllPaymentMethods();

            binding.bank.setBackground(AppCompatResources.getDrawable(this,
                    R.drawable.payment_method_selected_background));
            binding.tvBankAccount.setTextColor(Color.parseColor("#FFFFFFFF"));

            isBankAccountSelected = true;
        });

        binding.btnContinue.setOnClickListener(view -> checkAndNavigateToWithdrawActivity());

    }

    private void checkAndNavigateToWithdrawActivity() {

        String paymentMode = "";

        if (isPaytmSelected) {

            paymentMode = getString(R.string.paytm);

        } else if (isPayPalSelected) {

            paymentMode = getString(R.string.paypal);

        } else if (isGooglePaySelected) {

            paymentMode = getString(R.string.gpay);

        } else if (isBankAccountSelected) {

            paymentMode = getString(R.string.bank_account);

        }

        if (isPayPalSelected || isPaytmSelected || isGooglePaySelected || isBankAccountSelected) {

            Intent intent = new Intent(this, WithdrawActivity.class);
            intent.putExtra(getString(R.string.payment_method), paymentMode);
            startActivity(intent);

        } else {
            Snackbar.make(
                    binding.paymentLayout,
                    "Please Select a payment method",
                    Snackbar.LENGTH_SHORT
            ).show();
        }

    }

    private void resetAllPaymentMethods() {

        binding.paypal.setBackground(AppCompatResources.getDrawable(this,
                R.drawable.payment_method_unselected_background));
        binding.tvPaypal.setTextColor(Color.parseColor("#FF000000"));

        binding.paytm.setBackground(AppCompatResources.getDrawable(this,
                R.drawable.payment_method_unselected_background));
        binding.tvPaytm.setTextColor(Color.parseColor("#FF000000"));

        binding.bank.setBackground(AppCompatResources.getDrawable(this,
                R.drawable.payment_method_unselected_background));
        binding.tvBankAccount.setTextColor(Color.parseColor("#FF000000"));

        binding.google.setBackground(AppCompatResources.getDrawable(this,
                R.drawable.payment_method_unselected_background));
        binding.tvGooglePay.setTextColor(Color.parseColor("#FF000000"));

        isPayPalSelected = false;
        isPaytmSelected = false;
        isGooglePaySelected = false;
        isBankAccountSelected = false;

    }
}