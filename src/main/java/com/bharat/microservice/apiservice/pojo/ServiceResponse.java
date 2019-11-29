package com.bharat.microservice.apiservice.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ServiceResponse implements Serializable {

    private String status;
    private String statusCode;
    private String error;


}
