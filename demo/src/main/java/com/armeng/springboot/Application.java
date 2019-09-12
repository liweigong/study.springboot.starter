package com.armeng.springboot;

import com.armeng.springboot.mystarter.HelloworldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoming.kang
 * @date 2019/09/12.
 */
@RestController
@SpringBootApplication
public class Application {

    @Autowired
    private HelloworldService helloworldService;

    @RequestMapping("/")
    public String sayHello() {
        return helloworldService.sayHello();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
