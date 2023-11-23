package com.educandoweb.course.config;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    //implementado o commandLineRunner para essa classe ser executada quando startar a aplicação
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Katia Souza", "katia@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Pedro Franco", "pedro.franco@gmail.com", "988888888", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
