package com.example.workflow.controller;

import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.ProcessEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Autowired
	private ProcessEngine camunda;
	
	@GetMapping("/home")
	public void home(@RequestParam String number1, String number2) {
		Map<String, Object> map = new HashMap();
		map.put("number1", number1);
		map.put("number2", number2);
		camunda.getRuntimeService().startProcessInstanceByKey("Process_02h17ea", map);
	}
}