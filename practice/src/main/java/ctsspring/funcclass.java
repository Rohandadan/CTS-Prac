package ctsspring;

public class funcclass {
	public static void main(String[]args) {
		funtinter s = (int a, int b) -> {if(a>b) {return(a);}
										else{return(b);}};
		
		System.out.println(s.funmethod(2,6));

	}
}
