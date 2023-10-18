package com.example.demojava7ao21.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class ParameterController {

    @GetMapping("/api")
    @ResponseBody
    public String getFoos(@RequestParam(required = false) String id) {
        return "ID: " + id;
    }

    @GetMapping("/api-opt")
    @ResponseBody
    public String getFoos(@RequestParam Optional<String> id){
        return "ID: " + id.orElseGet(() -> "not provided");
    }

}
