package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

	public static void main(String[] args) {
		try {
			//1. Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjuly25", "root", "mitha14");
			//3. prepare statement
			Statement st = con.createStatement();
			//4. execute Query
			st.executeUpdate("create table Student(sid int, sname varchar(40), scourse varchar(40))");
			//5. close connection
			st.close();
			con.close();
			System.out.println("Student table created successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
