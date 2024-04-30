package Constructor;

public class Main {
	public static void main(String[] args) {
		Student s = new Student(123,10,"Rohan","Male");
		System.out.println(s.getName());
		System.out.println(s.getId());
		System.out.println(s.getStd());
	}
}
