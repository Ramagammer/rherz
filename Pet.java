package com.rherz.demo.models;

public abstract class Pet {
    private String legs = "4";
    private String tail = "yes";
    private Long age;

    public Pet(Long age){
        this.age = age;
    }
    
    public String getLegs(){
        return legs;
    }

    public String getTail(){
        return tail;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age){
        this.age = age;
    }

    public static void add(Dog dog) {
    }

}
