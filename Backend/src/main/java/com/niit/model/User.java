package com.niit.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Table
@Entity
public class User {
String Uname;
public String getUname() {
	return Uname;
}
public void setUname(String uname) {
	Uname = uname;
}
public String getUpass() {
	return Upass;
}
public void setUpass(String upass) {
	Upass = upass;
}
public String getUphno() {
	return Uphno;
}
public void setUphno(String uphno) {
	Uphno = uphno;
}
public String getUmailid() {
	return Umailid;
}
public void setUmailid(String umailid) {
	Umailid = umailid;
}
String Upass;
String Uphno;
String Umailid;
@Id
@GeneratedValue
int Uid;
public int getUid() {
	return Uid;
}
public void setUid(int uid) {
	Uid = uid;
}
}


