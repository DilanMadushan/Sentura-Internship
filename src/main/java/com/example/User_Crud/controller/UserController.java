package com.example.User_Crud.controller;

import com.example.User_Crud.dto.UserDto;
import com.example.User_Crud.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/v1/users")
//@RequiredArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody UserDto userDto){
        try{
            System.out.println(userDto.toString());
            userService.saveCustomer(userDto);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
