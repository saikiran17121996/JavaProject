package implementation.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.com.DBConnectivity;


import bean.com.DataOwnerBean;
import bean.com.RegisterBean;
import bean.com.RegisterBeanO;

import interface1.com.CommanInterface;

public class CommanImplementation implements CommanInterface{

	boolean check = false;
	public int register(RegisterBean refbean) {
Connection con;
int insert = 0; 
try{
	con=DBConnectivity.createConnection();
	PreparedStatement ps=con.prepareStatement("INSERT INTO cc10.`register` VALUES(?,?,?,?)");
	ps.setString(1, refbean.getUsername());
	ps.setString(4, refbean.getPassword());
	ps.setString(2, refbean.getEmail());
	ps.setString(3, refbean.getPhone());
	insert=ps.executeUpdate();	
}catch(Exception f)
{
	f.printStackTrace();
}
return insert;
	}

	@Override
	public boolean login(RegisterBean loginref) {
		
		Connection con;
	
		
		try {
			
			con=DBConnectivity.createConnection();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM cc10.`register` where username=? and password=?");
		ps.setString(1, loginref.getUsername());
		ps.setString(2, loginref.getPassword());
    ResultSet rs= ps.executeQuery();
		
		check=rs.next();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;	
		
	}

	@Override
	public int registerO(RegisterBeanO refbeanO) {
		Connection con;
		int insert = 0; 
		try{
			con=DBConnectivity.createConnection();
			PreparedStatement ps=con.prepareStatement("INSERT INTO cc10.`registero` VALUES(?,?,?,?)");
			ps.setString(1, refbeanO.getUsername());
			ps.setString(4, refbeanO.getPassword());
			ps.setString(2, refbeanO.getEmail());
			ps.setString(3, refbeanO.getPhone());
			insert=ps.executeUpdate();	
		}catch(Exception f)
		{
			f.printStackTrace();
		}
		return insert;
	}

	@Override
	public boolean loginO(RegisterBeanO loginref) {
Connection con;
	
		
		try {
			
			con=DBConnectivity.createConnection();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM cc10.`registero` where username=? and password=?");
		ps.setString(1, loginref.getUsername());
		ps.setString(2, loginref.getPassword());
    ResultSet rs= ps.executeQuery();
		
		check=rs.next();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;	
		
	}

	public int encrypt11(DataOwnerBean upref) {
	Connection con;
	int upload=0;
	
	try{
		con=DBConnectivity.createConnection();
		System.out.println("filename==="+upref.getFilename());
		System.out.println("key===="+upref.getKey());
		
		String filename=upref.getFilename();
		String hashvalue=upref.getKey();
		boolean available=false;
		
		PreparedStatement psdd=con.prepareStatement("SELECT * FROM `cc10`.`encrypteddatabase` where filename='"+filename+"' and key1='"+hashvalue+"'");
		ResultSet rs=psdd.executeQuery();
		
		available=rs.next();
		
		
		if(available==false)
		{
		
		PreparedStatement ps=con.prepareStatement("INSERT INTO cc10.`encrypteddatabase` VALUES(?,?,?,?)");
		ps.setString(1, upref.getFilename());
		ps.setString(2, upref.getKey());
		ps.setString(3, upref.getFilepath());
		ps.setString(4, upref.getOwner());
		upload=ps.executeUpdate();
		
		PreparedStatement ps1=con.prepareStatement("INSERT INTO cc10.`responsetable` VALUES(?,?,?,?,?,?)");
		ps1.setString(1, upref.getFilename());
	    ps1.setString(2, upref.getKey());
		ps1.setString(3, upref.getFilepath());
		ps1.setString(4, upref.getOwner());
		ps1.setString(5, "");
		ps1.setString(6, "");
		
		upload=ps1.executeUpdate();
		
		}
		
		
		
	}catch(Exception d)
	{
		d.printStackTrace();
	}
		
		
		return upload;
	}

	
}
