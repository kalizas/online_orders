package com.example.online_orders.servise.impl;

import com.example.online_orders.entity.Menu;
import com.example.online_orders.entity.Order;
import com.example.online_orders.exception.NotFoundException;
import com.example.online_orders.model.MenuModel;
import com.example.online_orders.model.OrderModel;
import com.example.online_orders.repository.MenuRepository;
import com.example.online_orders.repository.OrderRepository;
import com.example.online_orders.servise.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final OrderRepository orderRepository;
    private final MenuRepository menuRepository;

    @Override
    public MenuModel addNewFood(MenuModel menuModel) {
        Menu menu = new Menu();
        menu.setFoodName(menuModel.getNameFood());
        menu.setPrice(menuModel.getPrice());
        menuRepository.save(menu);
        return menuModel;
    }

    @Override
    public OrderModel getOrderById(Long id) {
        Order order = orderRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Id: " + id + "не найден"));
        return null;
    }

    @Override
    public void deleteFoodById(Long id) {
        menuRepository.deleteById(id);
    }
}
