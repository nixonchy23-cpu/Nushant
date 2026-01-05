public class AushadhiPasal {

    public static void main(String[] args) {
        
        String[] medicineNames = {"Paracetamol", "Amoxicillin", "Cetirizine", "Omeprazole", "Ibuprofen"};
        double[] prices = {2.5, 10.0, 3.0, 5.5, 4.0};
        int[] stock = {100, 50, 75, 60, 40};
        String[] prescriptionRequired = {"Not Required", "Required", "Not Required", "Required", "Not Required"};

             for (int i = 0; i < medicineNames.length; i++) {
            System.out.printf("%-15s %-10.2f %-10d %-15s\n",
                              medicineNames[i], prices[i], stock[i], prescriptionRequired[i]);
        }

        System.out.println("==============================================================");
    }
}
