import java.util.*;

class Event {
    String title;
    String time;
    String description;

    Event(String title, String time, String description) {
        this.title = title;
        this.time = time;
        this.description = description;
    }

    public String toString() {
        return time + " - " + title + ": " + description;
    }
}

public class EventCalendarApp {
    public static void main(String[] args) {
        TreeMap<String, List<Event>> calendar = new TreeMap<>();

        addEvent(calendar, "2025-05-15", new Event("Team Meeting", "10:00 AM", "Project update"));
        addEvent(calendar, "2025-05-14", new Event("Dentist", "02:00 PM", "Routine check-up"));
        addEvent(calendar, "2025-05-15", new Event("Client Call", "03:30 PM", "Discussion with client"));

        displayEventsForDate(calendar, "2025-05-15");

        removeEvent(calendar, "2025-05-15", "Client Call");

        displayAllEvents(calendar);
    }

    static void addEvent(TreeMap<String, List<Event>> calendar, String date, Event event) {
        calendar.putIfAbsent(date, new ArrayList<>());
        calendar.get(date).add(event);
    }

    static void removeEvent(TreeMap<String, List<Event>> calendar, String date, String title) {
        if (calendar.containsKey(date)) {
            calendar.get(date).removeIf(e -> e.title.equals(title));
        }
    }

    static void displayEventsForDate(TreeMap<String, List<Event>> calendar, String date) {
        System.out.println("Events on " + date + ":");
        List<Event> events = calendar.getOrDefault(date, new ArrayList<>());
        for (Event event : events) {
            System.out.println(event);
        }
    }

    static void displayAllEvents(TreeMap<String, List<Event>> calendar) {
        System.out.println("All Upcoming Events:");
        for (String date : calendar.keySet()) {
            System.out.println(date + ":");
            for (Event event : calendar.get(date)) {
                System.out.println("  " + event);
            }
        }
    }
}
