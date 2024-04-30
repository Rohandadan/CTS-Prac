package collections;
import java.util.ArrayList;
import java.util.List;
public class arraylistdemo {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for(int i =10;i<=100;i=i+20) {
//			list.add(i);
//		}
//		list.add(3,80);
//		System.out.println(list);
//		list.set(3, 66);
//		System.out.println(list);
//		List<Integer> list2 = new ArrayList<>(); 
//		for(int i =12;i<=100;i=i+15) {
//			list2.add(i);
//		}
//		list.addAll(list2);
////		System.out.println(list2);
////		System.out.println(list);
//		list.addAll(3,list2);
//		System.out.println(list);
//		
//		if(list2.contains(27)&&list2.contains(57)) {
//			System.out.println("yes");
//		}
//		else {
//			System.out.println("No");
//		}
//		System.out.println(list.get(5));
//		list.remove(5);
//		System.out.println(list.get(5));
//		
		
	//	Splitting
		String[] arr;
		String sp ="rohan .dad.an";
		arr=sp.split("[ .]+");
		List<String> lis = new ArrayList<>();
//		System.out.println(arr[1]);
		for(String i :arr) {
			lis.add(i);
		}
		System.out.println(lis);
		
	}

}
