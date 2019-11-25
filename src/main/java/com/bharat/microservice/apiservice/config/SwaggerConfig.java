package com.bharat.microservice.apiservice.config;

import com.bharat.microservice.apiservice.controller.ApiController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@ComponentScan(basePackageClasses = ApiController.class)
@PropertySource("classpath:swagger.properties")
@Configuration
public class SwaggerConfig {

    public static final String SWAGGER_API_VERSION = "swagger version 1.0";
    public static final String LICENSE_TEXT = "license text";
    public static final String TITLE = "API Swagger Page";
    public static final String DESCRIPTION = "api swagger description";


    // Create API info object setting above things

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().license(LICENSE_TEXT).description(DESCRIPTION).title(TITLE).version(SWAGGER_API_VERSION).build();
    }

    @Bean
    public Docket productsAPI(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).pathMapping("/").select().paths(PathSelectors.regex("/api.*")).build();
    }







}
