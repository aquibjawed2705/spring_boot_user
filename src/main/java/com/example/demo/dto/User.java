package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    int id;
    String name;
    String email;
}
