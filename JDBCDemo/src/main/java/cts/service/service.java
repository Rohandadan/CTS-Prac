package cts.service;

import java.util.Random;
import java.util.Scanner;

import cts.DAO.DB;
import cts.beans.Account;

public class service {
	static Scanner sc = new Scanner(System.in);
	
	public void createAccount() {
		DB db = new DB();
		String meterno = generator();
//		System.out.println(meterno);
		System.out.println("Enter Your Name");
		String name = sc.next();
		System.out.println("Enter Sectorno:");
		int sectorno = sc.nextInt();
		System.out.println("Enter Phone no:");
		String phoneno = sc.next();
		int due=0;
		int reading =0;
		int oreading = 0;
		String date="2024-03-01";
		
		new Account(meterno,name,sectorno,phoneno,due,reading,oreading);
		boolean insert = db.insert(meterno);
		if(insert) {
			System.out.println("Your Account Number is: " + meterno);
			System.out.println("Successfully Registered");
		}
	}
	public void updatereading() {
		System.out.println("Enter Meter No:");
		String meterno = validateStringDIGITS("Meter no");
		
		System.out.println("Enter the new Readings");
		int reading = validateIntValues("Reading");
		DB  x =  new DB();
		boolean ab = x.updateReading(meterno,reading);
		if(ab) {
			System.out.println("Successfully Updated");
		}
		
	}
	public void generateBill() {
		System.out.println("Enter Meter No:");
		String meterno = validateStringDIGITS("Meter no");
//		int x = validateIntValues("Sector no");
//		int ans =0;
//		if(x<=3) {
//			ans=3;
//		}
//		else {
//			ans=4;
//		}
		DB  x =  new DB();
		boolean ab = x.generateBill(meterno);
		if(ab) {
			System.out.println("Successfully Generated");
		}
	}
	public void knowyourdue() {
		System.out.println("Enter Meter No:");
		String meterno = validateStringDIGITS("Meter no");
		DB  x =  new DB();
		boolean ab = x.knowyourbill(meterno);
		if(ab) {
			System.out.println("Thank you!");
		}
	}
	public void deleteAccount() {
		System.out.println("Enter Meter No:");
		String meterno = validateStringDIGITS("Meter no");
		DB  x =  new DB();
		boolean ab  = x.deleteaccount(meterno);
		if(ab) {
//			System.out.println("Thank You");
		}
		
	}
	public void updatedetails() {
		System.out.println("Enter Meter No:");
		String meterno = validateStringDIGITS("Meter no");
		String cvalue = "";
	    int cdetails = 0;
		System.out.println("\n1.Name\n"
				+"2.Phone No\n"
				+ "Enter No for update");
		int x= sc.nextInt();
		if(x==1) {
			System.out.println("Enter Name:");
			cvalue = sc.next();
			cdetails =1;
			
		}
		else if(x==2) {
			System.out.println("Enter New Phone No:");
			cvalue = validateStringDIGITS("Phone no");
			cdetails = 2;
			
		}
		DB db =  new DB();
		boolean ab  = db.updatedetails(meterno,cvalue,cdetails);
		if(ab) {
			System.out.println("Successfully Updated");
		}
	}
	
	public String generator() {
		Random r = new Random();
//		StringBuilder sb = new StringBuilder(length);
//		for (int i = 0; i < length; i++) {
//			sb.append(r.nextInt(10));
//		}
//		return sb.toString();
		
		int num = r.nextInt(9000)+1000;
		String num1 = Integer.toString(num);
		return num1;
	}
	public String validateStringDIGITS(String str) {
		String name;
		boolean b = true;
		do {
			name = sc.next();
			if (name.matches("[0-9]*")) {
				b = false;
			} else {
				System.out.println("Please enter correct " + str);
			}
		} while (b);
		return name;
	}
	public int validateIntValues(String str) {
		int value = 0;
		boolean b = true;
		do {
			while (!sc.hasNextInt()) {
				System.out.println("Please enter correct " + str);
				sc.next();
			}
			value = sc.nextInt();
			b = false;
		} while (b);
		return value;

	}
	public boolean isMeterNoCorrect(String meterNo, String meterno1) {
		if (meterNo.equalsIgnoreCase(meterno1)) {
			return true;
		} else {
			System.out.println("Meter Number Not Found");
			return false;
		}
	}


	
}
