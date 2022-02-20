package com.example.workflow.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


public class HelloDelegate implements JavaDelegate{
	
	private final Logger LOGGER = LoggerFactory.getLogger(HelloDelegate.class.getName());

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.debug("HELLO!!!!");
		System.out.println("HELLO!!!");
		
	}
}
