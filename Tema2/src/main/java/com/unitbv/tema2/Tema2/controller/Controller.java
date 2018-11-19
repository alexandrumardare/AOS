package com.unitbv.tema2.Tema2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {	
	@GetMapping("/{name}")
	public String HelloWorld(@PathVariable("name") String name) {
		return "Hello "+name;
	}
}