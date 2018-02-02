package projekti.modelDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataAccessObject {

	protected static Connection getConnection() {
		Connection connection = null;

		String username = "a1600556";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/a1600556";

		
		try {
			Class.forName("org.mariadb.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return connection;
	}
	
	protected static void close(Statement stmt, Connection connection) {
		close (null, stmt, connection);
	}

	
	protected static void close(ResultSet rs, Statement stmt, Connection conn ) {
		
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) { 
				stmt.close();
			}
			if (conn != null) { 
				conn.close();
			}
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}