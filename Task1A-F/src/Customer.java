public class Customer {
    // Felter (private)
    private String firstName;
    private String lastName;
    private String username;
    private int id;

    // Statisk counter til at generere unikke id'er
    private static int counter = 0;

    // Konstruktør (1.b + 1.c)
    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;

        counter++;
        this.id = counter; // id sættes ud fra counter
    }

    // Getters og setters (1.d)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    // toString metode (1.d)
    @Override
    public String toString() {
        return "Customer {" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
