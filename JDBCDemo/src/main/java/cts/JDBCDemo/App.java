package cts.JDBCDemo;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
import cts.DAO.DB;
import cts.service.*;
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	Scanner sc = new Scanner(System.in);
//        System.out.println( "Hello World!" );
    	DB db = new DB();
        boolean x =db.connect2DB();
        while(x) {
        	
        	System.out.println("\n1.New Connection\n"
        			+"2.Add Reading\n"
        			+"3.Generate Bill\n"
        			+"4.Know Your Due\n"
        			+"5.Update Details\n"
        			+"6.Delete Connection\n"
        			+"7.Exit\n");
        	int selc=sc.nextInt();
        	service s = new service();
        	switch(selc){
        	case 1:
        	s.createAccount();
        	break;
        	case 2:
        	s.updatereading();
        	break;
        	case 3:
        	s.generateBill();
        	break;
        	case 4:
        	s.knowyourdue();
        	break;
        	case 5:
        	s.updatedetails();
        	break;
        	case 6:
        	s.deleteAccount();
        	break;
        	case 7:
            	System.out.println("Thank You");
            	System.exit(0);
            default:
            	System.out.println("Enter the correct value:\n");
        	}
        }
    }
}
