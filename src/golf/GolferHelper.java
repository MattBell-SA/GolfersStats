package golf;

import static com.golf.Tables.GOLFER;

import java.sql.SQLException;
import java.util.ArrayList;
import org.jooq.Record;
import org.jooq.Result;

import golf.Golfer;

public class GolferHelper {
	
	public Object[] getAllGolfers() {
		ArrayList<Golfer> golfers = new ArrayList<>();
		golfers = new Golfer().getGolferDao().selectAllGolfers() ;
		return golfers.toArray();
	}
	
	
	 public static void main(String[] args) throws SQLException {
	   
	   Golfer golfer = new Golfer().select(1);
	   System.out.println("Name: " + golfer.getGolferName());
	   
	   ArrayList<Golfer> golfers = new Golfer().getGolferDao().selectAllGolfers();
	   
	   for (Golfer g : golfers) {
	     System.out.println("Name: " + g.getGolferName());
	   }
	   
	   Golfer newGolfer = new Golfer();
	   newGolfer.setGolferTitle("Mr");
	   newGolfer.setGolferName("Phil Mickelson");
	   newGolfer.setGolferAddress("New York");
	   newGolfer.setGolferHomeCourse("Royal New York");
	   
	   System.out.println(newGolfer.insert());
	   
	   Golfer golfer1 = new Golfer().select(7);
     System.out.println(golfer1.toString());
     
     golfer1.setGolferTitle("Mr");
     golfer1.setGolferName("Ted William");
     golfer1.setGolferAddress("Adelaide");
     golfer1.setGolferHomeCourse("Kooyonga Golf course");
     
     golfer1.update();
     
     Golfer golfer2 = new Golfer().select(7);
     System.out.println(golfer2.toString());
	   
	   Golfer golfer3 = new Golfer().select(6);
	   golfer3.delete(golfer3.getGolferId());
	   
	 }
	
}
