package snackBar;

public class Main {

  public static void main(String[] args){

    // Customers
    Customer c1 = new Customer("Customer 1", 37.75);

    // Vending machines
    VendingMachine v1 = new VendingMachine("Snack");

    // Snacks
    Snack s1 = new Snack("snack", 0, 0.00, v1.getId());
    Snack s2 = new Snack("snack", 35, 0.00, v1.getId());
    Snack s3 = new Snack("snack", 41, 0.00, v1.getId());
    Snack s4 = new Snack("snack", 19, 0.00, v1.getId());
    
  }
}