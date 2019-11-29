package com.bharat.microservice.apiservice.controller;

import com.bharat.microservice.apiservice.pojo.ServiceResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/" )
@Api(value = "FirstController", produces = MediaType.APPLICATION_JSON_VALUE)
public class ApiController {


    @GetMapping(value = "/welcome")
    @ApiOperation(value = "Welcome API")
    public String welcome(){
        return "Welcome to the API Service";
    }

    @GetMapping(value = "/sr")
    @ApiOperation(value = "A generic API that returns a service response object")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Ok", response = ServiceResponse.class)})
    public ServiceResponse getServiceResponse(){
        ServiceResponse s = new ServiceResponse();
        s.setStatus("Success");
        s.setStatusCode("200");
        return s;
    }


}
