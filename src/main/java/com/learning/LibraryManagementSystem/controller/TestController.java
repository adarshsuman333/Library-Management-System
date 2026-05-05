package com.learning.LibraryManagementSystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Library Management System runs!!!";
    }
}