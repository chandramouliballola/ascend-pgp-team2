package com.ascend.pgp.capstone.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {
	
	@CrossOrigin
	@GetMapping("/allProducts")
	public String getAllProducts() {
		return "Hello Mouli.. this is called from Backend Java code..!!!";
	}

}
