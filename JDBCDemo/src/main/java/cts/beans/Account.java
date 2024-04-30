package cts.beans;

public class Account {
	private String meterno;
	private String name;
	private int Sectorno;
	private String Phoneno;
	private int due;
	private int reading;
	private int oreading;
	private String date;
	
	
	public String getMeterno() {
		return meterno;
	}
	public void setMeterno(String metern) {
		this.meterno = metern;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSectorno() {
		return Sectorno;
	}
	public void setSectrono(int Sectorno) {
		this.Sectorno = Sectorno;
	}
	public String getPhoneno() {
		return Phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.Phoneno = phoneno;
	}
	public int getDue() {
		return due;
	}
	public void setDue(int due) {
		this.due = due;
	}
	public int getReading() {
		return reading;
	}
	public void setReading(int reading) {
		this.reading = reading;
	}
	public Account(String metern,String name,int sectorno,String phoneno, int due, int reading, int oreading) {
		this.meterno=metern;
		this.name=name;
		this.Sectorno=sectorno;
		this.Phoneno=phoneno;
		this.due=due;
		this.reading=reading;
		this.oreading=oreading;
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public int getOreading() {
		return oreading;
	}
	public void setOreading(int oreading) {
		this.oreading = oreading;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
