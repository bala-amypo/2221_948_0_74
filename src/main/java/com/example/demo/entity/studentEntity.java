package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@entity
public class studentEntity{
    
    @Id
    @GenerateValue(strategy = Generationtype.IDENTITY)
    private Long id;

    @NotBlank(message="Name is not valid")
    private string name;

    @Email(message = "Email Format is not Valid")
    private String email;

    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }
    public studentEntity(){

    }
    public studentEntity(Long is,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }

}
