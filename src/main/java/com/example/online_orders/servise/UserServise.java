package com.example.online_orders.servise;

import com.example.online_orders.model.MenuModel;
import com.example.online_orders.model.OrderModel;

public interface UserServise {

    MenuModel addNewFood(MenuModel menuModel);

    OrderModel getOrderById(Long id);

    void deleteFoodById(Long id);
}
