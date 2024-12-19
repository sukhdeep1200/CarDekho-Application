package com.jspiders.cardekho.main.operation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.jspiders.cardekho.main.entity.car;



public class carOperation {
	ArrayList<car>arrayList=new ArrayList<car>();
	
	public void add(Scanner scanner) {
		
		 System.out.println("Enter car ID");
		 car car = new car();
		 car.setId(scanner.nextInt());
		 System.out.println("Enter car name");
		 scanner.nextLine();
		 car.setName(scanner.nextLine());
		 System.out.println("Enter car brand");
		 car.setBrand(scanner.nextLine());
		 System.out.println("Enter car price");
		 car.setPrice(scanner.nextDouble());
		 
		 arrayList.add(car);
		 System.out.println("Car is added");
;	}
	
	public void remove(Scanner scanner) {
		System.out.println("Enter Id of the car to remove details:");
		int idToRemove=scanner.nextInt();
		
		Iterator<car>iterator=arrayList.iterator();
		while(iterator.hasNext()) {
			car car =iterator.next();
			if(car.getId()==idToRemove) {
				iterator.remove();
				System.out.println("Car with ID"+idToRemove+"removed successfully");
				return;
				
			}
		}
		System.out.println("Car with ID "+idToRemove+"not found");
		
	}
	
	public void update(Scanner scanner) {
		System.out.println("Enter ID of the car that you want to update");
		int idToUpadate=scanner.nextInt();
		
		for(car car :arrayList) {
			if(car.getId()==idToUpadate) {
				System.out.println("Enter new name ");
				car.setName(scanner.next());
				
				System.out.println("Enter new brand ");
				car.setBrand(scanner.next());
				
				System.out.println("Enter new price ");
				car.setPrice(scanner.nextDouble());
				
				System.out.println("car with ID "+idToUpadate+"updated successfully");
				return;	
			}
		}
		System.out.println("Car with ID "+idToUpadate+"not found");
		
	}
	
	public void search() {
		
		System.out.println("========================================");
		System.out.println("===========Details Of the cars==========");
		System.out.println("========================================");
		
		for(car details:arrayList) {
			System.out.println(details);
		}
		
		System.out.println("========================================");
		
		//System.out.println(arrayList[0]);
		
		
	}
}
