import java.util.ArrayList;
import java.util.List;

public class Hotel {
	 private String name;
	    private String location;
	    private int numberOfRooms;
	    private List<Room> rooms;

	    public Hotel(String name, String location, int numberOfRooms) {
	        this.name = name;
	        this.location = location;
	        this.numberOfRooms = numberOfRooms;
	        this.rooms = new ArrayList<>();
	    }

	    public void addRoom(Room room) {
	        rooms.add(room);
	    }

	    public List<Room> getRooms() {
	        return rooms;
	    }
	}