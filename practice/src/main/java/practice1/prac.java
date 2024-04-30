package practice1;

import java.util.*;

public class prac {

	public static void main(String[] args) {
//		int arr[]= new int[4];
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 4 ");
//		for(int i =0;i<4;i++) {
//			arr[i]=sc.nextInt();
//		}
//		
//		int temp;
//		for(int i=0;i<4;i++) {
//			for(int j =i+1;j<4;j++) {
//				if(arr[i]>arr[j]) {
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
		
//		
//		List<Integer> lis =new ArrayList<>();
//		
//		System.out.println("Enter 4 ");
//		for(int i =0;i<4;i++) {
//			lis.add(sc.nextInt());
//		}
//		
//		Collections.sort(lis);
//		
//		for(int i :lis) {
//			System.out.println(i);
//		}
		
		List<Integer> x = new ArrayList<>();
		x.add(10);
		x.add(26);
		x.add(34);
		x.add(56);
		x.add(78);
		
	
		
//		x.stream().filter(k->k>33).map(y->y-1).sorted().forEach(t->System.out.println(t));	
		int k = x.stream().distinct().skip(x.size()-2).findFirst().orElse(-1);
//		forEach(t->System.out.println(t));	
		System.out.println(k);
	}
	
}
