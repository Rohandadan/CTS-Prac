package Constructor;

public class Student {
	private int id,std;
	private String name,gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public void print() {
		System.out.println("Hello!!");
	}
	public Student(int id, int std, String name, String gender) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.std = std;
		this.gender = gender;
		this.id = id;
	}
}
