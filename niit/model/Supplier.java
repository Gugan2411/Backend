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
int Sid;
public int getSid() {
	return Sid;
}
public void setSid(int sid) 
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

