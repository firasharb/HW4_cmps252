import java.time.LocalTime;

public interface Course {
	String getCrn();
	String getSubject();
	String getCourse_num();
	String getSection();
	String getTitle();
	float getCredithrs();
	String getCollege();
	int getActual_enrol();
	int getSeats_available();
	java.time.LocalTime getBegin_time();
	java.time.LocalTime getEnd_time();
	String getBldg();
	String getRoom();
	boolean getMonday();
	boolean getTuesday();
	boolean getWednesday();
	boolean getThursday();
	boolean getFriday();
	boolean getSaturday();
	String getInstructor_first();
	String getInstructor_last();
}

class CourseClass implements Course {
	private final String crn;
	private final String subject; 
	private final String course_num; 
	private final String section; 
	private final String title;
	private final float creditHrs; 
	private final String college;
	private final int actual_enrol;
	private final int seats_available;
	private final java.time.LocalTime begin_time; 
	private final java.time.LocalTime end_time; 
	private final String bldg; 
	private final String room; 
	private final boolean monday;
	private final boolean tuesday; 
	private final boolean wednesday;
	private final boolean thursday;
	private final boolean friday; 
	private final boolean saturday; 
	private final String instructor_first;
	private final String instructor_last;
	
	public CourseClass(
			String crn, 
			String subject, 
			String course_num, 
			String section, 
			String title, 
			float creditHrs, 
			String college, 
			int actual_enrol,
			int seats_available, 
			java.time.LocalTime begin_time, 
			java.time.LocalTime end_time, 
			String bldg, 
			String room, 
			boolean monday, 
			boolean tuesday, 
			boolean wednesday,
			boolean thursday, 
			boolean friday, 
			boolean saturday, 
			String instructor_first,
			String instructor_last
			) {
		this.crn = crn;
		this.subject = subject;
		this.course_num = course_num;
		this.section = section; 
		this.title = title;
		this.creditHrs = creditHrs; 
		this.college = college;
		this.actual_enrol = actual_enrol;
		this.seats_available = seats_available; 
		this.begin_time = begin_time;
		this.end_time = end_time; 
		this.bldg = bldg;
		this.room = room; 
		this.monday = monday;
		this.tuesday = tuesday;
		this.wednesday = wednesday; 
		this.thursday = thursday; 
		this.friday = friday; 
		this.saturday = saturday; 
		this.instructor_first = instructor_first; 
		this.instructor_last = instructor_last;
	}

	@Override
	public String getCrn() {
		return this.crn;
	}

	@Override
	public String getSubject() {
		return this.subject;
	}

	@Override
	public String getCourse_num() {
		return this.course_num;
	}

	@Override
	public String getSection() {
		return this.section;
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public float getCredithrs() {
		return this.creditHrs;
	}

	@Override
	public String getCollege() {
		return this.college;
	}

	@Override
	public int getActual_enrol() {
		return this.actual_enrol;
	}

	@Override
	public int getSeats_available() {
		return this.seats_available;
	}

	@Override
	public LocalTime getBegin_time() {
		return this.begin_time;
	}

	@Override
	public LocalTime getEnd_time() {
		return this.end_time;
	}

	@Override
	public String getBldg() {
		return this.bldg;
	}

	@Override
	public String getRoom() {
		return this.room;
	}

	@Override
	public boolean getMonday() {
		return this.monday;
	}

	@Override
	public boolean getTuesday() {
		return this.tuesday;
	}

	@Override
	public boolean getWednesday() {
		return this.wednesday;
	}

	@Override
	public boolean getThursday() {
		return this.thursday;
	}

	@Override
	public boolean getFriday() {
		return this.friday;
	}

	@Override
	public boolean getSaturday() {
		return this.saturday;
	}

	@Override
	public String getInstructor_first() {
		return this.instructor_first;
	}

	@Override
	public String getInstructor_last() {
		return this.instructor_last;
	} 
	
}
