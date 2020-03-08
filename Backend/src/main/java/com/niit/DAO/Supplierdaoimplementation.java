package com.niit.DAO;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.model.Supplier;
@Repository("supplierDao")
@Transactional
public class Supplierdaoimplementation implements SupplierDAO {
	@Autowired 	SessionFactory sessionfactory;
	
	public boolean addSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		try 
		{
			sessionfactory.getCurrentSession().save(supplier);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public boolean updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		try 
		{
			sessionfactory.getCurrentSession().update(supplier);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public boolean deleteSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		try 
		{
			sessionfactory.getCurrentSession().delete(supplier);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public Supplier getSupplierById(String Sid) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.openSession();
		Supplier supplier = (Supplier)session.get(Supplier.class, Sid);
		session.close();
		return supplier;
	}

	
	public List<Supplier> listSupplier()
	{
		Session session=sessionfactory.openSession();
		Query query=session.createQuery("from Supplier");
		List<Supplier> listsupplier=query.list();
	 session.close();
	 return listsupplier;
		
	}

}
