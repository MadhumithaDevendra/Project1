package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjuly25", "root", "mitha14");
			PreparedStatement st = con.prepareStatement("update Student set scourse=? where sid=?");
			st.setString(1, "hibernate");
			st.setInt(2, 102);
			int rowsUpdates= st.executeUpdate();
			System.out.println("rows updated:"+rowsUpdates);
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