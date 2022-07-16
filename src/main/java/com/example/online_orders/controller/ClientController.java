package com.example.online_orders.controller;

import com.example.online_orders.model.ClientModel;
import com.example.online_orders.model.OrderModel;
import com.example.online_orders.servise.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(maxAge = 3600, origins = "*")
@RestController
@RequestMapping("api/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    public ResponseEntity<?> createOrder(@RequestBody ClientModel clientModel){

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(clientService.createOrder(OrderModel.builder().build()));
    }

//    @RequestMapping(value = "/orders", method = RequestMethod.POST)
//    public ResponseEntity<Object> createOrder(@RequestBody ClientService clientService) {
//        clientService.createOrder((OrderModel) clientService);
//        return new ResponseEntity<>(" ", HttpStatus.CREATED);
//    }
 }
