package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(TodoRepository todos) {

    return args -> {
      // log.info("Preloading " + todos.save(new Todo("Task description 1", false)));
      // log.info("Preloading " + todos.save(new Todo("Task description 2", true)));
    };
  }
}