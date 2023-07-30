package com.aviral.ecommerce.Models;

public class CartProduct {

    private int productImage;

    private String productName;

    private String productPrice;

    private float productRating;

    public CartProduct(int productImage,
                       String productName,
                       String productPrice,
                       float productRating) {
        this.productImage = productImage;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRating = productRating;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public float getProductRating() {
        return productRating;
    }

    public void setProductRating(float productRating) {
        this.productRating = productRating;
    }
}
