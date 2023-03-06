package question1;

public class Clock {
	private int hour;
	private int min;
	private int sec;
	private String ampm;
	
	public Clock() {
		this.hour = 0;
		this.min = 0;
		this.sec = 0;
	}
	
	public int checkTimeValidity(int hour, int min, int sec) {
		if((hour <= 12 && hour >= 0) && 
				(min <= 60 && min >= 0) && (sec <= 60 && sec >= 0)) 
			return 1;
		else
			return 0;
	}

	public void setTime(int hour, int min, int sec, String ampm) {
		if(checkTimeValidity(hour, min, sec)==1) {
			this.hour = hour;
			this.min = min;
			this.sec = sec;
			this.ampm = ampm;
		} else {
			System.out.println("Invalid time");
		}
	}
	
	public String getTime() {
		int arr[] = new int[3];
		arr[0] = this.hour;
		arr[1] = this.min;
		arr[2] = this.sec;
		return arr[0] +" : "+ arr[1] +" : "+ arr[2] +" "+ this.ampm;
	}
}
