import java.time.LocalTime;

public interface Schedule {
	String getRoom();
	LocalTime getFromTime();
	LocalTime getToTime();
	String getInstructor();
	String getCourse();
}

class ScheduleClass implements Schedule { 
	private final String room;
	private final java.time.LocalTime FromTime;
	private final java.time.LocalTime ToTime;
	private final String instructor;
	private final String course; 
	
	ScheduleClass( 
			String room, 
			java.time.LocalTime fromTime,
			java.time.LocalTime toTime, 
			String instructor, 
			String course
		) {
		this.room = room;
		this.FromTime = fromTime;
		this.ToTime = toTime;
		this.instructor = instructor;
		this.course = course;
	}

	@Override
	public String getRoom() {
		return this.room;
	}

	@Override
	public LocalTime getFromTime() {
		return this.FromTime;
	}

	@Override
	public LocalTime getToTime() {
		return this.ToTime;
	}

	@Override
	public String getInstructor() {
		return this.instructor;
	}

	@Override
	public String getCourse() {
		return this.course;
	}
	
	
}