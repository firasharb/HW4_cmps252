
public interface Instructor {
	String getFirstName();
	String getLastName();
}

class InstructorClass implements Instructor { 
	private final String firstName; 
	private final String lastName; 
	
	InstructorClass(String firstName, String lastName) { 
		this.firstName = firstName; 
		this.lastName = lastName; 
	}
	
	@Override
	public String getFirstName() { 
		return this.firstName;
	}
	
	@Override
	public String getLastName() { 
		return this.lastName;
	}
}