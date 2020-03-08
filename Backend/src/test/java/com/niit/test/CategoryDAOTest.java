package com.niit.test;

import static org.junit.Assert.*;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.CategoryDAO;
import com.niit.model.Category;
public class CategoryDAOTest {
static CategoryDAO categorydao;
@BeforeClass
public static void initialize()
{
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.niit");
	context.refresh();
	categorydao=(CategoryDAO)context.getBean("categoryDao");
}
	@Ignore
	@Test 
	public void addCategoryTest()
	
	{
		Category category=new Category();
		category.setDescription("Yellow in color");
		category.setCname("Lemon");
		assertTrue("problem in adding category:",categorydao.addCategory(category));
		
	}
	
	@Test
	@Ignore
	public void updateCategoryTest()
	{
		Category category = categorydao.getCategoryById(1);
		category.setDescription("Dark Orange in color");
		assertTrue("problem in updating category",categorydao.updateCategory(category));
	}
	@Ignore
	@Test
	public void deleteCategoryTest()
	{
		Category category = categorydao.getCategoryById(2);
		
		assertTrue("problem in updating category",categorydao.deleteCategory(category));
	}
	@Ignore
	@Test
	public void listCategory()
	{
		List<Category> listcategory = categorydao.listCategory();
		for(Category c:listcategory)
		{
			System.out.println(c.getCid()+":::::"+c.getCname()+"::::"+c.getDescription());
		}
		assertNotNull("problem in listing",listcategory);
	}
	
	
}
