package com.niit.DAO;

import java.util.List;

import com.niit.model.Product;
public interface ProductDAO {
	
public boolean addProduct(Product product);
public boolean updateProduct(Product product);
public boolean deleteProduct(Product product);
public Product getProductById(int pid);
public List<Product>listProduct();
}