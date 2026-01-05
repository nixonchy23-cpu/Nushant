package Week09;


public  class Car extends Vehicle{

        private int noofDoors;
        private String fuelType;

    public Car(int vehicleId, String brand, double BasePrice, int noofDoors, String fuelType) {
        super(vehicleId, brand, BasePrice);
        this.noofDoors = noofDoors;
        this.fuelType = fuelType;
    }
    double calclateFinalPrice(){
        double tax=super.calculateTax();
        double luxuryCharge=0.05*BasePrice;
        return BasePrice+tax+luxuryCharge;
    }
}
