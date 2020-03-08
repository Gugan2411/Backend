package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.DAO.SupplierDAO;
import com.niit.model.Supplier;


@Controller
public class SupplierController {
	
	@Autowired
	SupplierDAO supplierDAO;
	
	@RequestMapping("/supplier")
	public String showCategoryPage(Model m) {
		
		List<Supplier> listSupplier = supplierDAO.listSupplier();
		m.addAttribute("supplierList", listSupplier);
		
		return "Supplier";
	}
	
	@RequestMapping(value="/addSupplier",method=RequestMethod.POST)
	public String addSupplier(@RequestParam("supplierName")String supplierName,@RequestParam("supplierAddress")String supplierAddress,Model m) {
		
		Supplier supplier = new Supplier();
		supplier.setSname(supplierName);
		supplier.setSadd(supplierAddress);
		
		supplierDAO.addSupplier(supplier);
		
		List<Supplier> listSupplier = supplierDAO.listSupplier();
		m.addAttribute("supplierList", listSupplier);
		
		return "Supplier";
		
	}
	
	@RequestMapping(value="/updateSupplier",method=RequestMethod.POST)
	public String updateSupplier(@RequestParam("supplierID")String supplierID,@RequestParam("supplierName")String supplierName,@RequestParam("supplierAddress")String supplierAddress,Model m) {
		
		Supplier supplier = supplierDAO.getSupplierById(supplierID);
		supplier.setSname(supplierName);
		supplier.setSadd(supplierAddress);
		
		supplierDAO.updateSupplier(supplier);
		
		List<Supplier> listSupplier = supplierDAO.listSupplier();
		m.addAttribute("supplierList", listSupplier);
		
		return "Supplier";
		
	}
	
	@RequestMapping(value="/editSupplier/{supplierID}")
	public String editSupplier(@PathVariable("supplierID")String supplierID,Model m) {
		
		Supplier supplier = supplierDAO.getSupplierById(supplierID);
		m.addAttribute("supplierData",supplier);
		
		return "UpdateSupplier";
	}
	
	@RequestMapping(value="/deleteSupplier/{supplierID}")
	public String deleteSupplier(@PathVariable("supplierID")String supplierID,Model m) {
		
		Supplier supplier = supplierDAO.getSupplierById(supplierID);
		supplierDAO.deleteSupplier(supplier);
		
		List<Supplier> listSupplier = supplierDAO.listSupplier();
		m.addAttribute("supplierList", listSupplier);
		
		return "Supplier";
	}

}

