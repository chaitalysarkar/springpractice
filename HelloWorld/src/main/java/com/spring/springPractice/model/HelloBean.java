package com.spring.springPractice.model;

public class HelloBean {
private String name;
private String message;
@Override
public String toString() {
	return "HelloBean [name=" + name + ", message=" + message + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public HelloBean(String name, String message) {
	super();
	this.name = name;
	this.message = message;
}

}
