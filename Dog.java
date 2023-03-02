package com.rherz.demo.models;

public class Dog extends Pet{
    private Boolean ladrar;

    public Dog(Boolean ladrar, Long age){
        super(age);
        this.ladrar = ladrar;    
    }
    
    public Boolean getLadrar(){
        return ladrar;
    }
}
