import java.time.LocalDateTime;
//import java.util.List;

public class Event {
    private String name;
    private String address;
    private EventCategory category;
    private LocalDateTime dateTime;
    private String description;
    // private List<User> participants;

    public Event(String name, String address, EventCategory category, LocalDateTime dateTime, String description) {
        this.name = name;
        this.address = address;
        this.category = category;
        this.dateTime = dateTime;
        this.description = description;
    }

    public void getEventDetails() {
        // TO BE IMPLEMENTED
    }

    public void addParticipant(User user) {
        // TO BE IMPLEMENTED
    }

    public void removeParticipant(User user) {
        // TO BE IMPLEMENTED
    }

}
