package com.project.demoserverside.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demoserverside.model.Product;

@RestController
@RequestMapping("/api")
public class ServerController {
	
	@GetMapping("/text")
	List<String> getText(){
		
		return new ArrayList<>(Arrays.asList("one","two","three"));
	}
	
	@GetMapping("/one-produit")
	Product getProduct(){
		
		return new Product(Long.valueOf("1"), "artel musculation", com.project.demoserverside.type.ProductType.SPORT, Double.valueOf("20"));
	}

}
