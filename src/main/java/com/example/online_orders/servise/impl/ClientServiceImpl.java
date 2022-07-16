package com.example.online_orders.servise.impl;

import com.example.online_orders.entity.Order;
import com.example.online_orders.model.OrderModel;
import com.example.online_orders.servise.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

    @Override
    public OrderModel createOrder(OrderModel orderModel) {
        Order order = new Order();
        order.setId(orderModel.getId());
        order.setScheduleTime(orderModel.getScheduleTime());
        order.setMenu(orderModel.getMenu());
        return orderModel;
    }

    @Override
    public OrderModel viewOrder(OrderModel orderModel) {
        return null;
    }
}
