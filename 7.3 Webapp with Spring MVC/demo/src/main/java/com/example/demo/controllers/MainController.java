package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * This controller should be in the package it should be a router to.
 * Did not work when I put it in example foldert but working
 * in this demo folder
 */
@Controller
public class MainController {
    // associate the action with an HTTP request path
    @RequestMapping("/home")
    public String home() {
        // return the HTML document name that contains the details to be display.
        return "home.html";
    }
}
