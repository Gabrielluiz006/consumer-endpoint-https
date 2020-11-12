package com.endpoint.controller;

import com.endpoint.model.Input;
import com.endpoint.service.EndPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EndPointController {

    @Autowired
    EndPointService service;

    @GetMapping
    @RequestMapping(value = "/endpoint/request", consumes = { "application/json" },produces = { "application/json" })
    public ResponseEntity<String> findSortingHat(@RequestBody(required = true) Input input){
        return new ResponseEntity<>(service.findSortingHat(input.getUrl()), HttpStatus.OK);
    }
}
