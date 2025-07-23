package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjuly25", "root", "mitha14");
			PreparedStatement st = con.prepareStatement("insert into Student values(?,?,?)");
			st.setInt(1, 102);
			st.setString(2, "abc");
			st.setString(3, "java");
			int noOfRows = st.executeUpdate();
			System.out.println("no. of rows inserted"+noOfRows);
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
