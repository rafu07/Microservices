package com.dailycodebuffer.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {


    @GetMapping("/UserServiceFallBack")
    public String userSerivceFallBackMethod(){
        return"User Service is taking longer than expected";
    }

    @GetMapping("/DepartmentServiceFallBack")
    public String departmentSerivceFallBackMethod(){
        return"department Service is taking longer than expected";
    }

}
