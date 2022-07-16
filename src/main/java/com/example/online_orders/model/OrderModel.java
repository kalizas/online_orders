package com.example.online_orders.model;

import com.example.online_orders.entity.Client;
import com.example.online_orders.entity.Menu;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderModel {
    private Long id;

    private LocalDateTime scheduleTime;

    private Client client;

    private Menu menu;

}
