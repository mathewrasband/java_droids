public class Droid{
  
  int batteryLevel;
  String name;
  
  // names droid and starts battery level at 100
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }
 
 // prints out droids current battery level
  public void energyReport(){
    System.out.println(batteryLevel);
  }
  
  // prints out what task the droid is currently doing
  public void performTask(String task){
    System.out.println(name + " is performing the task: " + task);
    batteryLevel = batteryLevel - 10;
  }
  public static void main(String[] args){
    Droid codey = new Droid("Codey");
    System.out.println(codey);
    codey.performTask("run");
  }

  
  public String toString(){
    return "Hello I am " + name + " the droid.";
  }
}