package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

	protected static Connection conn = null;

	private static void setConnection() {
		String url = "jdbc:postgresql://localhost:5432/golf";
		Properties props = new Properties();
		props.setProperty("user","postgres");
		props.setProperty("password","admin");
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, props);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
	
	public static Connection getConnection() {
		if (conn == null) {
			setConnection();
		}
		return conn;
	}
	
	 public static void closeConnection() {
	    if (conn != null) {
	      try {
          conn.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
	      conn = null;
	    }
	  }

}
