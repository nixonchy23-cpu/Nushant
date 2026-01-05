package Week09;


/**
 * Write a description of class Bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class Bike extends Vehicle{
    private int engineCapacity;
    public Bike(int VehicleId,String brand,double BasePrice,int engineCapacity){
        super(VehicleId,brand,BasePrice);
        this.engineCapacity=engineCapacity;

    }
    double calculateFinalPrice(){
        double tax=super.calculateTax();
        return BasePrice+tax;
    }

}
