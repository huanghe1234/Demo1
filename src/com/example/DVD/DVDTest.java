package com.example.DVD;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @Title: DVDTest.java
 * @Package: com.example.DVD
 * @Description: 针对DVD进行增删改查
 *
 * @author Administrator
 * @date 2017年11月18日下午9:42:17
 * @version 1.0
 */
public class DVDTest {

	// --创建一个集合,参数类型为DVD
	ArrayList<DVD> list = new ArrayList<>();
	private int i;

	public static void main(String[] args) {

		String name = "";
		int i = 0;

		DVDTest dt = new DVDTest();

		// --创建DVD的对象,对象里面包含DVD名称,DVDID
		DVD d1 = new DVD("建军大业", 1);
		DVD d2 = new DVD("新龙门客栈", 2);
		DVD d3 = new DVD("羞羞的铁拳", 3);
		DVD d4 = new DVD("记忆大师", 4);
		DVD d5 = new DVD("终结者", 5);

		dt.list.add(d1);
		dt.list.add(d2);
		dt.list.add(d3);
		dt.list.add(d4);
		dt.list.add(d5);

		// --打印查看每个下表对应的元素
		// --System.out.println(dt.list.get(0));

		/*--我们也可以采用下面的方法创建对象,利用循环,名字也是循环打印出来的
			for(int i = 1 ; i < 5 ; i++) {
			dt.list.add(new DVD("DVD"+i,i+1));
			}
		 */
		// --显示该集合的所用元素,采用遍历的方法
		for (DVD d : dt.list) {
			System.out.println(d);
		}

		
		dt.delDvdbyName(); // --通过名字来删除
		

	}

	// 增加DVD的方法
	@SuppressWarnings("unused")
	public void addDvd() {
		Scanner scan = new Scanner(System.in);
		//--DVD dvd = new DVD(name, i);
		// --检查参数
		/*if (dvd == null) {
			throw new IllegalArgumentException("添加的DVD为空");
		}
		*/
		System.out.println("请输入要添加的Dvd名称");
		String name = scan.next();
		int i = list.size() + 1;
		DVD dvd = new DVD(name, i);
		
		// --往集合里面添加dvd
		list.add(dvd);
		System.out.println("输入的dvd名称:" + dvd);
	}

	/*
	 * 生成dvdId的方法,因为是Dvd类型的,里面不能添加字符类型 public int createId() {
	 * list.add((list.size()+1)); return list.size(); }
	 */

	// "删除"DVD的方法,根据DVDname来删除
	public void delDvdbyName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要删除的DVD名字");
		String dvdname = scan.next();

		// --检查参数
		if (dvdname == null || dvdname.length() == 0) {
			throw new IllegalArgumentException("所要删除的DVD不存在");
		}
		// --查看集合里面的元素,利用超级for循环
		
		for (int j = 0 ;j<list.size();j++) {  //
			if (list.get(j).getName().equals(dvdname)) {
				list.remove(j); //移除指定下标的元素
				System.out.println("删除的是" + dvdname);
			}			
		}
		
		for (int j = 0;j<list.size();j++) {
			System.out.println(list.get(j));
		}

	}

	// "改写"DVD的方法,通过id来改写
	public void reviseById() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要改写的dvdID");
		int i = scan.nextInt();
		
		System.out.println("输入要更换的dvd名称");
		String dvdname = scan.next();
		int j = list.size() + 1;
		DVD d2 = new DVD(dvdname, j);
		
		for (DVD d : list) {
			if (d.getId() == i) {
			list.set(i, d2);			
			} 					
		}	
		System.out.println("修改之后的DVD为");	
		for(DVD d3 : list) {
			System.out.println(d3);
		}

	}

	// "查询"是否含有该DVD的方法,通过id来查询
	public void queryByName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要查询的dvd名称");
		String name = scan.next();
		
		
		DVD d = new DVD(name,4);

		for (DVD d1 : list) {
			if (list.contains(d)) {
				System.out.println("含有该dvd");
			}
		}
		
		
		scan.close();
		

	}

}
