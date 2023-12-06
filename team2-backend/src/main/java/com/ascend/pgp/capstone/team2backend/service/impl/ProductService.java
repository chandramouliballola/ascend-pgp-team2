package com.ascend.pgp.capstone.team2backend.service.impl;

import java.util.List;

import com.ascend.pgp.capstone.team2backend.model.Category;
import com.ascend.pgp.capstone.team2backend.model.Product;
import com.ascend.pgp.capstone.team2backend.model.User;



public interface ProductService {

	public Product getProductByName(String pname);

	public List<Product> getAllProductByCategory(String pcategory);

	public User getUserByEmail(String uemail);

	public List<Category> getallCategory();

	public List<Product> getProductsByTitleAndName(String searchCriterion);

	public List<Product> getProductsByTitleNameOrShortDesc(String searchCriterion);

	public List<Product> getAllProducts();

//	public List<Cart> getAllItemsInCart();
//
//	public List<Wishlist> getAllItemsInWishlist();

}
