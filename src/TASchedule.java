/**
 * 
 */


/**
 * @author nikhil
 *
 */
public class TASchedule{

	public static void main(String[] args) {

//		Courses TA is enrolled in:-
		Time mt11 = new Time("Software Testing",1005,75);
		Time mt12 = new Time("Software Testing",5805,75);
		Time mt21 = new Time("Information Retrieval",3715,75);
		Time mt22 = new Time("Information Retrieval",8515,75);
		Time mt31 = new Time("Algorithms",3850,75);
		Time mt32 = new Time("Algorithms",8650,75);
		Time mt41 = new Time("Directed Study",4130,50);
		Time mt42 = new Time("Directed Study",8930,50);
		
//		Courses TA is teaching:-
		Time mt51 = new Time("102Lect_16,17,18",4130,50);
		Time mt52 = new Time("102Lect_16,17,18",8930,50);
		
		// Following two objects depicts part 1: Print time-of-day; print day-of-week

		System.out.println(mt11.getCourse());
		System.out.println(mt11.getDay());
		System.out.println(mt11.getTimeOfDay());
		
		System.out.println("");
		System.out.println(mt31.getCourse());
		System.out.println(mt31.getDay());
		System.out.println(mt31.getTimeOfDay());

		System.out.println("------------------------------------");
		System.out.println("Overlap ??");

		Time csce102_001 = new Time("Gen App Programming",1005,50);
//		if(mt11.overlap(csce102_001))
		if(mt11.overlap(mt31))
			System.out.println("The meeting times Overlap");
		else
			System.out.println("No Overlap");

			
		System.out.println("------------------------------------");
		System.out.println("List of times of meeting associated with a course ?");

		System.out.println(mt11.getCourse());
		mt11.CourseTimings();
		System.out.println(mt21.getCourse());
		mt21.CourseTimings();
		System.out.println(mt31.getCourse());
		mt31.CourseTimings();
		System.out.println(mt41.getCourse());
		mt41.CourseTimings();

		System.out.println("------------------------------------");
		System.out.println("Do any of the courses in which  a TA is enrolled conflict with course1? ?");

		Time Course1 = new Time("CSCE 102_Sections 16,17,18",3850,50);
		mt31.getCourse();
		Course1.getCourse();
		if(mt31.overlap(Course1))
			System.out.println("The meeting times Overlap");
		else
			System.out.println("No Overlap");

	}

}
