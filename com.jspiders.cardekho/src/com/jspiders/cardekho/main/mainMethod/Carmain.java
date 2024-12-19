package com.jspiders.cardekho.main.mainMethod;

import java.util.Scanner;

import com.jspiders.cardekho.main.operation.carOperation;

public class Carmain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		carOperation carOperation=new carOperation();
		boolean flag=true;
		while(flag) {
			System.out.println("=============================Car Dekho Application==============================");
			
			System.out.println("Enter 1 to add car Details: /n Enter 2 remove car details: /n Enter 3 to update car details:/n"
					+"Enter 4 to search car details:/nEnter 5 to Exit");
			
			System.out.println("Enter your choice ");
			int choice=scanner.nextInt();
			switch (choice) {
			
			case 1:{ 
				    carOperation.add(scanner);
					break;
			}
			
			case 2:{
				carOperation.remove(scanner);
				break;
			}
			
			case 3:{
				carOperation.update(scanner);
				break;
			}
			
			case 4:{
				carOperation.search();
				break;
			}
			
			case 5:{
				System.out.println("Thank You");
				flag=false;
				break;
			}
			default:
				System.out.println("Invalid choice");
			}
		}
				
		
	
	}
}
