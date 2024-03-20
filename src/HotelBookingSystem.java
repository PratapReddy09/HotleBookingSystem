import java.time.LocalDate;

public class HotelBookingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hotel hotel1=new Hotel("Windom", "NJ", 100);
		Hotel hotel2=new Hotel("Baymont", "NJ", 150);
	
		
		
		User u1= new User("pratap", "pratap@gmail.com");
		User u2= new User("pratap123", "pratap123@gmail.com");
		
		Room r1=new Room(1, "classic", 1, 100.00);
		Room r2=new Room(2, "Double", 2, 200.00);
		Room r3=new Room(3, "classic", 1, 100.00);
		hotel1.addRoom(r1);
		hotel1.addRoom(r2);
		hotel1.addRoom(r3);
		HotelBooking hb=new HotelBooking(hotel1);
		
		Room room=hotel1.getRooms().get(0);
		LocalDate checkindate=LocalDate.of(2024, 3, 20);
		LocalDate checkoutdate=LocalDate.of(2024, 3, 25);
		
		Room room1=hotel1.getRooms().get(0);
		LocalDate checkindate1=LocalDate.of(2024, 3, 20);
		LocalDate checkoutdate1=LocalDate.of(2024, 3, 26);
		
		hb.makeBooking(room, checkindate, checkoutdate);
		hb.makeBooking(room1, checkindate1, checkoutdate1);
		hb.cancelBooking(1);
		
	}

}
