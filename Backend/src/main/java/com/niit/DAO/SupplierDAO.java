package com.niit.DAO;


import java.util.List;

import com.niit.model.Supplier;

public interface SupplierDAO {
	
public boolean addSupplier(Supplier supplier);
public boolean updateSupplier(Supplier supplier);
public boolean deleteSupplier(Supplier supplier);
public Supplier getSupplierById(String Sid);
public List<Supplier>listSupplier();
}
