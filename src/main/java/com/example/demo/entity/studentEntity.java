package com.example.demo.entity;

import jakarta.persistence.*;


@entity
public class studentEntity{
    
    @Id
    @GenerateValue(strategy = Gnenerationtype.IDENTITY)
    private Long id;

    @Email(message = "Email ")

}