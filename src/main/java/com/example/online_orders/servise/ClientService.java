package com.example.online_orders.servise;

import com.example.online_orders.model.OrderModel;

public interface ClientService {
    //Создание заказа
    //Просмотр заказа

    OrderModel createOrder(OrderModel orderModel);

    OrderModel viewOrder(OrderModel orderModel);

}
