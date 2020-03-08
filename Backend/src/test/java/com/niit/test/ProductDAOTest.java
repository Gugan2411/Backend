package com.niit.test;

import static org.junit.Assert.*;


import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.ProductDAO;
import com.niit.model.Product;

public class ProductDAOTest {
	static ProductDAO productdao;
@BeforeClass
public static void initialize()
{
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.mavenprojects");
	context.refresh();
	productdao=(ProductDAO)context.getBean("productDao");
	
}

@Test
public void addProductTest()
	
	{
		Product product=new Product();
		product.setPdescription("All mobiles");
		product.setPname("Lenova k8");
		product.setPprice(150000);
		product.setPquantity(650);
		assertTrue("problem in adding product:",productdao.addProduct(product));
		
	}
@Ignore
@Test
public void updateProductTest()
{
	Product product=productdao.getProductById(2);
	product.setPprice(500);
	assertTrue("problem in updating product:",productdao.updateProduct(product));
}
@Ignore	
@Test
public void deleteProductTest()
{
	Product product=productdao.getProductById(1);
	assertTrue("problem in deleting product:",productdao.deleteProduct(product));
}
@Test
public void listProduct()
{
	List<Product> listproduct=productdao.listProduct();
	for(Product p:listproduct)
	{
		System.out.println(p.getPid()+"::::::"+p.getPdescription()+"::::::"+p.getPname()+"::::::"+p.getPprice()+"::::::"+p.getPquantity()+"::::::");
		assertNotNull("problem in listing:",listproduct);
	}
	
}

}
