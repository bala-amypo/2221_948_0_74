package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@entity
public class studentEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Name is not valid")
    private String name;

    @Email(message = "Email Format is not Valid")
    private String email;

    public Long getId(){
        return id;
    }
    public Long setId(Long id)
    {
        this.id=id;
    }
    public studentEntity(){

    }
    public studentEntity(Long id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }

}
