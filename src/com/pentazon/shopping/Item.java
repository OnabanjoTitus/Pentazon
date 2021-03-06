package com.pentazon.shopping;

import com.pentazon.product.Product;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Item {
    private Product product;
    private int quantity;
    private BigDecimal total;
    public Item(Product product){
        this.product=product;

    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    public void addItems(int quantity){
        this.quantity+=quantity;
        this.total=this.product.getProductPrice().multiply(BigDecimal.valueOf(this.quantity));
    }
    public void reduceItems(int quantity){
        if(this.quantity>quantity){
            this.quantity=quantity;
            this.total=this.product.getProductPrice().multiply(BigDecimal.valueOf(this.quantity));
        }
    }
}
