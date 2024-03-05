import java.util.Scanner;
import java.time.LocalDateTime;

public class ConsoleUI {

    @SuppressWarnings("resource")
    public static int menu() {
        System.out.println("Welcome to Eventzee, your events manager!");
        System.out.println("Choose one of the options below to proceed:");
        System.out.println("1-Add User\n2-Add Event");
        System.out.println("3-See Current Events\n4-See Upcoming Events");
        System.out.println("5-See Past Events\n6-Register in the event");
        System.out.println("7-Quit the Event\n8-Quit app");

        Scanner input = new Scanner(System.in);

        int menuOption = input.nextInt();

        return menuOption;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EventManager eventManager = new EventManager();

        int menuOption;
        do {
            menuOption = menu();

            switch (menuOption) {
                case 1:
                    addNewUser(input);
                    break;
                case 2:
                    addNewEvent(input, eventManager);
                    break;
                case 3:
                    // see current events
                    break;
                case 4:
                    // see upcoming events
                    break;
                case 5:
                    // see past events
                    break;
                case 6:
                    // register in the event
                    break;
                case 7:
                    // quit event
                    break;
                case 8:
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid input. Please choose a valid option.");
                    break;
            }
        } while (menuOption != 8);

        input.close();
    }

    private static void addNewUser(Scanner input) {
        System.out.println("Let's add a new user!");
        System.out.println("Enter the full name:");
        String name = input.nextLine();
        System.out.println("Enter email:");
        String email = input.nextLine();
        System.out.println("Enter password:");
        String password = input.nextLine();
        System.out.println("Enter cpf:");
        String cpf = input.nextLine();
        System.out.println("Enter address:");
        String address = input.nextLine();

        User newUser = new User(name, email, password, cpf, address);
        newUser.register(name, email, password, cpf, address);
    }

    private static void addNewEvent(Scanner input, EventManager eventManager) {
        System.out.println("Let's add a new Event!");
        System.out.println("Enter the name of event:");
        String eventName = input.nextLine();
        System.out.println("Enter address of the event:");
        String eventAddress = input.nextLine();
        System.out.println("Enter category of the event (PARTY, SPORT_EVENT, CONCERT, OTHER):");
        String categoryInput = input.nextLine().toUpperCase();
        EventCategory category = EventCategory.valueOf(categoryInput);
        System.out.println("Enter date and time of the event (YYYY-MM-DDTHH:MM):");
        String dateTimeInput = input.nextLine();
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeInput);
        System.out.println("Enter description of the event:");
        String eventDescription = input.nextLine();

        Event newEvent = new Event(eventName, eventAddress, category, dateTime, eventDescription);
        eventManager.addEvent(newEvent);
    }
}
