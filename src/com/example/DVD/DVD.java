package com.example.DVD;
/**
 * 
 * @Title: DVD.java
 * @Package: com.example.DVD
 * @Description: TODO
 *
 * @author Administrator
 * @date 2017年11月18日下午9:39:52
 * @version 1.0
 */
public class DVD {
	private String name;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public DVD() {
		
	}
	
	public DVD(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "DVD [name=" + name + ", id=" + id + "]";
	}
	
	
	
	
	
	
}
