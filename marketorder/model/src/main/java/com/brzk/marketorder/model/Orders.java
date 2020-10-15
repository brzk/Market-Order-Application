package com.brzk.marketorder.model;

import java.util.Map;

public class Orders {

    private Map<String,UserOrder> userOrders;

    public Map<String, UserOrder> getUserOrders() {
        return userOrders;
    }

    public void setUserOrders(Map<String, UserOrder> userOrders) {
        this.userOrders = userOrders;
    }
}
