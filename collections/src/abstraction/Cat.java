package abstraction;

public class Cat{
	protected int id, age;
	protected String name;
	public Cat(int id, int age, String name) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.id =id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
