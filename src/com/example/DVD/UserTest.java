package com.example.DVD;

import java.util.ArrayList;

public class UserTest{

	ArrayList<User> userList = new ArrayList<>();

	public void addUser() {
		User us1 = new User(18, 1, "��");
		User us2 = new User(19, 2, "��");
		User us3 = new User(20, 3, "��");
		userList.add(us1);
		userList.add(us2);
		userList.add(us3);
		System.out.println("���");
		for (Object o : userList) {
			System.out.println(o);
		}
	}

	public void delUser() {

		userList.remove(2);
		System.out.println("ɾ��");
		for (Object o : userList) {
			System.out.println(o);
		}
	}

	public void showUsers() {
		System.out.println("��ʾ");
		for (Object o : userList) {
			System.out.println(o);
		}

	}

	public void updUser() {

		System.out.println("�޸�");
		User u = (User) userList.get(1);

		u.setId(4);
		u.setName("��");
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
