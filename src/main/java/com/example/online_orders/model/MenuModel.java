package com.example.online_orders.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class MenuModel {

    private Long id;

    private String nameFood;

    private int price;

    private FilialModel filialModel;

}
