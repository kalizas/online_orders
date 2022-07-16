package com.example.online_orders.exception;

public class NotFoundException extends RuntimeException{
    private String order;

    public NotFoundException(String message) {
        this.order = order;
    }


    public String getOrderById() {
        return order;
    }
}
