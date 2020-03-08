package com.niit.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Category;

@Repository("categoryDao")
@Transactional
public class Categorydaoimplementation implements CategoryDAO

{
	
	@Autowired 	
	SessionFactory sessionfactory;
	
	public boolean addCategory(Category category) {
		try 
		{
			sessionfactory.getCurrentSession().save(category);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean updateCategory(Category category) {

		try
		{
			sessionfactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	public boolean deleteCategory(Category category) {

		try
		{
			sessionfactory.getCurrentSession().delete(category);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	public Category getCategoryById(int Cid) {

		Session session = sessionfactory.openSession();
		Category category = (Category)session.get(Category.class, Cid);
		session.close();
		return category;
	}

	public List<Category> listCategory() {
		Session session = sessionfactory.openSession();
		Query query = session.createQuery("from Category");
		List<Category> listcategory = query.list();
		session.close();
		return listcategory;
	}
	}



