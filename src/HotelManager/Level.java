package HotelManager; // package declaration


/**
 * This class will make a level with four rooms with basic info. The level
 * has 2 attributes, LevelNumber and Number_of_Rooms. The Rooms have the 
 * attributes of a room number, guest name, and guest count. These are accessible
 * through this class. This is built to be the class to use to access the 
 * rooms as well.
 * 
 * 
 * @author Cole
 */
public class Level {
	private int LevelNumber = -1;
	private int Number_of_Rooms = 4;
	
	private Room room1;
	private Room room2;
	private Room room3;
	private Room room4;
	
	/**
	 * The constructor for a level. The constructor will make
	 * four empty rooms associated as children of the level 
	 * object.
	 * 
	 * @param Level Number
	 */
	public Level(int p_LevelNumber) {
		LevelNumber = p_LevelNumber;
		Number_of_Rooms = 4;
		
		room1 = new Room(this, 1);
		room2 = new Room(this, 2);
		room3 = new Room(this, 3);
		room4 = new Room(this, 4);
		
		room1.resetRoom();
		room2.resetRoom();
		room3.resetRoom();
		room4.resetRoom();
	}
	
	/**
	 * Will set the level number. Only meant for extreme scenarios,
	 * probably shouldn't use.
	 * 
	 * @category level setter/getter
	 * @param Level Number
	 */
	public void setLevelNumber(int p_LevelNumber) {
		LevelNumber = p_LevelNumber;
	}
	/**
	 * Will get the level number
	 * 
	 * @category level setter/getter
	 * @return Level Number
	 */
	public int getLevelNumber() {
		return LevelNumber;
	}
	
	/**
	 * Will return the Number of Rooms of the level
	 * 
	 * @category level setter/getter
	 * @return Number of Rooms on the level
	 */
	public int getNumberOfRooms() {
		return Number_of_Rooms;
	}
	
	/**
	 * Will check if room 1 is empty, and then will check 
	 * a guest in with the info of the guest count and 
	 * name. If the room is not empty, then it will print 
	 * the room is full.
	 * 
	 * @category Guest Actions
	 * @param p_guestCount
	 * @param p_guestName
	 */
	public void checkInRoom1(int p_guestCount, String p_guestName) {
		if(room1.isEmpty()) {
			room1.checkIntoRoom(p_guestName, p_guestCount);
		}
		else {
			System.out.println("Room 1 is Full");
		}
	}
	
	/**
	 * Will check if room 2 is empty and then will check in a
	 * guest with info of a guest name and count. If the room 
	 * is not empty, it will print the room is full
	 * 
	 * @category Guest
	 * @param p_guestCount
	 * @param p_guestName
	 */
	public void checkInRoom2(int p_guestCount, String p_guestName) {
		if(room2.isEmpty()) {
			room2.checkIntoRoom(p_guestName, p_guestCount);
		}
		else {
			System.out.println("Room 2 is Full");
		}
	}
	
	/**
	 * Will check if room 3 is empty, and then will check 
	 * a guest in with the info of the guest count and 
	 * name. If the room is not empty, then it will print 
	 * the room is full.
	 * 
	 * @category Guest Actions
	 * @param p_guestCount
	 * @param p_guestName
	 */
	public void checkInRoom3(int p_guestCount, String p_guestName) {
		if(room3.isEmpty()) {
			room3.checkIntoRoom(p_guestName, p_guestCount);
		}
		else {
			System.out.println("Room 3 is Full");
		}
	}
	
	/**
	 * Will check if room 4 is empty, and then will check 
	 * a guest in with the info of the guest count and 
	 * name. If the room is not empty, then it will print 
	 * the room is full.
	 * 
	 * @category Guest Actions
	 * @param p_guestCount
	 * @param p_guestName
	 */
	public void checkInRoom4(int p_guestCount, String p_guestName) {
		if(room4.isEmpty()) {
			room4.checkIntoRoom(p_guestName, p_guestCount);
		}
		else {
			System.out.println("Room 4 is Full");
		}
	}
	
	public void checkOutRoom1() {
		room1.resetRoom();
		System.out.println("Room 1 is now empty");
	}
	
	public void checkOutRoom2() {
		room2.resetRoom();
		System.out.println("Room 2 is now empty");
	}
	
	public void checkOutRoom3() {
		room3.resetRoom();
		System.out.println("Room3 is now empty");
	}
	
	public void checkOutRoom4() {
		room4.resetRoom();
		System.out.println("Room 4 is now empty");
	}
	
	public void setRoom1GuestName(String p_name) {
		room1.setGuestName(p_name);
	}
	public String getRoom1GuestName() {
		return room1.getGuestName();
	}
	
	public void setRoom2GuestName(String p_name) {
		room2.setGuestName(p_name);
	}
	public String getRoom2GuestName() {
		return room2.getGuestName();
	}
	
	public void setRoom3GuestName(String p_name) {
		room3.setGuestName(p_name);
	}
	public String getRoom3GuestName() {
		return room3.getGuestName();
	}
	
	public void setRoom4GuestName(String p_name) {
		room4.setGuestName(p_name);
	}
	public String getRoom4GuestName() {
		return room4.getGuestName();
	}
	
	public void setRoom1GuestCount(int p_count) {
		room1.setGuestCount(p_count);
	}
	public int getRoom1GuestCount() {
		return room1.getGuestCount();
	}
	
	public void setRoom2GuestCount(int p_count) {
		room2.setGuestCount(p_count);
	}
	public int getRoom2GuestCount() {
		return room2.getGuestCount();
	}
	
	public void setRoom3GuestCount(int p_count) {
		room3.setGuestCount(p_count);
	}
	public int getRoom3GuestCount() {
		return room3.getGuestCount();
	}
	
	public void setRoom4GuestCount(int p_count) {
		room4.setGuestCount(p_count);
	}
	public int getRoom4GuestCount() {
		return room4.getGuestCount();
	}
	
	public boolean isRoom1Full() {
		return room1.isFull();
	}
	public boolean isRoom2Full() {
		return room2.isFull();
	}
	public boolean isRoom3Full() {
		return room3.isFull();
	}
	public boolean isRoom4Full() {
		return room4.isFull();
	}
	public boolean isFull() {
		if(isRoom1Full() && isRoom2Full()) {
			if(isRoom3Full() && isRoom4Full()) {
				return true;
			}
		}
		return false;
	}
}
