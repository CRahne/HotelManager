package HotelManager; // package declaration


/**
 * The class for making a room on a floor
 * 
 * @author Cole
 */
public class Advanced_Room {
	/* CLASS VARIBLE DECLARATIONS */
	// Booleans for the room's state
	private boolean isFull, isEmpty;
	
	// The level number
	private Advanced_Level Level;
	
	// The Room Number
	private int RoomNumber;
	
	// Guest info for the room
	private int GuestCount;
	private String GuestName;
	
	// Room Qualities
	private int Bed_Number;
	private boolean isSuite;
	
	/**
	 * This is the constructor of a room on a floor
	 * 
	 * @param p_Level
	 * @param p_RoomNumber
	 */
	public Advanced_Room(Advanced_Level p_Level, int p_RoomNumber, int p_Bed_Number, boolean p_isSuite) {
		Level = p_Level;
		RoomNumber = p_RoomNumber;
		GuestCount = 0;
		GuestName = "UNFILLED";
		isEmpty = true;
		isFull = false;
		Bed_Number = p_Bed_Number;
		isSuite = p_isSuite;
	}
	
	public void printQualities() {
		System.out.println("Room Number: " + this.RoomNumber);
		System.out.println("Level Number: " + this.Level.getLevelNumber());
		if(isEmpty) {
			System.out.println("Currently Vacant");
		}
		else if(isFull) {
			System.out.println("Currently Occupied");
		}
		
		if(isSuite) {
			System.out.println("A wonderful choice with all the amendities such as ");
			System.out.println("--- A Mini Kitchen ---");
			System.out.println("--- A Full Bathroom ---");
			System.out.println("--- A flat screen TV ---");
			System.out.println("--- A Fireplace ---");
			System.out.println("--- A Private Deck");
			System.out.println("--- Mini Office Space ---");
			System.out.println("--- Mini Fridge ---");
		}
		else {
			System.out.println("--- Mini Fridge ---");
			System.out.println("--- TV ---");
			System.out.println("--- Half-Bath ---");
		}
		System.out.println("Bed Count: " + this.Bed_Number);
	}
	
	/**
	 * Will check a guest into a room with the appropriate data
	 * 
	 * @param p_GuestName
	 * @param GuessCount
	 */
	public void checkIntoRoom(String p_GuestName, int p_GuessCount) {
		this.GuestName = p_GuestName;
		this.GuestCount = p_GuessCount;
		this.isEmpty = false;
		this.isFull = true;
	}
	
	/**
	 * Will reset room to default state
	 */
	public void resetRoom() {
		this.GuestName = "UNFILLED";
		this.GuestCount = 0;
		this.isEmpty = true;
		this.isFull = false;
	}
	
	/**
	 * Will return if the room is full or not
	 * 
	 * @return if the room is full
	 */
	public boolean isFull() {
		return isFull;
	}
	
	/**
	 * Will set the room's status to either false or true
	 * 
	 * @param isFull boolean
	 */
	public void setFull(boolean p_isFull) {
		// if the room is being set to full
		// make sure the empty boolean is
		// set to false
		if(p_isFull) { 
			this.isEmpty = false;
		}
		this.isFull = p_isFull;
	}
	
	/**
	 * Will return if the room is empty
	 * 
	 * @return if the room is empty
	 */
	public boolean isEmpty() {
		return isEmpty;
	}
	
	/**
	 * Will set the room to empty when someone checks out
	 * 
	 * @param isEmpty boolean
	 */
	public void setEmpty(boolean isEmpty) {
		// If the room's state is being set to
		// empty, then reset the guest info
		if(isEmpty) {
			isFull = false;
			this.GuestName = "UNFILLED";
			this.GuestCount = 0;
		}
		this.isEmpty = isEmpty;
	}
	
	/**
	 * Will return the level it is on
	 * 
	 * @return The Level it is on
	 */
	public Advanced_Level getLevel() {
		return Level;
	}
	
	/**
	 * Will set the level the room is on. ONLY FOR EMERGENCIES
	 * 
	 * @param The Level
	 */
	public void setLevel(Advanced_Level level) {
		Level = level;
	}
	
	/**
	 * Will return the room number on the level
	 * 
	 * @return Room Number
	 */
	public int getRoomNumber() {
		return RoomNumber;
	}
	
	/**
	 * Will set the room number. ONLY FOR EMERGENCY!
	 * @param the room number
	 */
	public void setRoomNumber(int p_RoomNumber) {
		this.RoomNumber = p_RoomNumber;
	}
	
	/**
	 * Will return the guest count
	 * 
	 * @return The Guest Count of the room
	 */
	public int getGuestCount() {
		return GuestCount;
	}
	
	/**
	 * Will set the guest count to the parameter
	 * 
	 * @param The Guest Count of the room
	 */
	public void setGuestCount(int p_GuestCount) {
		// If the guest count is less than one
		// than the guest count is zero and the
		// room is empty
		if(p_GuestCount < 1) {
			this.isEmpty = true;
			this.isFull = false;
			p_GuestCount = 0;
		}
		else {
			// Sets the room to full
			this.isEmpty = false;
			this.isFull = true;
		}
		this.GuestCount = p_GuestCount;
	}
	
	/**
	 * Will return the guest name
	 * 
	 * @return The Guest Name for the room
	 */
	public String getGuestName() {
		return GuestName;
	}
	
	/**
	 * Will set the Guess Name to the parameter values
	 * 
	 * @param The Guest Name for the room
	 */
	public void setGuestName(String p_GuestName) {
		// If the guest name isn't full, then
		// reset the info, or say the room is
		// now full and not empty
		if(p_GuestName == "UNFILLED") {
			this.isEmpty = true;
			this.isFull = false;
		}
		else {
			this.isEmpty = false;
			this.isFull = true;
		}
		this.GuestName = p_GuestName;
	}

	public int getBed_Number() {
		return Bed_Number;
	}

	public void setBed_Number(int p_bed_Number) {
		Bed_Number = p_bed_Number;
	}

	public boolean isSuite() {
		return isSuite;
	}

	public void setSuite(boolean p_isSuite) {
		this.isSuite = p_isSuite;
	}
}
