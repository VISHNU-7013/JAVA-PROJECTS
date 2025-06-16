package professional;

import java.sql.*;

public class JdbcTest {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","v3390");
			
			String insertSQL = "REPLACE INTO students Values(?, ?)";
			
			PreparedStatement pstmt = con.prepareStatement(insertSQL);
			
			Object[][] students = {
					{1,"Alice"},
					{2,"Bob"},
					{3,"Vishnu"},
					{4,"Venkat"},
					{5,"Basi"},
					{6,"Dada"}
			};
			
			for(Object[] student : students) {
				pstmt.setInt(1,(int) student[0]);
				pstmt.setString(2,(String) student[1]);
				pstmt.executeUpdate();
			}
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM students");
			
			System.out.println("Student List:");
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name"));
			}
			con.close();
		}
			catch(Exception e) {
				e.printStackTrace();
			}

	}

}
