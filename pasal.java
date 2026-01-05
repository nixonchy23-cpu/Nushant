public class pasal
{
    private String name;
    private double price;
    private int stock;
    private boolean prescriptionRequired;

    public pasal(String name, double price, int stock, boolean prescriptionRequired) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.prescriptionRequired = prescriptionRequired;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
    public boolean isPrescriptionRequired() { return prescriptionRequired; }

    public void setPrice(double price) { this.price = price; }
    public void setStock(int stock) { this.stock = stock; }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: Rs. " + price);
        System.out.println("Stock: " + stock);
        System.out.println("Prescription Required: " + (prescriptionRequired ? "Yes" : "No"));
        System.out.println("----------------------------------");
    }
}
