package com.bharat.microservice.apiservice.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/api/v1/")
@Api(value = "FirstController", produces = MediaType.APPLICATION_JSON_VALUE)
public class ApiController {


    @GetMapping(value = "/welcome")
    @ApiOperation(value = "Welcome API")
    public String welcome(){
        return "Welcome to the API Service";
    }


}
