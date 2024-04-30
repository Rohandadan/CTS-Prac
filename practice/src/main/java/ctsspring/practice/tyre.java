package ctsspring.practice;

public class tyre {
	int k ;
	public void demo(int k ,int p) {
		int sum =k+p;
	}
private String brand;

//public tyre(String brand, String company) {
//	super();
//	this.brand = brand;
//	this.company = company;
//}

private String company;

public String getCompany() {
	return company;
}

public void setCompany(String company) {
	this.company = company;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String tostring() {
	return "working good"+brand +company;
}

}

