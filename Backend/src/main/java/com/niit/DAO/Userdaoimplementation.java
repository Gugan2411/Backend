package com.niit.DAO;
import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.User;
@Repository("userDao")
@Transactional

public class Userdaoimplementation implements UserDAO{
	@Autowired SessionFactory sessionfactory; 

	
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		try
		{
			sessionfactory.getCurrentSession().save(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		try {
			sessionfactory.getCurrentSession().update(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	

	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		try {
			sessionfactory.getCurrentSession().delete(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public User getUserById(int  Uid) 
	{
		// TODO Auto-generated method stub
		Session session=sessionfactory.openSession();
		User user=(User)session.get(User.class,Uid);
		session.close();
		return user;
	}

	
	public List<User> listUser() {
		// TODO Auto-generated method stub
		Session session=sessionfactory.openSession();
		Query query=session.createQuery("from User");
		List<User> listUser=query.list();
		session.close();
		return listUser;
	}

}

