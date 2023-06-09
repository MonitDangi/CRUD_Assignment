package com.crudproject.crudassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.*")
@ComponentScan("com.*")
@EnableJpaRepositories(basePackages = "com.EmployeeRepository")
public class CrudAssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudAssignmentApplication.class, args);
    }

}
