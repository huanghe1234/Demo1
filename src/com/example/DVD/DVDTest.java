package com.example.DVD;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @Title: DVDTest.java
 * @Package: com.example.DVD
 * @Description: ���DVD������ɾ�Ĳ�
 *
 * @author Administrator
 * @date 2017��11��18������9:42:17
 * @version 1.0
 */
public class DVDTest {

	// --����һ������,��������ΪDVD
	ArrayList<DVD> list = new ArrayList<>();
	private int i;

	public static void main(String[] args) {

		String name = "";
		int i = 0;

		DVDTest dt = new DVDTest();

		// --����DVD�Ķ���,�����������DVD����,DVDID
		DVD d1 = new DVD("������ҵ", 1);
		DVD d2 = new DVD("�����ſ�ջ", 2);
		DVD d3 = new DVD("���ߵ���ȭ", 3);
		DVD d4 = new DVD("�����ʦ", 4);
		DVD d5 = new DVD("�ս���", 5);

		dt.list.add(d1);
		dt.list.add(d2);
		dt.list.add(d3);
		dt.list.add(d4);
		dt.list.add(d5);

		// --��ӡ�鿴ÿ���±��Ӧ��Ԫ��
		// --System.out.println(dt.list.get(0));

		/*--����Ҳ���Բ�������ķ�����������,����ѭ��,����Ҳ��ѭ����ӡ������
			for(int i = 1 ; i < 5 ; i++) {
			dt.list.add(new DVD("DVD"+i,i+1));
			}
		 */
		// --��ʾ�ü��ϵ�����Ԫ��,���ñ����ķ���
		for (DVD d : dt.list) {
			System.out.println(d);
		}

		
		dt.delDvdbyName(); // --ͨ��������ɾ��
		

	}

	// ����DVD�ķ���
	@SuppressWarnings("unused")
	public void addDvd() {
		Scanner scan = new Scanner(System.in);
		//--DVD dvd = new DVD(name, i);
		// --������
		/*if (dvd == null) {
			throw new IllegalArgumentException("��ӵ�DVDΪ��");
		}
		*/
		System.out.println("������Ҫ��ӵ�Dvd����");
		String name = scan.next();
		int i = list.size() + 1;
		DVD dvd = new DVD(name, i);
		
		// --�������������dvd
		list.add(dvd);
		System.out.println("�����dvd����:" + dvd);
	}

	/*
	 * ����dvdId�ķ���,��Ϊ��Dvd���͵�,���治������ַ����� public int createId() {
	 * list.add((list.size()+1)); return list.size(); }
	 */

	// "ɾ��"DVD�ķ���,����DVDname��ɾ��
	public void delDvdbyName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������Ҫɾ����DVD����");
		String dvdname = scan.next();

		// --������
		if (dvdname == null || dvdname.length() == 0) {
			throw new IllegalArgumentException("��Ҫɾ����DVD������");
		}
		// --�鿴���������Ԫ��,���ó���forѭ��
		
		for (int j = 0 ;j<list.size();j++) {  //
			if (list.get(j).getName().equals(dvdname)) {
				list.remove(j); //�Ƴ�ָ���±��Ԫ��
				System.out.println("ɾ������" + dvdname);
			}			
		}
		
		for (int j = 0;j<list.size();j++) {
			System.out.println(list.get(j));
		}

	}

	// "��д"DVD�ķ���,ͨ��id����д
	public void reviseById() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������Ҫ��д��dvdID");
		int i = scan.nextInt();
		
		System.out.println("����Ҫ������dvd����");
		String dvdname = scan.next();
		int j = list.size() + 1;
		DVD d2 = new DVD(dvdname, j);
		
		for (DVD d : list) {
			if (d.getId() == i) {
			list.set(i, d2);			
			} 					
		}	
		System.out.println("�޸�֮���DVDΪ");	
		for(DVD d3 : list) {
			System.out.println(d3);
		}

	}

	// "��ѯ"�Ƿ��и�DVD�ķ���,ͨ��id����ѯ
	public void queryByName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������Ҫ��ѯ��dvd����");
		String name = scan.next();
		
		
		DVD d = new DVD(name,4);

		for (DVD d1 : list) {
			if (list.contains(d)) {
				System.out.println("���и�dvd");
			}
		}
		
		
		scan.close();
		

	}

}
