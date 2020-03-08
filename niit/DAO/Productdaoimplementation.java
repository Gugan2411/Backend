package com.niit.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Product;
@Repository("productDao")
@Transactional
public class Productdaoimplementation implements ProductDAO {
@Autowired SessionFactory sessionfactory;
	
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		try
		{
			sessionfactory.getCurrentSession().save(product);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	
	}

	
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		try
		{
		sessionfactory.getCurrentSession().update(product);
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		try
		{
			sessionfactory.getCurrentSession().delete(product);
			return true;
		}
	catch(Exception e)
		{
		return false;
		}
	}

	
	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.openSession();
		Product product= (Product)session.get(Product.class,pid);
		session.close();
		return product;
	}

	
	public List<Product> listProduct() 
	{
		// TODO Auto-generated method stub
Session session=sessionfactory.openSession();
Query query=session.createQuery("from Product");
List<Product> listCategory=query.list();
session.close();
return listCategory;

	}

}
