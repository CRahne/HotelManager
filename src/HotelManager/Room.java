package HotelManager;
/**
 * The class for making a room on a floor
 * 
 * @author Cole
 */
public class Room {
	/* CLASS VARIBLE DECLARATIONS */
	// Booleans for the room's state
	private boolean isFull, isEmpty;
	
	// The level number
	private Level Level;
	
	// The Room Number
	private int RoomNumber;
	
	// Guest info for the room
	private int GuestCount;
	private String GuestName;
	
	/**
	 * This is the constructor of a room on a floor
	 * 
	 * @param p_Level
	 * @param p_RoomNumber
	 */
	public Room(Level p_Level, int p_RoomNumber) {
		Level = p_Level;
		RoomNumber = p_RoomNumber;
		GuestCount = 0;
		GuestName = "UNFILLED";
		isEmpty = true;
		isFull = false;
	}
	
	public void checkIntoRoom(String p_GuestName, int GuessCount) {
		setGuestName(p_GuestName);
		setGuestCount(GuessCount);
		setEmpty(false);
		setFull(true);
	}
	
	public void checkOuttaRoom() {
		resetRoom();
	}
	
	public void resetRoom() {
		setGuestName("UNFILLED");
		setGuestCount(0);
		setEmpty(true);
		setFull(false);
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
			setEmpty(false);
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
			setGuestName("UNFILLED");
			setGuestCount(0);
		}
		this.isEmpty = isEmpty;
	}
	
	/**
	 * Will return the level it is on
	 * 
	 * @return The Level it is on
	 */
	public Level getLevel() {
		return Level;
	}
	
	/**
	 * Will set the level the room is on. ONLY FOR EMERGENCIES
	 * 
	 * @param The Level
	 */
	public void setLevel(Level level) {
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
			setEmpty(true);
			setFull(false);
			p_GuestCount = 0;
		}
		else {
			// Sets the room to full
			setEmpty(false);
			setFull(true);
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
			setEmpty(true);
			setFull(false);
		}
		else {
			setEmpty(false);
			setFull(true);
		}
		this.GuestName = p_GuestName;
	}
}
