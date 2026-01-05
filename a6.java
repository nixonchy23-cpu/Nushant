import java.util.Scanner;
import java.util.Arrays;


public class a6 {
    public static void main(String[] args) {
        
        String[] districts = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};
        
        System.out.println("--- Original Array ---");
        
       
        printNumberedList(districts);
        
        System.out.println("\n--- Array Update ---");
        
        
        Scanner scanner = new Scanner(System.in);
        
        int numberOfNewDistricts = 0;
        
        
        while (true) {
            System.out.print("Enter the number of NEW districts to add: ");
            if (scanner.hasNextInt()) {
                numberOfNewDistricts = scanner.nextInt();
                if (numberOfNewDistricts >= 0) {
                    break; 
                } else {
                    System.out.println("Please enter a non-negative number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); 
            }
        }
        
        
        scanner.nextLine(); 
        
        
        int newArraySize = districts.length + numberOfNewDistricts;
        String[] updatedDistricts = Arrays.copyOf(districts, newArraySize);
        
        
        for (int i = 0; i < numberOfNewDistricts; i++) {
            System.out.print("Enter name for NEW district " + (i + 1) + ": ");
            String newDistrictName = scanner.nextLine();
            updatedDistricts[districts.length + i] = newDistrictName;
        }

        
        scanner.close();
        
        System.out.println("\n--- Updated Array ---");
       
        System.out.println("\nUpdated Numbered List:");
        
        printNumberedList(updatedDistricts);
    }
    
   
    public static void printNumberedList(String[] array) {
        for (int i = 0; i < array.length; i++) {
            
            System.out.println((i + 1) + ". " + array[i]);
        }
    }
}