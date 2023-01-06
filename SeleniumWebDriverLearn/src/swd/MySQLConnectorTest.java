package swd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectorTest 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		System.out.println("Test Start");

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","");
		
		
		Statement stmt=con.createStatement();

		ResultSet rs=stmt.executeQuery("select * from student");
		
		while(rs.next())
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));
		
		con.close();

		
		System.out.println("Test End");

	}

}
