import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public interface CourSeera {
	TreeMap<Room, List<Schedule>> roomSchedule();//lists the schedule for every room in alphabetical room number order
	List<Schedule> roomSchedule(Room room);//lists the schedule for a specific room
	List<Schedule> roomSchedule(Room room, java.time.LocalDate date);//lists the schedule for a specific room for a specific date
	List<Schedule> roomSchedule(Room room, DayOfWeek day);//lists the schedule for a specific room for a specific day of week
	Schedule whoWasThereLast(Room room);//lists the course and instructor name for the last time this room was occupied
	Schedule whoIsThereNow(Room room);//lists the course and instructor name currently occupying a specific room
	List<Schedule> profSchedule(Instructor instructor); //lists the instructor�s weekly schedule (day, time, room)
	Schedule whereIsProf(Instructor instructor); //lists the room where a prof is currently teaching (if any)
	List<Schedule> whereWillProfBe(Instructor instructor); //lists the instructor�s schedule for today
}

class CourSeeraClass implements CourSeera {
	List<Course> courses;
	
	public CourSeeraClass(List<Course> courses) { 
		this.courses = courses;
	}

	@Override
	public TreeMap<Room, List<Schedule>> roomSchedule() {
		TreeMap<Room, List<Schedule>> map = new TreeMap<Room, List<Schedule>>();
		
		for(Course course : courses) { 
			String room = course.getRoom();
			String bldg = course.getBldg();
			LocalTime fromTime = course.getBegin_time();
			LocalTime toTime = course.getEnd_time(); 
			String instructor = course.getInstructor_first() + " " + course.getInstructor_last();
			String courseName = course.getTitle();
			
			Schedule courseSched = new ScheduleClass(courseName, toTime, toTime, instructor, courseName); 
			Room roomObj = new RoomClass(bldg, room);
			
			if(map.get(roomObj) == null) { 
				List<Schedule> list = new ArrayList<Schedule>();
				list.add(courseSched);
				map.put(roomObj, list);
				
			}
			
		}
		return map;
	}

	@Override
	public List<Schedule> roomSchedule(Room room) {
		return null;
	}

	@Override
	public List<Schedule> roomSchedule(Room room, LocalDate date) {
		return null;
	}

	@Override
	public List<Schedule> roomSchedule(Room room, DayOfWeek day) {
		return null;
	}

	@Override
	public Schedule whoWasThereLast(Room room) {
		return null;
	}

	@Override
	public Schedule whoIsThereNow(Room room) {
		return null;
	}

	@Override
	public List<Schedule> profSchedule(Instructor instructor) {
		return null;
	}

	@Override
	public Schedule whereIsProf(Instructor instructor) {
		return null;
	}

	@Override
	public List<Schedule> whereWillProfBe(Instructor instructor) {
		return null;
	} 
	
}
