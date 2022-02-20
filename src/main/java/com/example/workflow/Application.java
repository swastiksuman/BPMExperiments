package com.example.workflow;

import org.camunda.bpm.BpmPlatform;
import org.camunda.bpm.engine.ProcessEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class Application {

  public static void main(String... args) {
    SpringApplication.run(Application.class, args);
    ProcessEngine engine = BpmPlatform.getDefaultProcessEngine();
  }

}