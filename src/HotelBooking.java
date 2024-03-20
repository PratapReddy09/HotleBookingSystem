import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class HotelBooking {
	private Hotel hotel;
    private Map<Integer, Booking> bookings;
    private int nextBookingID;

    public HotelBooking(Hotel hotel) {
        this.hotel = hotel;
        this.bookings = new HashMap<>();
        this.nextBookingID = 0;
    }

    public void makeBooking(Room room, LocalDate checkInDate, LocalDate checkOutDate) {
        double totalCost = calculateTotalCost(room, checkInDate, checkOutDate);
        Booking booking = new Booking(nextBookingID++, room, checkInDate, checkOutDate, totalCost);
        room.book();
        bookings.put(nextBookingID, booking);
        System.out.println("Booking successful. Your booking ID is " + nextBookingID);
    }

    public void cancelBooking(int bookingID) {
        Booking booking = bookings.get(bookingID);
        if (booking != null) {
            Room room = booking.getRoom();
            room.cancelBooking();
            bookings.remove(bookingID);
            System.out.println("Booking with ID " + bookingID + " cancelled successfully.");
        } else {
            System.out.println("Booking with ID " + bookingID + " not found.");
        }
    }

    private double calculateTotalCost(Room room, LocalDate checkInDate, LocalDate checkOutDate) {
        // Calculate total cost based on room price per night and duration of stay
        long numberOfNights = checkInDate.until(checkOutDate).getDays();
        return room.getPricePerNight() * numberOfNights;
    }
}