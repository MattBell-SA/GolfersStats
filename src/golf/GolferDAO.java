package golf;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.DBConnection;

public class GolferDAO {


	public void update(Golfer golfer) {
    Connection conn = DBConnection.getConnection();
    String query =  "UPDATE \"GOLFER\" SET \"GOLFER_TITLE\"=?, \"GOLFER_NAME\"=?, \"GOLFER_ADRESS\"=?, \"GOLFER_HOME_COURSE\"=? "
        + " WHERE \"GOLFER_ID\"=?";
    PreparedStatement stmt = null;
    try {
      stmt = conn.prepareStatement(query);
      stmt.setString(1, golfer.getGolferTitle());
      stmt.setString(2, golfer.getGolferName());
      stmt.setString(3, golfer.getGolferAddress());
      stmt.setString(4, golfer.getGolferHomeCourse());
      stmt.setInt(5, golfer.getGolferId());
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally { 
      DBConnection.closeConnection();
    }
	}
	
	
	public Integer insert(Golfer golfer) {
    Connection conn = DBConnection.getConnection();
    String query =  "INSERT INTO \"GOLFER\" (\"GOLFER_TITLE\", \"GOLFER_NAME\", \"GOLFER_ADRESS\", \"GOLFER_HOME_COURSE\") "
        + " VALUES (?, ?, ?, ?)"; 
    PreparedStatement stmt = null;
    try {
      stmt = conn.prepareStatement(query);
      stmt.setString(1, golfer.getGolferTitle());
      stmt.setString(2, golfer.getGolferName());
      stmt.setString(3, golfer.getGolferAddress());
      stmt.setString(4, golfer.getGolferHomeCourse());
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally { 
      DBConnection.closeConnection();
    }
    return getLastPK();
	}
	
	public Integer getLastPK() {
	  Connection conn = DBConnection.getConnection();
	  Integer newpk = 1;
    String query =  "SELECT MAX(\"GOLFER_ID\") FROM \"GOLFER\"";
    Statement stmt = null;
    ResultSet rs = null;
    try {
      stmt = conn.createStatement();
      rs = stmt.executeQuery(query);
      if (rs.next()) {
        newpk = rs.getInt(1);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally { 
      DBConnection.closeConnection();
    }	  
	  return newpk;
	}
	
	
	public void delete(Integer golferId) {
    Connection conn = DBConnection.getConnection();
    String query =  "DELETE FROM \"GOLFER\" WHERE \"GOLFER_ID\" = ?"; 
    PreparedStatement stmt = null;
    try {
      stmt = conn.prepareStatement(query);
      stmt.setInt(1, golferId);
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally { 
      DBConnection.closeConnection();
    }
	}
	
	public Golfer select(Golfer golfer) {
	  Connection conn = DBConnection.getConnection();
    String query =  "SELECT * FROM \"GOLFER\" WHERE \"GOLFER_ID\" = ?"; 
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
      stmt = conn.prepareStatement(query);
      stmt.setInt(1, golfer.getGolferId());
      rs = stmt.executeQuery();
      if (rs.next()) {
        golfer.setGolferId(rs.getInt("GOLFER_ID"));
        golfer.setGolferTitle(rs.getString("GOLFER_TITLE"));
        golfer.setGolferName(rs.getString("GOLFER_NAME"));
        golfer.setGolferAddress(rs.getString("GOLFER_ADRESS"));
        golfer.setGolferHomeCourse(rs.getString("GOLFER_HOME_COURSE"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      DBConnection.closeConnection();
    }
		return golfer;
	}
	
  public ArrayList<Golfer> selectAllGolfers() {
    Connection conn = DBConnection.getConnection();
    ArrayList<Golfer> golfers = new ArrayList<>();
    String query =  "SELECT * FROM \"GOLFER\""; 
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
      stmt = conn.prepareStatement(query);
      rs = stmt.executeQuery();
      while (rs.next()) {
        Golfer golfer = new Golfer();
        golfer.setGolferId(rs.getInt("GOLFER_ID"));
        golfer.setGolferTitle(rs.getString("GOLFER_TITLE"));
        golfer.setGolferName(rs.getString("GOLFER_NAME"));
        golfer.setGolferAddress(rs.getString("GOLFER_ADRESS"));
        golfer.setGolferHomeCourse(rs.getString("GOLFER_HOME_COURSE"));
        golfers.add(golfer);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      DBConnection.closeConnection();
    }
    return golfers;
  }

}
