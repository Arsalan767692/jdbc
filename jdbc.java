package jdbc;
import java.sql.*;
import java.util.*;



public class jdbc {
    public static void main (String args[]) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/core","root","Welcome@123456");

		Scanner sc=new Scanner(System.in);
       
       int choice;
        
        while (true)
        
        {
        System.out.println("Enter your choice :\n 1.reg \n 2.login");
        choice=sc.nextInt();
        if (choice==1)
        {
           break;
        }
        else if(choice==2)
        {
             log d=new log();
            d.main(args);
            break;

        }
        else
        {
            System.out.println("Invalid choice");

        }
    }


        String user,pass,email,epass;
        int age;
        System.out.println("Enter Username");
		user=sc.next();
        System.out.println("Enter your email");
        email=sc.next();
        System.out.println("Enter password");
        pass=sc.next();
		
		System.out.println("Renter Password:");
		epass=sc.next();
        System.out.println("Enter age");
        age=sc.nextInt();
        String q="insert into reg(user,pass,email,age) values ('"+user+"','"+pass+"','"+email+"','"+age+"')";
        
        PreparedStatement psmt=conn.prepareStatement(q);
		
		int row =psmt.executeUpdate();
        if(row>0)
		{
			System.out.println("Save Success");
            log d=new log();
            d.main(args);
        }
        else
        {
            System.out.println("no success");
        }
		
		

        
		
		
        
		
		
    }

    
}
