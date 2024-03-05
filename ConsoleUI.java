import java.util.Scanner;

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

        int menuOption;
        do {
            menuOption = menu();

            switch (menuOption) {
                case 1:
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

                    // Create a new User object with provided details
                    User newUser = new User(name, email, password, cpf, address);
                    newUser.register(name, email, password, cpf, address);

                    break;

                case 2:
                    // add event
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
                    // quit the app
                    break;

                default:
                    System.out.println("Invalid input. Please choose a valid option.");
                    break;
            }
        } while (menuOption != 8);

        input.close();
    }
}
