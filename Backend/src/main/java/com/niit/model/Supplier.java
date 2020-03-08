package com.niit.model;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Supplier {
	@Id
	@GeneratedValue
String Sid;
public String getSid() {
	return Sid;
}
public void setSid(String sid) 
{
	Sid = sid;
}
public String getSname() 
{
	return Sname;
}
public void setSname(String sname) 
{
	Sname = sname;
}
public String getSadd() 
{
	return Sadd;
}
public void setSadd(String sadd) 
{
	Sadd = sadd;
}
String Sname;
String Sadd;
}

