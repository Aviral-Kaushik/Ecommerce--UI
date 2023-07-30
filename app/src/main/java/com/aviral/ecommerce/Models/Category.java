package com.aviral.ecommerce.Models;

public class Category {

    private String categoryTitle;

    private String backgroundColor;

    private int categoryImage;

    public Category(String categoryTitle,
                    String backgroundColor,
                    int categoryImage) {
        this.categoryTitle = categoryTitle;
        this.backgroundColor = backgroundColor;
        this.categoryImage = categoryImage;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public int getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryImage(int categoryImage) {
        this.categoryImage = categoryImage;
    }
}
