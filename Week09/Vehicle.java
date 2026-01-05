package Week09;


public class Vehicle {
    private int vehicleId;
    private String brand;
    protected double  BasePrice;

    public Vehicle(int vehicleId,String brand,double basePrice  ) {
        BasePrice = basePrice;
        this.brand = brand;
        this.vehicleId = vehicleId;
    }
     void displayVehicleInfo() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Base Price: " + BasePrice);
    }
    double calculateTax(){
        return 0.1 * BasePrice;
    }

    public static void main(String[] args) {
        Car car = new Car(1, "Toyota", 3000000, 4, "Petrol");
        Bike bike= new Bike(2,"BMW",100000,300);
        car.displayVehicleInfo();
        System.out.println("Tax: "+ car.calculateTax());

        double final_price_Car=car.calclateFinalPrice();

        System.out.println("Final Price of Car: "+final_price_Car);
        bike.displayVehicleInfo();
        System.out.println("Tax: "+ bike.calculateTax());
        double final_price_Bike=bike.calculateFinalPrice();
        System.out.println("Final Price of Bike: "+final_price_Bike);

    }



}
