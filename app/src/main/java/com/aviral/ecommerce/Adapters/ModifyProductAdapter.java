package com.aviral.ecommerce.Adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aviral.ecommerce.Activities.ProductViewActivity;
import com.aviral.ecommerce.Models.CartProduct;
import com.aviral.ecommerce.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ModifyProductAdapter extends RecyclerView.Adapter<ModifyProductAdapter.ViewHolder> {

    private final ArrayList<CartProduct> cartProducts;

    public ModifyProductAdapter(ArrayList<CartProduct> cartProducts) {
        this.cartProducts = cartProducts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(
                        R.layout.layout_modify_product,
                        parent,
                        false
                );

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.productTitle.setText(cartProducts.get(position).getProductName());
        holder.productPrice.setText(String.format("Rs %s", cartProducts.get(position).getProductPrice()));

        Glide.with(holder.itemView.getContext())
                .load(cartProducts.get(position).getProductImage())
                .into(holder.productImage);

    }

    @Override
    public int getItemCount() {
        return cartProducts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView productImage;
        private final TextView productTitle;
        private final TextView productPrice;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            productImage = itemView.findViewById(R.id.product_modify_image);
            productTitle = itemView.findViewById(R.id.product_modify_title);
            productPrice = itemView.findViewById(R.id.product_modify_price);

        }
    }

}
