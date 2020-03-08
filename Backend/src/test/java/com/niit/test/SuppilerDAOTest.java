package com.niit.test;

import static org.junit.Assert.*;


import java.util.List;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.DAO.SupplierDAO;
import com.niit.model.Category;
import com.niit.model.Supplier;
public class SuppilerDAOTest {
	static SupplierDAO supplierdao;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.mavenprojects");
		context.refresh();
		supplierdao=(SupplierDAO)context.getBean("supplierDao");
	}
		@Test
public void addSupplierTest()
	{
		Supplier supplier=new Supplier();
		supplier.setSname("SAI");
		supplier.setSadd("BABA");
		assertTrue("problem in adding supplier:",supplierdao.addSupplier(supplier));
		}
@Ignore
	@Test
	public void updateSupplierTest()
	{
		Supplier supplier = supplierdao.getSupplierById(2);
		supplier.setSadd("New supplier launched");
		assertTrue("problem in updating Supplier",supplierdao.updateSupplier(supplier));
	}
@Ignore
	@Test
	public void deleteSupplierTest()
	{
		Supplier supplier = supplierdao.getSupplierById(1);
		assertTrue("problem in updating category",supplierdao.deleteSupplier(supplier));
	}
@Ignore
@Test
	public void listSupplier()
	{
		List<Supplier> listsupplier = supplierdao.listSupplier();
		for(Supplier s:listsupplier)
		{
			System.out.println(s.getSid()+":::::"+s.getSname()+"::::"+s.getSadd()+"::::::");
		}
		assertNotNull("problem in listing",listsupplier);
	}
}
