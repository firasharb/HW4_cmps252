import java.util.List;

public interface CourSeeraFactory {
	CourSeera createInstance(List<Course> courses);
}


class CourSeeraFactoryClass implements CourSeeraFactory { 
	public CourSeera createInstance(List<Course> courses) {
		return new CourSeeraClass(courses); 
	}
}