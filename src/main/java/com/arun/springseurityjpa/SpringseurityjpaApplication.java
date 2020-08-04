package com.arun.springseurityjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringseurityjpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringseurityjpaApplication.class, args);
    }

}
