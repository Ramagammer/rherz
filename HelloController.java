package com.rherz.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rherz.demo.models.Book;

@RestController
public class HelloController {


    // /books/1        PathVariable
    // /books?name=1   QueryString
    @GetMapping("/books")
    @ResponseBody
    public Book getBooks(@RequestParam(name = "id") Long clave, @RequestParam(name = "title", required = false) String title){
    Book book = new Book(clave, title);
    return book;
}

    @RequestMapping("/hello")
    public String sayHi() {
         return "Hi this is working";
   }

}
