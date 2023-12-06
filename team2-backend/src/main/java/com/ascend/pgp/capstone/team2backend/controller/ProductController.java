package com.ascend.pgp.capstone.team2backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ascend.pgp.capstone.team2backend.model.Category;
import com.ascend.pgp.capstone.team2backend.model.Product;
import com.ascend.pgp.capstone.team2backend.model.User;
import com.ascend.pgp.capstone.team2backend.service.impl.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {

	@Autowired
	ProductService productService;

	@CrossOrigin
	@GetMapping("user/{uemail}")
	public User validateUserInfo(@PathVariable("uemail") String uemail) {
		return productService.getUserByEmail(uemail);
	}

	@CrossOrigin
	@GetMapping("name/{pname}")
	public Product getAllProductsByName(@PathVariable("pname") String pname) {
		return productService.getProductByName(pname);
	}

	@CrossOrigin
	@GetMapping("category/{pcategory}")
	public List<Product> getAllProductsByCategory(@PathVariable("pcategory") String pcategory) {
		return productService.getAllProductByCategory(pcategory);
	}

	@CrossOrigin
	@GetMapping("categorylist")
	public List<Category> displayallCategory() {
		return productService.getallCategory();
	}

	@CrossOrigin
	@GetMapping("searchProductsByTitleAndName/{searchCriterion}")
	public List<Product> searchProductByTitleAndName(@PathVariable("searchCriterion") String searchCriterion) {
		return productService.getProductsByTitleAndName(searchCriterion);
	}

	@CrossOrigin
	@GetMapping("searchProductsByTitleNameOrShortDesc/{searchCriterion}")
	public List<Product> searchProductsByTitleNameOrShortDesc(@PathVariable("searchCriterion") String searchCriterion) {
		return productService.getProductsByTitleNameOrShortDesc(searchCriterion);
	}
	
	@CrossOrigin
	@GetMapping("allProducts")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
}
