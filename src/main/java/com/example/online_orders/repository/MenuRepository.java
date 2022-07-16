package com.example.online_orders.repository;

import com.example.online_orders.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Long > {
}
