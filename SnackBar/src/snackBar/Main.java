package snackBar;

public class Main {

  public static void main(String[] args){

    // Customers
    Customer c1 = new Customer("Customer 1", 37.75);
    Customer c2 = new Customer("Customer 2", 28.14);

    // Vending machines
    VendingMachine v1 = new VendingMachine("Snack");

    // Snacks
    Snack s1 = new Snack("snack", 0, 0.00, v1.getId());
    Snack s2 = new Snack("snack", 35, 0.00, v1.getId());
    Snack s3 = new Snack("snack", 29, 0.00, v1.getId());
    Snack s4 = new Snack("snack", 21, 0.00, v1.getId());

    System.out.println("*** Query Data ***");
    
    System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
    System.out.println("Quanity of " + s4.getName() + " " + s4.getId() + " is " + s4.getQuanity());
    System.out.println();

    System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
    System.out.println("Quanity of " + s3.getName() + " " + s3.getId() + " is " + s3.getQuanity());
    System.out.println();

    System.out.println(c2.getName() + " cash on hand $" + c2.getCashOnHand());
    s4.buySnack(2);
    System.out.println("Quanity of " + s4.getName() + " " + s4.getId() + " is " + s4.getQuanity());
    System.out.println();

    c1.addCash(8.00);
    System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
    System.out.println();

    c1.buySnacks(1.00);
    System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
    System.out.println("Quanity of " + s2.getName() + " " + s2.getId() + " is " + s2.getQuanity());
    System.out.println();

    s3.addQuanity(12);
    System.out.println("Quanity of " + s3.getName() + " " + s3.getId() + " is " + s3.getQuanity());
    System.out.println();

    c2.buySnacks(6.00);
    System.out.println(c2.getName() + " cash on hand $" + c2.getCashOnHand());
    s3.buySnack(3);
    System.out.println("Quanity of " + s3.getName() + " " + s3.getId() + " is " + s3.getQuanity());

  }
}