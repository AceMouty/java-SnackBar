package snackBar;

public class Customer{

  // fields
  private int maxId = 0;
  private int id;
  private String name;
  private double cashOnHand;

  // constructor
  public Customer(String name, double cashOnHand){
    
    maxId++;
    id = maxId;
    this.name = name;
    this.cashOnHand = cashOnHand;
  } 

  // getters and setters
  
  // id
  public int getId(){
    return id;
  }

  // name
  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  // cash on hand
  public void getCashOnHand(){
    return cashOnHand;
  }

  public void addCash(double cash){
    this.cashOnHand += cash;
  }

  public void buySnacks(double cost){
    this.cashOnHand -= cost;
  }


}