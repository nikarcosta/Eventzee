import java.io.FileWriter;
import java.io.IOException;

public class User {
    // Attributes
    private String name;
    private String email;
    private String password;
    private String cpf;
    private String address;

    // Constructor
    public User(String name, String email, String password, String cpf, String address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.address = address;
    }

    // Methods
    public void register(String name, String email, String password, String cpf, String address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.address = address;

        saveUserDataToFile();
        System.out.println("User registered successfully!");
    }

    public String confirmAttendance(Event event) {
        // TO BE IMPLEMENTED!!!
        return "Attendance confirmed for event: ";
    }

    private void saveUserDataToFile() {
        try (FileWriter writer = new FileWriter("users.txt", true)) {
            writer.write(name + "," + email + "," + password + "," + cpf + "," + address + "\n");
        } catch (IOException e) {
            System.err.println("Error writing user data to file: " + e.getMessage());
        }
    }
}
