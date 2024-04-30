package cts.DAO;
import java.sql.*;
import cts.beans.*;
import cts.service.*;
import java.time.LocalDate;

public class DB {
	static Connection con = null;
	
	public Boolean connect2DB() throws SQLException {
		try {
		String url = "jdbc:mysql://localhost:3306/demo";
		con = DriverManager.getConnection(url, "root", "root");
		return true;
		}
		catch(SQLException e) {
			System.out.println("Connection not established");
			return false;
		}
	}
	
	public boolean insert(String meterno){
		Account a =  new Account();
//		System.out.println(a.getMeterno());
		try {
			
			PreparedStatement p = con.prepareStatement("insert into account values(?,?,?,?,?,?,?,?)");
			p.setString(1, meterno);
			p.setString(2, a.getName());
			p.setInt(3, a.getSectorno());
			p.setString(4, a.getPhoneno());
			p.setInt(5, a.getDue());
			p.setInt(6, a.getReading());
			p.setInt(7, a.getOreading());
			p.setString(8,a.getDate() );
			p.execute();
			return true;
			
		}
		 catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Something went Wrong....\nTry again later :)");
			return false;
		 }
	}
	public boolean updateReading(String meterNo, int reading) {
		try {
			String meterNo1=helperString(meterNo, "meterno");
			service ser = new service();
			if(ser.isMeterNoCorrect(meterNo,meterNo1)) {

				PreparedStatement p = con
						.prepareStatement("update account set oreading = reading, reading = reading + ? where meterno = ?");
				
				p.setInt(1,reading );
				p.setString(2, meterNo);
				p.execute();
				return true;
			}
			return false;
		} catch (SQLException e) {
//			e.printStackTrace();
			System.out.println("Something went Wrong....\nTry again later :)");
			return false;
		}
	}
	public boolean generateBill(String meterNo) {
		try {
			String meterNo1=helperString(meterNo, "meterno");
			service ser = new service();
			if(ser.isMeterNoCorrect(meterNo,meterNo1)) {
				LocalDate localDate = LocalDate.now();
			    String formattedString = localDate.toString();
				PreparedStatement p = con
						.prepareStatement("update account set due=(reading-oreading)*4, date=? where meterno = ?");
				p.setString(2, meterNo);
				p.setString(1, formattedString);
//				p.setInt(1, x);
				p.execute();
			return true;
			}
			return false;
		} catch (SQLException e) {
//			e.printStackTrace();
			System.out.println("Something went Wrong....\nTry again later :)");
			return false;
		}
	}
	public boolean knowyourbill(String meterNo) {
		try {
			String meterNo1=helperString(meterNo, "meterno");
			service ser = new service();
			if(ser.isMeterNoCorrect(meterNo,meterNo1)) {
				PreparedStatement ps = con.prepareStatement("select * from account where meterno=?");
				ps.setString(1, meterNo);
				ResultSet rs = ps.executeQuery();
				String metNo="";
				String name="";
				int due = 0;
				int reading = 0;
				int oreading = 0;
				while (rs.next()) {
					metNo=rs.getString("meterno");
					name=rs.getString("name");
					due=rs.getInt("due");
					reading=rs.getInt("reading");
					oreading=rs.getInt("oreading");
				}
//				System.out.println(name+","+"Your Meter Number is "+metNo+","+"Your due is Rs:"+due+","+"Please pay it before 5th of next month");
				System.out.println("-".repeat(60));
				System.out.println("             Electricity bill       ");
				System.out.println("-".repeat(60));
				System.out.println("|| "+ "Name: "+name+"  ---  "+"Meter No: "+metNo+" ||");
				System.out.println("- -".repeat(20));
				System.out.println("|| "+ "Units Consumed: "+(reading-oreading)+"   ---   "+"Due: Rs"+due+" ||");
				System.out.println("- -".repeat(20));
				System.out.println("|| "+"Pay it before 5th of next month to avoid consequences"+" ||");
				System.out.println("-".repeat(60));
			return true;
			}
			return false;
		} catch (SQLException e) {
//			e.printStackTrace();
			System.out.println("Something went Wrong....\nTry again later :)");
			return false;
		}
	}
	public boolean deleteaccount(String meterNo) {
		try {
			String meterNo1=helperString(meterNo, "meterno");
			service ser = new service();
			if(ser.isMeterNoCorrect(meterNo,meterNo1)) {
				PreparedStatement ps = con.prepareStatement("delete from account where meterno=?");
				ps.setString(1,meterNo);
				int l = ps.executeUpdate();
				if(l>0) {
					return true;
				}
				else {
					return false;
					}
			}
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Something went Wrong....\nTry again later :)");
			return false;
		}
	}
	public boolean updatedetails(String meterNo, String value, int ud) {
		try {
			String meterNo1=helperString(meterNo, "meterno");
			service ser = new service();
			if(ser.isMeterNoCorrect(meterNo,meterNo1)) {

				if(ud==1) {
					PreparedStatement ps = con.prepareStatement("update account set name=? where meterno=?");
					ps.setString(1,value);
					ps.setString(2,meterNo);
					int l = ps.executeUpdate();
					if(l>0) {
						return true;
					}else {
					return false;
					}
				}
				else if(ud==2) {
					PreparedStatement ps = con.prepareStatement("update account set phoneno=? where meterno=?");
					ps.setString(1,value);
					ps.setString(2,meterNo);
					int l = ps.executeUpdate();
					if(l>0) {
						return true;
					}else {
					return false;
					}
				}
			return false;
			}
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Something went Wrong....\nTry again later :)");
			return false;
		}
		
	}

	public String helperString(String meterNo,String str) throws SQLException {
		PreparedStatement ps = con.prepareStatement("select * from account where meterno=?");
		ps.setString(1, meterNo);
		ResultSet rs = ps.executeQuery();
		String metNo="";
		String name="";
		while (rs.next()) {
			metNo=rs.getString("meterno");
			name=rs.getString("name");
		}
		if(str.equals("meterno")) {
			return metNo;
		}
		else if(str.equals("name")) {
			return name;
		}
		return "";
	}

	
}
