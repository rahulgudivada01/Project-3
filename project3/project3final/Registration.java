package com.digit.project3final;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Registration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		admin ad = new admin();
		Professor_Details p = new Professor_Details();
		Student_Details s = new Student_Details();
		System.out.println("***------------***--------------***");
		System.out.println();
		System.out.println("Welcome to Course Registration");
		System.out.println();
		System.out.println("***------------***--------------***");
		int count = 0;
		boolean login = false;
		while(login==false) {
			System.out.println("Enter Username : ");
			String uname = sc.next();
			System.out.println("Enter Password : ");
			String pword = sc.next();
			login = ad.login(uname, pword);
			if(login==false) {
				System.out.println("Wrong details.");
				System.out.println("Pease try again with correct details.");
				count++;
			}
			if(count==2 && login==false) {
				System.out.println("Choosing the incorrect option will result in you being logged out.");
			}
			if(count==3 && login==false) {
				System.exit(0);
			}
		}
		System.out.println("\nWelcome ADMIN");
		System.out.println();
		ad.AddCourse();
		ad.AddProf();
		ad.AddStud();
		while(true) {
			System.out.println("\nSelect one of the options from the following : \n1. Admin\n2. Professor\n3. Student\n4. Exit");
			try {
				int m = sc.nextInt();
				if(m==1) {
					login = false;
					while(login==false) {
						System.out.println("Enter Username : ");
						String uname = sc.next();
						System.out.println("Enter Password : ");
						String pword = sc.next();
						login = ad.login(uname, pword);
						if(login==false) {
							System.out.println("Wrong details.");
							System.out.println("Pease try again with correct details.");
							count++;
						}
						if(count==2 && login==false) {
							System.out.println("Choosing the incorrect option will result in you being logged out.");
						}
						if(count==3 && login==false) {
							System.exit(0);
						}
					}
					while(true) {
						System.out.println("\nSelect one of the options from the following : \n1. Add Course\n2. Add Professor\n3. Add Student\n4. All Professors \n5. All Students\n6. Exit");
						int n = sc.nextInt();
						if(n==1) {
							ad.AddCourse();
						}
						else if(n==2) {
							ad.AddProf();
						}
						else if(n==3) {
							ad.AddStud();
						}
						else if(n==4) {
							ad.getprofessor();
						}
						else if(n==5) {
							ad.getstudent();
						}
						else {
							break;
						}
					}
				}
				else if(m==2) {
					p.login();
				}
				else if(m==3) {
					s.login();
				}
				else if(m==4) {
					System.out.println("Exited\n");
					System.exit(0);
				}
				else {
					System.out.println("Select option only from 1 to 4 only");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please provide an Integer input only as there is a mismatch with the current input");
				System.exit(0);
			}
		}
		
	}
}
