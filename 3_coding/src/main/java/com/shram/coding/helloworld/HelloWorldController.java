package com.shram.coding.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello-world/{name}")
	public String helloWorld(@PathVariable String name) {
		 return String.format("Hello %s",name);
	 }
}
