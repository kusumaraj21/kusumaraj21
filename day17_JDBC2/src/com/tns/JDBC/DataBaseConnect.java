package com.tns.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnect {

	public static void main(String[] args) throws SQLException {
		String dbDriver="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://localhost:3306/CG1";
		String username="root";
		String password="Nayak@1996";
		String query="SELECT * FROM Employee12";
		try
		{
			Class.forName(dbDriver);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
		Connection con=DriverManager.getConnection(dbURL, username, password);
		Statement st=con.createStatement();
		ResultSet r=st.executeQuery(query);
		while(r.next())
		{
			String EmployeesData="";
			for(int i=1;i<=3;i++)
			{
				EmployeesData=EmployeesData+" "+r.getString(i);
			}
			System.out.println(EmployeesData);
			}
		}
		catch(SQLException e)
		{
			System.out.println("Invalid Username and password");
		}
		
	}
		
}