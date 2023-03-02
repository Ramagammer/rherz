package com.rherz.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rherz.demo.models.Cat;
import com.rherz.demo.models.Dog;
import com.rherz.demo.models.Pet;


@RestController
public class PetController {
    

    @GetMapping("/pets")
    @ResponseBody
    public List<Pet> getPets(@RequestParam(name = "age") Long age, @RequestParam(name = "claws") Boolean claws, @RequestParam(name = "ladrar", required = false) Boolean ladrar){
        Cat cat = new Cat(claws, age);
        Dog dog = new Dog(ladrar, age + 2);
        List<Pet> pets = new ArrayList<>();
        pets.add(cat);
        pets.add(dog);
        return pets;
    }

}


