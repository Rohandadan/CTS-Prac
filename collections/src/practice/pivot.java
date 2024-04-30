package practice;

import java.util.Scanner;

public class pivot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no:");
		int n = sc.nextInt();
		int ans = -1;
		if(n==1) {
			ans=1;
		}
		else {
		for(int i =1;i<=n;i++) {
			int sum1 =0;
			int sum2 =0;
			for(int a =0;a<=i;a++) {
				sum1=sum1+a;
			}
			for(int b =i;b<=n;b++) {
				sum2=sum2+b;
			}
			ans=i;
			if(sum1==sum2)
				break;
		}
		}
		
		
//		int sum1 = 0;
//		int sum2 = 0;
//		int i = 1;
//		do {
//			for (int a = 0; a <= i; a++) {
//				sum1 = sum1 + a;
//			}
//			for (int b = i; b <= n; b++) {
//				sum2 = sum2 + b;
//			}
//			i++;
//		} while (sum1 != sum2);
//		ans=i;
		
		
		if (ans == 1) {
			System.out.println(1);
		} 
		else if(ans==n) {
			System.out.println(-1);
		}
		else {
			System.out.println(ans);
		}
	}

}
