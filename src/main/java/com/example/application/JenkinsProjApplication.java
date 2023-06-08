package com.example.application;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsProjApplication extends SpringBootServletInitializer {

public static void main(String[] args) {
SpringApplication.run(JenkinsProjApplication.class, args);
}

}