package com.niit.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Table
@Entity
public class Product {
	@Id
	@GeneratedValue
	int pid;
public int getPid() 
    {
		return pid;
	}
	public void setPid(int pid) 
	{
		this.pid = pid;
	}
int pprice;
public int getPprice() {
	return pprice;
}
public void setPprice(int pprice) {
	this.pprice = pprice;
}
public int getPquantity() {
	return pquantity;
}
public void setPquantity(int pquantity) {
	this.pquantity = pquantity;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPdescription() {
	return pdescription;
}
public void setPdescription(String pdescription) {
	this.pdescription = pdescription;
}
int pquantity;
String pname;
String pdescription;
String Cid,Sid;
public String getCid() {
	return Cid;
}
public void setCid(String cid) {
	Cid = cid;
}
public String getSid() {
	return Sid;
}
public void setSid(String sid) {
	Sid = sid;
}
}


