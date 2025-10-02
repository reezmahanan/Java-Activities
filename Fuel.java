class Main {
   public static void main(String[] args) {
    Car alto = new Car();
     alto.move(2001);
  }
}
abstract class Vehicle{

    abstract void move(double val);
}
class Car extends Vehicle {

    private double fuelLevel = 100;


    void move(double distance){
        double fuelWaste = distance / 20;


        fuelLevel = fuelLevel - fuelWaste;
   
    if(fuelLevel < 0){
        System.out.println("Fuel tank is empty");
    } else {
        System.out.println("Car is moving");
        System.out.println("your fuel waste is");
        System.out.println(fuelWaste);
         System.out.println("your fuel level is");
      System.out.println(fuelLevel);
    }
  }
}