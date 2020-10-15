package com.brzk.marketorder.model;

import java.util.Map;

public class UserOrder {

    private Map<String, Product> products;

    public Map<String, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Product> products) {
        this.products = products;
    }
}
