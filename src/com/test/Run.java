package com.test;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		int choice=0;
		//Dept dept = new Dept();

		do {
			System.out.println("Choose an Option");
			System.out.println("1. List a department");
			System.out.println("2. Update a deprtment");
			System.out.println("3. Modify a deprtment ");
			System.out.println("4. Add a department");

			Scanner sc=new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				getAllDept();
				break;
			case 2: 
				updateDeptNo();
				break;
			case 3:
				deleteDeptNo();
				break;
			case 4:
				addDept();
				break;
			}
		}while(choice!= 5);
	}
}
