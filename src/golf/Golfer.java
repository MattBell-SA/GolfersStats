package golf;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Golfer {

	private Integer golferId;
	private String  golferTitle;
	private String  golferName;
	private String  golferAddress;
	private String  golferHomeCourse;
	
	@JsonIgnore
	private GolferDAO golferDao = new GolferDAO();
	
	public Golfer() {
	}
	
	public String toString() {
	  StringBuffer str = new StringBuffer();
	  str.append(golferId).append("\n" + golferTitle).append("\n" + golferName).append("\n" + golferAddress).append("\n" + golferHomeCourse);
    return str.toString();
	}
	
	public GolferDAO getGolferDao() {
		return golferDao;
	}
	
	public Integer insert() {
		return getGolferDao().insert(this);
	}
	
	public void update() {
		getGolferDao().update(this);
	}
	
	public void delete(Integer golferId) {
		getGolferDao().delete(golferId);
	}
	
	public Golfer select(Integer golferId) {
	  setGolferId(golferId);
		getGolferDao().select(this);
		return this;
	}	
	
	public Integer getGolferId() {
		return golferId;
	}

	public void setGolferId(Integer golferId) {
		this.golferId = golferId;
	}

	public String getGolferTitle() {
		return golferTitle;
	}

	public void setGolferTitle(String golferTitle) {
		this.golferTitle = golferTitle;
	}

	public String getGolferName() {
		return golferName;
	}

	public void setGolferName(String golferName) {
		this.golferName = golferName;
	}

	public String getGolferAddress() {
		return golferAddress;
	}

	public void setGolferAddress(String golferAddress) {
		this.golferAddress = golferAddress;
	}

	public String getGolferHomeCourse() {
		return golferHomeCourse;
	}

	public void setGolferHomeCourse(String golferHomeCourse) {
		this.golferHomeCourse = golferHomeCourse;
	}

	
}
