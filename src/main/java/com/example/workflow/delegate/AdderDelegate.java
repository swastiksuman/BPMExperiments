package com.example.workflow.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


public class AdderDelegate implements JavaDelegate{
	
	private final Logger LOGGER = LoggerFactory.getLogger(AdderDelegate.class.getName());

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.debug("Adding 2 + 5");
		System.out.println("HELLO!!!");
		execution.setVariable("myResult", 7);
	}
}
	