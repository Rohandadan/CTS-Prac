package practice1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
//		
//		HashMap<String, Double> emp = new HashMap<>();
//		
//		emp.put("Abhi", 120000.0);
//		emp.put("sravya", 10000.0);
//		emp.put("akhil", 190000.0);
//		
//		Stream<Map.Entry<String, Double>> map = emp.entrySet().stream();

		int k=5;
		int c=0;
		for(int i =2;i<k/2;i++) {
			if(k%i==0) {
				c++;
			}
		}
		if(c>0) {
			System.out.println("not");
		}
		else {
			System.out.println("yes");
		}
	}
}
