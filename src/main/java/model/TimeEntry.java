package model;

public class TimeEntry {
	String username;
	String time;
	 public TimeEntry(String username, String time) {
		 setUsername(username);
		 setTime(time);
	 }
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}