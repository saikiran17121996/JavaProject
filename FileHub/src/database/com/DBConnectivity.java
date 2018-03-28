package database.com;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectivity {

	static Connection c;
	public static Connection createConnection()
	{
		try{
			
		Class.forName("com.mysql.jdbc.Driver");
		c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cc10","root","root");
		
		System.out.println("database connection connected");
		
		
		}catch(Exception z)
		{
			z.printStackTrace();
		}
		return c;
		
	}
	
	
}
