package com.project.demoserverside;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServerController {
	
	@GetMapping("/text")
	List<String> getText(){
		
		return new ArrayList<>(Arrays.asList("one","two","three"));
	}

}
