package com.aviral.ecommerce.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.aviral.ecommerce.Fragments.CartFragment;
import com.aviral.ecommerce.Fragments.HomeFragment;
import com.aviral.ecommerce.Fragments.ProfileFragment;
import com.aviral.ecommerce.Fragments.SettingsFragment;
import com.aviral.ecommerce.R;
import com.aviral.ecommerce.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener{

    private final HomeFragment homeFragment = new HomeFragment();
    private final CartFragment cartFragment = new CartFragment();
    private final ProfileFragment profileFragment = new ProfileFragment();
    private final SettingsFragment settingsFragment = new SettingsFragment();

    private final FragmentManager fragmentManager = getSupportFragmentManager();

    public Fragment activeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        fragmentManager.beginTransaction()
                .add(R.id.frame_container, homeFragment, "Home Fragment")
                .commit();

        activeFragment = homeFragment;

        fragmentManager.beginTransaction()
                .add(R.id.frame_container, cartFragment, "Cart Fragment")
                .hide(cartFragment)
                .commit();

        fragmentManager.beginTransaction()
                .add(R.id.frame_container, profileFragment, "Profile Fragment")
                .hide(profileFragment)
                .commit();

        fragmentManager.beginTransaction()
                .add(R.id.frame_container, settingsFragment, "Settings Fragment")
                .hide(settingsFragment)
                .commit();

        binding.bottomNavigationBar.setOnItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.home) {

            fragmentManager.beginTransaction()
                    .hide(activeFragment)
                    .show(homeFragment)
                    .commit();
            activeFragment = homeFragment;

        } else if (item.getItemId() == R.id.orders) {

            fragmentManager.beginTransaction()
                    .hide(activeFragment)
                    .show(cartFragment)
                    .commit();
            activeFragment = cartFragment;

        } else if (item.getItemId() == R.id.profile) {

            fragmentManager.beginTransaction()
                    .hide(activeFragment)
                    .show(profileFragment)
                    .commit();
            activeFragment = profileFragment;

        } else if (item.getItemId() == R.id.settings) {

            fragmentManager.beginTransaction()
                    .hide(activeFragment)
                    .show(settingsFragment)
                    .commit();
            activeFragment = settingsFragment;


        }

        return true;
    }
}