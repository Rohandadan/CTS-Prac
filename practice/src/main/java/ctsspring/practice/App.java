package ctsspring.practice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	@SuppressWarnings("resource")
    	
//    	APPLICATION CONTEXT
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println( "Hello World!" );
        
        
        tyre k = context.getBean("tyre",tyre.class);
        System.out.println(k.tostring());

//      BEAN PROPERTY

//        Bike x= context.getBean("bike",Bike.class);
//    	x.drive();
    	
//      GETTERS , SETTERS AND CONSTRUCTOR
//    	tyre k = context.getBean("tyre",tyre.class);
//
//    	System.out.println("Company: "+k.getCompany());
//
//    	System.out.println("Tyre : "+k.getBrand());
        
//        tyre t= context.getBean("tyre",tyre.class);
//        System.out.println(t.tostring());
        
//        Bike b = context.getBean("bike",Bike.class);
//        b.drive();
    
    }
}
