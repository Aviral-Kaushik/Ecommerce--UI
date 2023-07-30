package com.aviral.ecommerce.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.aviral.ecommerce.Activities.ProductViewActivity;
import com.aviral.ecommerce.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class HomeProductAdapter extends BaseAdapter {

    private final Context context;
    private final ArrayList<Integer> images;

    public HomeProductAdapter(Context context, ArrayList<Integer> images) {
        this.context = context;
        this.images = images;
    }


    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater
                    = (LayoutInflater)context.getSystemService(
                    Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.layout_product_home,
                    viewGroup,false);
        }

        ImageView productImage = view.findViewById(R.id.product_modify_image);

        ConstraintLayout cl = view.findViewById(R.id.product);

        Glide.with(context)
                .load(images.get(i))
                .into(productImage);

        cl.setOnClickListener(view1 ->
                context.startActivity(new Intent(context, ProductViewActivity.class)));

        return view;
    }
}
