package practice;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class arraylist_prac {
	public static void main(String[] args) {
		List <String> d = new LinkedList<>();
		
	d.add("rohan");
	d.add("dadan");
	d.add("rahul");
	d.add("ram");
	d.add("arjun");
	System.out.println(d);
	d.add(0, "welcome");
	System.out.println(d.contains("rohan"));
	
	
//	int temp =0;
//	Set <Integer> s=new TreeSet<>();
//	for(int i =0;i<=d.size();i++) {
//		for(int j =i;j<=d.size();j++) {
//			if((d.get(i)=="rohan")&&(d.get(i)==d.get(j))) {
//				temp=j;
//			}
//			s.add()
//			
//		}
//		
//	}
	
	}
}
