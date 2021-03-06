
/**
 * @author nikhil
 *
 */
public class Time {
	
//	reference time = midnight Sunday;
//	thus, 0 => mid-night, 800 => 8am Mon, 3200 => 8am Tues 
//	and so on...
	
	private String course;
	private int startTime;
	private int duration;

	private String day;
	private int timeOfDay;

	public Time(){
		startTime = 0;
		duration = 75;
	}
	
	public Time(String course, int startTime, int duration){
		this.course = course;
		this.startTime = startTime;
		this.duration = duration;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getDay(){
		if(startTime >= 800 && startTime <= 2000)
			day = "mon";
		else if(startTime >= 3200 && startTime <= 4400)
			day = "tues";
		else if(startTime >= 5600 && startTime <= 6800)
		 	day = "wed";
		else if(startTime >= 8000 && startTime <= 9200)
		  	day = "thurs";
		else if(startTime >= 10400 && startTime <= 11600)
			day = "fri";
		else 
			day = "End of week!";

		return day;
	}
	
	public int getTimeOfDay(){
		if(day == "mon")
			timeOfDay = this.startTime;
		else if(day == "tues")
			timeOfDay = this.startTime - 2400;
		else if(day == "wed")
			timeOfDay = this.startTime - 4800;
		else if(day == "thurs")
			timeOfDay = this.startTime - 7200;
		else if(day == "fri")
			timeOfDay = this.startTime - 9600;
		else 
			timeOfDay = 0000;

		return timeOfDay;
	}

	public boolean overlap(Time mt){

		if(this.startTime == mt.startTime){
			return true;
		}
		else
			return false;
	}
	
	public void CourseTimings(){
		if(course == "Software Testing")
			System.out.println("1005, Mon; 5805, Wed");
		else	if(course == "Information Retrieval")
			System.out.println("3715, Tu; 8515, Th");
		else	if(course == "Algorithms")
			System.out.println("37850, Tu; 8650, Th");
		else	if(course == "Directed Study")
			System.out.println("1305, Mon; 6105, Wed");
		else	if(course == "102Lect")
			System.out.println("4130, Tu; 8930, Th");
	}

}

