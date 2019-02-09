package HotelManager; // package declaration


/**
 * This class will make a level with four rooms with basic info. The level
 * has 2 attributes, LevelNumber and Number_of_Rooms. The Rooms have the 
 * attributes of a room number, guest name, and guest count. These are accessible
 * through this class. This is built to be the class to use to access the 
 * rooms as well. Mainly just a collection of getters and setters.
 * 
 * 
 * @author Cole
 */
public class Advanced_Level {
	/* PRIVATE CLASS VARIBLES */
	// Level Information
	private int LevelNumber = -1;
	private int Number_of_Rooms = 4;
	
	// Level Rooms
	private Advanced_Room room1;
	private Advanced_Room room2;
	private Advanced_Room room3;
	private Advanced_Room room4;
	
	/**
	 * The constructor for a level. The constructor will make
	 * four empty rooms associated as children of the level 
	 * object.
	 * 
	 * @param Level Number
	 */
	public Advanced_Level(int p_LevelNumber) {
		LevelNumber = p_LevelNumber;
		Number_of_Rooms = 4;
		
		room1 = new Advanced_Room(this, 1, 2, false);
		room2 = new Advanced_Room(this, 2, 2, false);
		room3 = new Advanced_Room(this, 3, 3, true);
		room4 = new Advanced_Room(this, 4, 1, false);
		
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
	
	public void printQualities() {
		System.out.println("==================== Level " + this.LevelNumber + " ====================");
		System.out.println("- Has " + this.Number_of_Rooms + " Rooms");
		for(int i_Counter = 0; i_Counter < this.Number_of_Rooms + 1; ++i_Counter) {
			
		}
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
	
	/**
	 * Will reset room 1 and allow another guest to
	 * check in
	 * 
	 * @category Guest Actions
	 */
	public void checkOutRoom1() {
		room1.resetRoom();
		System.out.println("Room 1 is now empty");
	}
	
	/**
	 * Will reset room 2 and allow another guest to
	 * check in
	 * 
	 * @category Guest Actions
	 */
	public void checkOutRoom2() {
		room2.resetRoom();
		System.out.println("Room 2 is now empty");
	}
	
	/**
	 * Will reset room 3 and allow another guest to
	 * check in
	 * 
	 * @category Guest Actions
	 */
	public void checkOutRoom3() {
		room3.resetRoom();
		System.out.println("Room3 is now empty");
	}
	
	/**
	 * Will reset room 4 and print that the room is empty.
	 * This will allow another guest to check in
	 * 
	 * @category Guest Actions
	 */
	public void checkOutRoom4() {
		room4.resetRoom();
		System.out.println("Room 4 is now empty");
	}
	
	/**
	 * Will set the room 1 guest name
	 * 
	 * @param p_name - guest name
	 * @category level setter/getter
	 */
	public void setRoom1GuestName(String p_name) {
		room1.setGuestName(p_name);
	}
	
	/**
	 * Will get the room 1 guest name
	 * 
	 * @return room 1 guest name
	 * @category level setter/getter
	 */
	public String getRoom1GuestName() {
		return room1.getGuestName();
	}
	
	/**
	 * Will set the guest name of room 2
	 * 
	 * @param p_name - guest name
	 * @category level setter/getter
	 */
	public void setRoom2GuestName(String p_name) {
		room2.setGuestName(p_name);
	}
	
	/**
	 * Will get the room 2 guest name
	 * 
	 * @return guest name
	 * @category level setter/getter
	 */
	public String getRoom2GuestName() {
		return room2.getGuestName();
	}
	
	/**
	 * Will set the guest name of room 3
	 * 
	 * @param p_name - guest name
	 * @category level setter/getter
	 */
	public void setRoom3GuestName(String p_name) {
		room3.setGuestName(p_name);
	}
	
	/**
	 * Will get the guest name of room 3
	 * 
	 * @return guest name of room 3
	 * @category level setter/getter
	 */
	public String getRoom3GuestName() {
		return room3.getGuestName();
	}
	
	/**
	 * Will set the room 4 guest name
	 * 
	 * @param p_name - guest name
	 * @category level setter/getter
	 */
	public void setRoom4GuestName(String p_name) {
		room4.setGuestName(p_name);
	}
	
	/**
	 * Will get the room 4 guest name
	 * 
	 * @return guest name of room 4
	 * @category level setter/getter
	 */
	public String getRoom4GuestName() {
		return room4.getGuestName();
	}
	
	/**
	 * Will set the guest count of room 1
	 * 
	 * @param p_count - guest count
	 */
	public void setRoom1GuestCount(int p_count) {
		room1.setGuestCount(p_count);
	}
	
	/**
	 * Will get the guest count of room 1
	 * 
	 * @return the guest count of room 1
	 * @category level setter/getter
	 */
	public int getRoom1GuestCount() {
		return room1.getGuestCount();
	}
	
	/**
	 * Will set the guest count of room 2
	 * 
	 * @param p_count - guest count
	 * @category level setter/getter
	 */
	public void setRoom2GuestCount(int p_count) {
		room2.setGuestCount(p_count);
	}
	
	/**
	 * Will get the guest count of room 2
	 * 
	 * @return guest count of room 2
	 * @category level setter/getter
	 */
	public int getRoom2GuestCount() {
		return room2.getGuestCount();
	}
	
	/**
	 * Will set the guest count of room 3
	 * 
	 * @param p_count - guest count
	 * @category level setter/getter
	 */
	public void setRoom3GuestCount(int p_count) {
		room3.setGuestCount(p_count);
	}
	
	/**
	 * Will get the guest count of room 3
	 * 
	 * @return guest count of room 3
	 * @category level setter/getter
	 */
	public int getRoom3GuestCount() {
		return room3.getGuestCount();
	}
	
	/**
	 * Will set the guest count of room 4
	 * 
	 * @param p_count - guest count
	 * @category level setter/getter
	 */
	public void setRoom4GuestCount(int p_count) {
		room4.setGuestCount(p_count);
	}
	
	/**
	 * Will get the guest count in room 4
	 * 
	 * @return guest count of room 4
	 * @category level setter/getter
	 */
	public int getRoom4GuestCount() {
		return room4.getGuestCount();
	}
	
	/**
	 * Will return if room 1 is full
	 * 
	 * @return if room 1 is full
	 * @category level setter/getter
	 */
	public boolean isRoom1Full() {
		return room1.isFull();
	}
	
	/**
	 * Will return if room 2 is full
	 * 
	 * @return room 2 full
	 * @category level setter/getter
	 */
	public boolean isRoom2Full() {
		return room2.isFull();
	}
	
	/**
	 * Will return if room 3 is full
	 * 
	 * @return room 3 full
	 * @category level setter/getter
	 */
	public boolean isRoom3Full() {
		return room3.isFull();
	}
	
	/**
	 * Will return if room 4 is full
	 * 
	 * @return room 4 state
	 * @category level setter/getter
	 */
	public boolean isRoom4Full() {
		return room4.isFull();
	}
	
	/**
	 * Will return if the level's rooms are full
	 * 
	 * @return is full
	 * @category level setter/getter
	 */
	public boolean isFull() {
		if(isRoom1Full() && isRoom2Full()) {
			if(isRoom3Full() && isRoom4Full()) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Will return the room 1 object
	 * 
	 * @return room1
	 */
	public Advanced_Room getRoom1() {
		return room1;
	}
	
	/**
	 * Will return the room 2 object
	 * 
	 * @return room2
	 */
	public Advanced_Room getRoom2() {
		return room2;
	}
	
	/**
	 * Will return the room 3 object
	 * 
	 * @return room3
	 */
	public Advanced_Room getRoom3() {
		return room3;
	}
	
	/**
	 * Will return the room 4 object
	 * 
	 * @return room4
	 */
	public Advanced_Room getRoom4() {
		return room4;
	}
}
