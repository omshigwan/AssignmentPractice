package com.assignment1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CarPoolTest {

	public static void main(String[] args) throws ParseException {


		 Scanner scanner = new Scanner(System.in);
		 SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		 
		 System.out.println("Member1: ");
		 Member member1 = new Member();
		 member1 = createMember(scanner,sdf);
		 
		 System.out.println("Member2: ");
		 Member member2 = new Member();
		 member2 = createMember(scanner,sdf);
		 
		 System.out.println(member1);
		 
		 System.out.println(member2);
		 
		 /*return the "isSameMember()" method which check if two members are same on email and
		 contactNumber basis.*/
		 member1.isSameMember(member2);
		 
}
	
	
	//method to take input from user and create a Member object with given attributes.
	public static Member  createMember(Scanner scanner,SimpleDateFormat sdf) throws ParseException{

		Member member = new Member();
		
		System.out.println("Enter Member Details: ");
		
		System.out.print("id: ");
		member.setId(scanner.nextLong());
		scanner.nextLine(); //to consume line created by nextlong() , which sometimes give weird output
				
		System.out.print("first name: ");
		member.setFirstName(scanner.nextLine());
		
		System.out.print("last name: ");
		member.setLastName(scanner.nextLine());
		
		System.out.print("email: ");
		member.setEmail(scanner.nextLine()) ;
		
		System.out.print("contact number: ");
		member.setContactNumber(scanner.nextLine());
		
		System.out.print("license number: ");
		member.setLicenseNumber(scanner.nextLine());
		
		System.out.print("license start date: ");
		member.setLicenseStartDate(sdf.parse(scanner.nextLine()));
		
		System.out.print("license expiry date: ");
		member.setLicenseExpiryDate(sdf.parse(scanner.nextLine()));
		
		
		
		return  member;
	}

	

}

