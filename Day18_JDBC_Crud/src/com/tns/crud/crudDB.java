package com.tns.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SuppressWarnings("unused")
public class crudDB {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://localhost:3306/CG1";
		String username="root";
		String password="Nayak@1996";
		try
		{
			Connection con=DriverManager.getConnection(dbURL, username, password);
			String sql="SELECt * FROM Employee13";
			
			Statement st=con.createStatement();
			ResultSet r=st.executeQuery(sql);
			int count=1;
			while(r.next())
			{
				int id=r.getInt(1);
				String name=r.getString(2);
				String password1=r.getString(3);
				String email=r.getString(4);
				String res="USER: %d %s %s %s";
				System.out.println(String.format(res, count++, name, password1, email));
			}
			con.close();

			/*Connection con=DriverManager.getConnection(dbURL, username, password);
			String sql="DELETE FROM Employee13 WHERE USER_ID=2";
			
			PreparedStatement s= con.prepareStatement(sql);
			int rows=s.executeUpdate();
			
			if(rows>0)
			{
				System.out.println("A new User information entered successfully");
			}
			con.close();*/
	
			/*Connection con=DriverManager.getConnection(dbURL, username, password);
			String sql="SELECT * FROM Employee13";
			Statement st=con.createStatement();
			ResultSet r=st.executeQuery(sql);
			int count=1;
			while(r.next())
			{
				int id=r.getInt(1);
				String name=r.getString(2);
				String password1=r.getString(3);
				String email=r.getString(4);
				String res="USER: %d %s %s %s";
				System.out.println(String.format(res, count++, name, password1, email));
			}
			con.close();*/
			
		//Connection con=DriverManager.getConnection(dbURL, username, password);
		//String sql="UPDATE Employee13 SET USER_NAME=?,PASSWORD=? WHERE USER_ID=1";
		
		/*PreparedStatement s= con.prepareStatement(sql);
		
		s.setString(1,  "Rohit_M1775");
		s.setString(2,  "admin@421");
		
		
		int rows=s.executeUpdate();
		
		if(rows>0)
		{
			System.out.println("A new User information entered successfully");
		}
		con.close();*/
		
		/*Statement st=con.createStatement();
		ResultSet r=st.executeQuery(sql);
		int count=1;
		while(r.next())
		{
			//int id=r.getInt(1);
			String name=r.getString(2);
			String password1=r.getString(3);
			String email=r.getString(4);
			String res="USER: %d %s %s %s";
			System.out.println(String.format(res, count++, name, password1, email));
		}
		con.close();*/
		
		//for creating the data
		/*String sql= "INSERT INTO Employee13(USER_NAME,PASSWORD,EMAIL)values(?,?,?)";
		PreparedStatement s= con.prepareStatement(sql);
		s.setString(1,  "Rohit_M6775");
		s.setString(2,  "admin@123");
		s.setString(3,  "Rohit_M6775@gmail.com");
		int rows=s.executeUpdate();
		if(rows>0)
		{
			System.out.println("A new User information entered successfully");
		}
		con.close();*/
		
		}
		catch(SQLException e)
		{
			System.out.println("Exception occurred "+e);
		}
	}
		

}