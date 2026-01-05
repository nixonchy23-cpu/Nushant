import java.util.Scanner;

public class a4{
    public static void main(String[] args) {


        int[] scores = {10, 20, 30, 40, 50};

        System.out.println("Original Scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + scores[i]);
        }

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("\nSum of all scores = " + sum);

        double average = (double) sum / scores.length;
        System.out.println("Average score = " + average);

        int highest = scores[0];
        int lowest = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        System.out.println("Highest score = " + highest);
        System.out.println("Lowest score = " + lowest);

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter number of subjects: ");
        int n = scan.nextInt();

        int[] newScores = new int[n];

    
        for (int i = 0; i < n; i++) {
            System.out.print("Enter score for subject " + (i + 1) + ": ");
            newScores[i] = scan.nextInt();
        }


        System.out.println("\nUpdated Scores:");
 

        for (int i = 0; i < scores.length; i++) {
            scores[i] = (i + 1) * 10; 
        }

        System.out.println("The length of the scores array is: " + scores.length);

        System.out.println("Updated scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score at index " + i + " = " + scores[i]);
        }
    }
}

        
    
