package com.digit.java.project3;

import java.util.Scanner;

class admin
{
	String user;
	String password;
}
public class coursemanagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to  Course Registration!");
		System.out.println("----------------------------------------");
		System.out.println();
		admin a=new admin();
		a.user="admin";
		a.password="admin";
		System.out.println("Enter Admin ID: ");
		String str;
		str=sc.next();
		System.out.println("Enter Password: ");
		String pass;
		pass=sc.next();
		
		

	}

}
