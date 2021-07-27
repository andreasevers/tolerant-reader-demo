package com.example.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class MyController {

    @GetMapping
    public List<Animal> getAnimals() {
        return List.of(new Animal("Dog", "Snoopy", 4));
    }

}
