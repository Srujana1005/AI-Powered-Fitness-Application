
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
    "com.example.demo",
    "com.fitness.userservice"
})
@EntityScan(basePackages = "com.fitness.userservice.model")
@EnableJpaRepositories(basePackages = "com.fitness.userservice.repository")
public class AiPoweredFitnessApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiPoweredFitnessApplication.class, args);
    }
}
