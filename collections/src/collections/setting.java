package collections;
import java.util.*;

public class setting {
	public static void main(String[] args) {
//		Set <String> q = new HashSet<>();
//		q.add("ram");
//		q.add("helo");
//		q.add("okay");
//			if(q.contains("helo")) {
//				System.out.println("true");
//			}
//		System.out.println(q);
//		Set <String> q = new TreeSet<>();
//		q.add("rahul");
//		q.add("joya");
//		q.add("akhil");
//		q.add("varun");
//		q.add("joya");
//		
//		Iterator<String> s = q.iterator();
//		while(s.hasNext()) {
//			System.out.println(s.next());
//		}
		
		



//		        Map<String, Integer> population = new TreeMap<>();
//		        population.put("New York", 8537673);
//		        population.put("London", 8982000);
//		        population.put("Tokyo", 13929286);
//		        population.put("Hyd", null);
//
//		        // Printing all cities and their populations
//		        for (Map.Entry<String, Integer> entry : population.entrySet()) {
//		            System.out.println(entry.getKey() + ": " + entry.getValue());
//		        }
		
		
		
		int [] r = new int[3];
		
		Scanner sc= new Scanner(System.in);
		
//		r[0] =  sc.nextInt();
//		r[1] = sc.nextInt();
//		r[2] = sc.nextInt();
		
		for(int i =0;i<3;i++) {
			r[i]=sc.nextInt();
		}
		
		
		
		
		int temp =0;
		for(int i =0;i<=r.length;i++){
		for(int j=i+1; j<r.length;j++){
		if(r[i]>r[j]){
		temp=r[i];
		r[i]=r[j];
		r[j]=temp;
		}
		}
		}
		
		
		
		
		
		
		for(int i :r) {
			System.out.println(i);
		}
		
		
		
		    }
		}
