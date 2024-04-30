package ctsspring.exceptions;

public class nullexcep extends Exception{
	
	
	
	
	
	
	nullexcep(){	
	}
	
	nullexcep(String s){
		super(s);
	System.out.println("error lierugncoigu");
	}
	
	
	
	
	
	public static void dull()throws  ArithmeticException {
		int k=9;
		System.out.println(k/0);
		System.out.println("hello after exception");
		throw new ArithmeticException("yes occured");
	}
	
	
	
	
	
	public static void main(String []args) {
		
		
		
//		try {
//			dull();
//		}
//		catch(Exception e){
//			System.out.println("Exception handled it cant divide by 0");
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Arithmetic exception");
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("Null exception running");
//		}
		
		
		
		
		try {
		int k =0;
		if(k==0) {
			nullexcep we = new nullexcep("it is null");
			throw we;
		}
		else {
			System.out.println(k+1);
		}
		}

		catch(nullexcep e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally");
		}
	}
}
