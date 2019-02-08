package HotelManager;

public class Main {
	public static Level level1 = new Level(1);
	public static Level level2 = new Level(2);
	public static Level level3 = new Level(3);
	public static Level level4 = new Level(4);
	
	public static void printRoom1Status(Level p_level) {
		System.out.println("Room 1 Guest Count: " + p_level.getRoom1GuestCount());
		System.out.println("Room 1 Guest Name: " + p_level.getRoom1GuestName());
		System.out.println("Is Room 1 Full: " + p_level.isRoom1Full());
	}
	
	public static void main(String args[]) {
		printRoom1Status(level1);
		printRoom1Status(level2);
		printRoom1Status(level3);
		printRoom1Status(level4);
	}
}
