
public interface Room {
	String getBuilding();
	String getRoomNumber();
}

class RoomClass implements Room {
	private final String bldg; 
	private final String roomNumber; 
	
	RoomClass(String bldg, String roomNumber) {
		this.bldg = bldg; 
		this.roomNumber = roomNumber;
	}

	@Override
	public String getBuilding() {
		return this.bldg;
	}

	@Override
	public String getRoomNumber() {
		return this.roomNumber;
	} 
	
}