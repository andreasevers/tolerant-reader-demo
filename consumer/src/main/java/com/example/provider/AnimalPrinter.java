package com.example.provider;

import io.swagger.client.api.MyControllerApi;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static java.util.stream.Collectors.toList;

@Log4j2
@Service
public class AnimalPrinter {

    private MyControllerApi api;

    @Scheduled(fixedDelay = 5000)
    public void print() {
        log.info("Animals retrieved: " + api.getAnimals().stream().map(a -> a.getName()).collect(toList()));
    }

    @Autowired
    public void setApi(MyControllerApi api) {
        this.api = api;
    }
}
