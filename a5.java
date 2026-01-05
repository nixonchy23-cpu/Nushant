import java.util.Scanner;
import java.util.Arrays;

public class a5 {

    public static void main(String[] args) {
       
        String[] districts = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};

        System.out.println("--- Initial Districts Array ---");
        
       
        printNumberedList(districts);
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n--- Update Districts Array ---");
        System.out.print("Enter the number of districts for the new array: ");
        
      
        int newSize;
        if (scanner.hasNextInt()) {
            newSize = scanner.nextInt();
            scanner.nextLine(); 
        } else {
            System.out.println("Invalid input for number of districts. Exiting.");
            scanner.close();
            return;
        }

        
        String[] updatedDistricts = new String[newSize];
        
        System.out.println("Enter the names for the " + newSize + " districts:");
        
      
        for (int i = 0; i < newSize; i++) {
            System.out.print((i + 1) + ". Name: ");
            updatedDistricts[i] = scanner.nextLine();
        }
        
        scanner.close();

       
        System.out.println("\n--- Updated Districts Array ---");
        printNumberedList(updatedDistricts);


        System.out.println("\nArray content (for verification): " + Arrays.toString(updatedDistricts));
    }
    
    
    public static void printNumberedList(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ". " + arr[i]);
        }
    }
}