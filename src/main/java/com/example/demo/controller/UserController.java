package com.example.demo.controller;

import com.example.demo.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    @GetMapping("/users")
    private List<User> users(){
        List<User> users=new ArrayList<>();
        int i=0;
        User u1=User.builder().id(++i).email("aakib1@gmail.com").name("Aquib Jawed").build();
        User u2=User.builder().id(++i).email("mdmadni@gmail.com").name("Md Madni").build();
        User u3=User.builder().id(++i).email("makki@gmail.com").name("AbuTalha Makki").build();
        User u4=User.builder().id(++i).email("kalam@gmail.com").name("Abdul Kalam").build();
        User u5=User.builder().id(++i).email("nadim@gmail.com").name("Md Ragib Nadim").build();


        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);

        return users;
    }

}
