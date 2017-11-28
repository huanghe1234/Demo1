package com.example.DVD;

import java.util.ArrayList;

public class UserTest{

	ArrayList<User> userList = new ArrayList<>();

	public void addUser() {
		User us1 = new User(18, 1, "张");
		User us2 = new User(19, 2, "李");
		User us3 = new User(20, 3, "王");
		userList.add(us1);
		userList.add(us2);
		userList.add(us3);
		System.out.println("添加");
		for (Object o : userList) {
			System.out.println(o);
		}
	}

	public void delUser() {

		userList.remove(2);
		System.out.println("删除");
		for (Object o : userList) {
			System.out.println(o);
		}
	}

	public void showUsers() {
		System.out.println("显示");
		for (Object o : userList) {
			System.out.println(o);
		}

	}

	public void updUser() {

		System.out.println("修改");
		User u = (User) userList.get(1);

		u.setId(4);
		u.setName("孙");
		u.setAge(30);
		
		for (Object o : userList) {
			System.out.println(o);
		}
	}

	public static void main(String args[]) {
		UserTest um = new UserTest();
		um.addUser();
		um.delUser();
		um.showUsers();
		um.updUser();

	}

}
