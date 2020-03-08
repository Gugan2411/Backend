package com.niit.model;

import javax.persistence.Entity;



import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Category {
	@Id
	@GeneratedValue
int Cid;
public int getCid() {
	return Cid;
}
public void setCid(int cid) {
	Cid = cid;
}
public String getCname() {
	return Cname;
}
public void setCname(String cname) {
	Cname = cname;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
String Cname;
String description;
}

