public class Main {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private boolean isGuest;
    public Main(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.isGuest = false;
    }
    public Main(String email) {
        this.email = email;
        this.isGuest = true;
    }
    public void convertToUser(String name, String lastName, String password) {
        if (isGuest) {
            this.name = name;
            this.lastName = lastName;
            this.password = password;
            this.isGuest = false;
        } else {
            System.out.println("This is already a user account.");
        }
    }
    public void displayUserInfo() {
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Guest Account: " + isGuest);
    }

    public static void main(String[] args) {
        Main guest1 = new Main("guest1@example.com");
        Main guest2 = new Main("guest2@example.com");
        Main user1 = new Main("John", "Doe", "john@example.com", "password123");
        System.out.println("Initial Information:");
        guest1.displayUserInfo();
        System.out.println();
        guest2.displayUserInfo();
        System.out.println();
        user1.displayUserInfo();
        System.out.println();
        guest1.convertToUser("Alice", "Smith", "guest123");
        System.out.println("Information after conversion:");
        guest1.displayUserInfo();
    }
}
