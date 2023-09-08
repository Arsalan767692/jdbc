package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class log {
    private static final String Sysout = null;

    public static void main (String args[]) throws Exception
    {
        
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/core","root","Welcome@123456");

	Scanner sc=new Scanner(System.in);
    String pass, user;
    System.out.println("***********Welcome to login page*********");
    System.out.println("Enter user or email");
    user=sc.next();
    System.out.println("Enter password");
    pass=sc.next();
    String q="select * from reg where (user='"+user+"' OR email='"+user+"') AND pass='"+pass+"'";
    
		PreparedStatement psmt=conn.prepareStatement(q);
        ResultSet rs=psmt.executeQuery();
        if(rs.next())
		{
			System.out.println("Login Success");
			
			
		}
		else
		{
			System.out.println("Invalid USername or Password");
            jdbc j=new jdbc();
            j.main(args);

    }
}
}
