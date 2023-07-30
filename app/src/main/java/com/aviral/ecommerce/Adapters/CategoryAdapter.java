package com.aviral.ecommerce.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.aviral.ecommerce.Models.Category;
import com.aviral.ecommerce.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private final ArrayList<Category> categories;

    public CategoryAdapter(ArrayList<Category> categories) {
        this.categories = categories;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.layout_category,
                parent,
                false
        );
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.categoryTitle.setText(categories.get(position).getCategoryTitle());

        if (position == 0) {
            holder.layout.setBackground(AppCompatResources.getDrawable(
                    holder.itemView.getContext(), R.drawable.category_background_home
            ));
        } else if (position == 1) {
            holder.layout.setBackground(AppCompatResources.getDrawable(
                    holder.itemView.getContext(), R.drawable.category_background_watches
            ));
        } else if (position == 2) {
            holder.layout.setBackground(AppCompatResources.getDrawable(
                    holder.itemView.getContext(), R.drawable.category_background_computer
            ));
        } else if (position == 3) {
            holder.layout.setBackground(AppCompatResources.getDrawable(
                    holder.itemView.getContext(), R.drawable.category_background_mobile
            ));
        }

        Glide.with(holder.itemView.getContext())
                .load(categories.get(position).getCategoryImage())
                .into(holder.categoryImage);

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final ConstraintLayout layout;
        private final TextView categoryTitle;
        private final ImageView categoryImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            layout = itemView.findViewById(R.id.layout);
            categoryTitle = itemView.findViewById(R.id.category_title);
            categoryImage = itemView.findViewById(R.id.category_image);

        }
    }

}
