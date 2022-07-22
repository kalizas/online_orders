package com.example.online_orders.controller;

import com.example.online_orders.exception.NotFoundException;
import com.example.online_orders.model.MenuModel;
import com.example.online_orders.servise.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(maxAge = 3600, origins = "*")
@RestController
@RequestMapping("api/admin")
public class UserController {

    @Autowired
    private UserService adminServise;

    @PostMapping("/create/new/post")
    public ResponseEntity<?> addNewFood(@RequestBody MenuModel postModel) {
        try {
            return new ResponseEntity(adminServise.addNewFood(postModel), HttpStatus.OK);
        } catch (Exception exception) {
            return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/get-post/{id}")
        public ResponseEntity<?> getOrederById(@PathVariable Long id) {
            try {
                return new ResponseEntity(adminServise.getOrderById(id), HttpStatus.OK);
            } catch (NotFoundException nfe) {
                return new ResponseEntity(nfe.getMessage(), HttpStatus.NOT_FOUND);
            } catch (Exception e) {
                return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

    @DeleteMapping("/delete-post/{id}")
    public ResponseEntity<?> deletePostById(Long id) {
        adminServise.deleteFoodById(id);
        return ResponseEntity.ok(true);
    }

}
