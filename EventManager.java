import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class EventManager {
    private List<Event> events;

    public EventManager() {
        events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
        saveEventsToFile("events.data");
    }

    public void saveEventsToFile(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(events);
            System.out.println("Events saved to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error saving events to file: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void loadEventsFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            events = (List<Event>) ois.readObject();
            System.out.println("Events loaded from file: " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading events from file: " + e.getMessage());
        }
    }
}
