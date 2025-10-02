import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Opretter en ArrayList kaldet 'customers'
        ArrayList<Customer> customers = new ArrayList<>();

        // Opretter Customer instanser og tilføjer dem til listen
        customers.add(new Customer("John", "Doe", "johndoe123"));
        customers.add(new Customer("Jane", "Smith", "janesmith456"));
        customers.add(new Customer("Bob", "Johnson", "bobjohnson789"));

        // Kalder printCustomers metoden med customers som argument
        printCustomers(customers);
    }

    // 1.f - Static metode til at printe alle customers
    public static void printCustomers(ArrayList<Customer> customers) {
        // For each loop der gennemløber alle customers
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}