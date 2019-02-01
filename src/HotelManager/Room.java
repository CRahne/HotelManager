package HotelManager;
/**
 * The class for making a room on a floor
 * 
 * @author Cole
 */
public class Room {
	private boolean isFull, isEmpty;
	private Level Level;
	private int RoomNumber, GuestCount;
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
	public void setFull(boolean isFull) {
		if(isFull) { 
			isEmpty = false;
		}
		this.isFull = isFull;
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
		if(p_GuestCount < 1) {
			isEmpty = true;
			isFull = false;
			p_GuestCount = 0;
		}
		else {
			isEmpty = false;
			isFull = true;
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
		if(p_GuestName == "UNFILLED") {
			isEmpty = true;
			isFull = false;
		}
		else {
			isEmpty = false;
			isFull = true;
		}
		this.GuestName = p_GuestName;
	}
}
