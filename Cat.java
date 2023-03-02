package com.rherz.demo.models;

public class Cat extends Pet{
    private Boolean claws;

    public Cat(Boolean claws, Long age){
        super(age);
        this.claws = claws;    
    }
    
    public Boolean getClaws(){
        return claws;
    }
}
