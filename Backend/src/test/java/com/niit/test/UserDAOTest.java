package com.niit.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.UserDAO;
import com.niit.model.Category;
import com.niit.model.User;


public class UserDAOTest {
	static UserDAO userdao;
   @BeforeClass
	public static void initialize()
	{
	   AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	  context.scan("com.mavenprojects");
	  context.refresh();
	   userdao=(UserDAO)context.getBean("userDao");
	   }
	@Ignore
	@Test
	public void addUserTest()
	{
		User user=new User();
		user.setUname("aniktha");
		user.setUmailid("anikha@gmail.com");
		user.setUpass("34567");
		user.setUphno("99665432");
		assertTrue("problem in adding user:",userdao.addUser(user));
	}
	@Ignore
	@Test
	public void updateUserTest()
	{
		User user=userdao.getUserById(3);
		user.setUphno("999876543");
		assertTrue("problem in adding user:",userdao.updateUser(user));
	}
	@Ignore
	@Test
	public void deleteUserTest()
	{
		User user = userdao.getUserById(2);
		
		assertTrue("problem in updating category",userdao.deleteUser(user));
	}
	@Test
	public void listUser()
	{
		List<User> listuser = userdao.listUser();
		for(User u:listuser)
		{
			System.out.println(u.getUphno()+":::::"+u.getUpass()+"::::");
		}
		assertNotNull("problem in listing",listuser);
	}
	
}
