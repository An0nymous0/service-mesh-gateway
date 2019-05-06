package com.demo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class ServiceMeshGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceMeshGatewayApplication.class, args);
    }

    @GetMapping
    public String index() {
        String a = null;
        a.toCharArray();
        return "gateway";
    }

}
