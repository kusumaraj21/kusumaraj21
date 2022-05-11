package pack_capgemini;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CrudDb {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://localhost:3306/bhoomi";
		String username="root";
        String password="bhoomikar@1709";
        
        
        try
        {
        Connection con=DriverManager.getConnection(dbURL, username, password);
        String sql="DELETE from Emp1 WHERE user_id=2";
        PreparedStatement s=con.prepareStatement(sql);
        int rows=s.executeUpdate();
        if(rows>0)
        {
        	System.out.println("A new user information deleted successfully");
        }
        con.close();
        }
        
        
        
       /* try
        {
        Connection con=DriverManager.getConnection(dbURL, username, password);
        String sql="SELECT *from Emp1";
        Statement st=con.createStatement();
        ResultSet r=st.executeQuery(sql);
        int count=1;
        while(r.next())
        {
        	
        	String name=r.getString(2);
        	String password1=r.getString(3);
        	String email=r.getString(4);
        	String result="User: %d %s %s %s";
        	System.out.println(String.format(result,count++,name,password1,email));
        }
        con.close();
        }*/
        
        
        
       /* try
        {
        Connection con=DriverManager.getConnection(dbURL, username, password);
        String sql="UPDATE Emp1 SET user_name=?,password=? WHERE user_id=1";
        PreparedStatement s=con.prepareStatement(sql);
        
        s.setString(1,"bumishetty");
        s.setString(2,"bumishetty@123");
       // s.setInt(3,1);
        
        int rows=s.executeUpdate();
        if(rows>0)
        {
        	System.out.println("A new user information entered successfully");
        }
        con.close();
        }*/
        
        
        
       /* String sql="SELECT * FROM Emp1";
       Statement st=con.createStatement();
        ResultSet r=st.executeQuery(sql);
        int count=1;
        while(r.next())
        {
        	
        	String name=r.getString(2);
        	String password1=r.getString(3);
        	String email=r.getString(4);
        	String result="User: %d %s %s %s";
        	System.out.println(String.format(result,count++,name,password1,email));
        }
        con.close();*/
       /* String sql="INSERT INTO Emp1(user_name,password,email)values(?,?,?)";
         PreparedStatement s=con.prepareStatement(sql);
       
        s.setString(1,"bumi");
        s.setString(2,"bumi@123");
        s.setString(3,"bumi@gmail.com");
        int rows=s.executeUpdate();
        if(rows>0)
        {
        	System.out.println("A new user information entered successfully");
        }
        con.close();*/
        
           catch(SQLException e)
           {
        	   System.out.println("Exception occured" +e);
           }
	}
}