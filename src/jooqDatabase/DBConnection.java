package jooqDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.jooq.*;
import org.jooq.impl.DSL;

import com.golf.tables.Golfer;

import static com.golf.Tables.*;

public class DBConnection {

	protected static Connection conn = null;

	public static void setConnection() {
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
	
	public static void main(String[] args) throws SQLException {
		
		setConnection();

		System.out.println("Connected");

		String query =  "SELECT * FROM \"GOLFER\" WHERE \"GOLFER_ID\" = 1";	
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);	
		
		System.out.println("Result of executing query");
		
		//looping through the number of row/rows retrieved after executing query2
		while(rs.next()) 	
		{
		  System.out.print(rs.getString("GOLFER_NAME") + "\n");
		}

		System.out.println("***************");

        		
        try  {
            Result<Record> result = new GolferDAO().selectRecords("", "22");
            
            for (Record r : result) {
                String title = r.getValue(GOLFER.GOLFER_TITLE);
                String name = r.getValue(GOLFER.GOLFER_NAME);
                String addr = r.getValue(GOLFER.GOLFER_ADRESS);

                System.out.println("Title: " + title + " Name: " + name + " Address: " + addr);
            }
        } 

        catch (Exception e) {
            e.printStackTrace();
        }
		
        /*
        try  {
            Result<Record> result = new GolferDAO().selectRecord(2);
            
            for (Record r : result) {
                String title = r.getValue(GOLFER.GOLFER_TITLE);
                String name = r.getValue(GOLFER.GOLFER_NAME);
                String addr = r.getValue(GOLFER.GOLFER_ADRESS);
                
                if (r instanceof Golfer) {
                	System.out.println("################### is a Golfer");
                }
                

                System.out.println("Title: " + title + " Name: " + name + " Address: " + addr);
            }
        } 

        catch (Exception e) {
            e.printStackTrace();
        }
        */
		
        
	}
	
	

	
	
	
	
}
