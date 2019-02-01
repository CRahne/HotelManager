package HotelManager;

public class Level {
	private int LevelNumber = -1;
	private int Number_of_Rooms = 4;
	private boolean isRoom1Full, isRoom2Full, isRoom3Full, isRoom4Full, isFull;
	
	private String room1GuestName, room2GuestName, room3GuestName, room4GuestName;
	
	private int room1GuestCount, room2GuestCount, room3GuestCount, room4GuestCount;
	
	public Level(int p_LevelNumber) {
		LevelNumber = p_LevelNumber;
		Number_of_Rooms = 4;
		isRoom1Full = false;
		isRoom2Full = false;
		isRoom3Full = false;
		isRoom4Full = false;
		
		room1GuestName = "UNFILLED";
		room2GuestName = "UNFILLED";
		room3GuestName = "UNFILLED";
		room4GuestName = "UNFILLED";
		
		room1GuestCount = 0;
		room2GuestCount = 0;
		room3GuestCount = 0;
		room4GuestCount = 0;
	}
	public void setLevelNumber(int p_LevelNumber) {
		LevelNumber = p_LevelNumber;
	}
	public int getLevelNumber() {
		return LevelNumber;
	}
	
	public int getNumberOfRooms() {
		return Number_of_Rooms;
	}
	
	public void checkIn(int p_roomNumber, int p_guestCount, String p_guestName) {
		
	}
	public void checkOut(int roomNumber) {
		
	}
	
	public void isThisRoomFull(int roomNumber) {
		
	}
	
	public void setRoom1GuestName(String p_name) {
		room1GuestName = p_name;
	}
	public String getRoom1GuestName() {
		return room1GuestName;
	}
	
	public void setRoom2GuestName(String p_name) {
		room2GuestName = p_name;
	}
	public String getRoom2GuestName() {
		return room2GuestName;
	}
	
	public void setRoom3GuestName(String p_name) {
		room3GuestName = p_name;
	}
	public String getRoom3GuestName() {
		return room3GuestName;
	}
	
	public void setRoom4GuestName(String p_name) {
		room4GuestName = p_name;
	}
	public String getRoom4GuestName() {
		return room4GuestName;
	}
	
	public void setRoom1GuestCount(int p_count) {
		room1GuestCount = p_count;
	}
	public int getRoom1GuestCount() {
		return room1GuestCount;
	}
	
	public void setRoom2GuestCount(int p_count) {
		room2GuestCount = p_count;
	}
	public int getRoom2GuestCount() {
		return room2GuestCount;
	}
	
	public void setRoom3GuestCount(int p_count) {
		room3GuestCount = p_count;
	}
	public int getRoom3GuestCount() {
		return room3GuestCount;
	}
	
	public void setRoom4GuestCount(int p_count) {
		room4GuestCount = p_count;
	}
	public int getRoom4GuestCount() {
		return room4GuestCount;
	}
	
	public boolean isRoom1Full() {
		return isRoom1Full;
	}
	public boolean isRoom2Full() {
		return isRoom2Full;
	}
	public boolean isRoom3Full() {
		return isRoom3Full;
	}
	public boolean isRoom4Full() {
		return isRoom4Full;
	}
	public boolean isFull() {
		return isFull;
	}
}
