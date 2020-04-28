package snackBar;

public class Snack {

  // fields
  private static int maxId = 0;
  private int id;
  private String name;
  private int quanity;
  private double cost;
  private int machineId;

  // constructor
  public Snack(String name, int quanity, double cost, int machineId){
    
    maxId++;
    id = maxId;
    this.name = name;
    this.quanity = quanity;
    this.cost = cost;
    this.machineId = machineId;

  }

  // getters and setters

  // ID
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

  // quanity
  public void addQuanity(int quanity){
    this.quanity += quanity;
  }

  public void buySnack(int quanity){
    this.quanity -= quanity;
  }

  public int getQuanity(){
    return quanity;
  }

  // cost
  public void setCost(double cost){
    this.cost = cost;
  }

  public double getCost(){
    return cost;
  }

  public double getTotalCost(int quanity){
    return cost * (double)quanity;
  }

  // machineid
  public void setMachineId(int machineId){
    this.machineId = machineId;
  }

  public int getMachineId(){
    return machineId;
  }

}