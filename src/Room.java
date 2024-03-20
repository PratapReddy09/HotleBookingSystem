
public class Room {
	
	private int roomNumber;
    private String type;
    private int capacity;
    private double pricePerNight;
    private boolean booked;

    public Room(int roomNumber, String type, int capacity, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.booked = false;
    }

    public boolean isBooked() {
        return booked;
    }

    public void book() {
        booked = true;
    }

    public void cancelBooking() {
        booked = false;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }
}