package com.ascend.pgp.capstone.team2backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ascend.pgp.capstone.team2backend.model.Category;
import com.ascend.pgp.capstone.team2backend.model.Product;
import com.ascend.pgp.capstone.team2backend.model.User;
import com.ascend.pgp.capstone.team2backend.repository.CategoryRepository;
import com.ascend.pgp.capstone.team2backend.repository.ProductRepository;
import com.ascend.pgp.capstone.team2backend.repository.UserRepository;

@Service
public class ProductServiceImpl implements ProductService {

//	@Autowired
//	WishlistRepository wishlistRepository;
	
//	@Autowired
//	CartRepository cartRepository;
	
	@Autowired
	ProductRepository productRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Product getProductByName(String pname) {

		return productRepository.findProductByName(pname);
	}

	@Override
	public List<Product> getAllProductByCategory(String pcategory) {

		return productRepository.findByProductCategory(pcategory);
	}

	@Override
	public User getUserByEmail(String uemail) {
		return userRepository.checkUserInfo(uemail);
	}

	@Override
	public List<Category> getallCategory() {
		return categoryRepository.getAllCategories();
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	@Override
	public List<Product> getProductsByTitleNameOrShortDesc(String searchCriterion) {
		return productRepository.findProductsByTitleAndName(searchCriterion);
	}

	@Override
	public List<Product> getProductsByTitleAndName(String searchCriterion) {
		return productRepository.findProductsByTitleAndName(searchCriterion);
	}

//	@Override
//	public List<Cart> getAllItemsInCart() {
//		return cartRepository.getAllItemsInCart();
//	}
//
//	@Override
//	public List<Wishlist> getAllItemsInWishlist() {
//		return wishlistRepository.getAllItemsInWishlist();
//	}

}

