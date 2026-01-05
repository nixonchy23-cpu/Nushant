public class a2 {
    public static void main(String[] args) {

        int[] age = new int[5];
        int[] numbers = new int[10];
        System.out.println("The length of the age array is: " + age.length);
        System.out.println("The length of the numbers array is: " + numbers.length);

        System.out.println("\nValues in age array:");
        for (int i = 0; i < age.length; i++) {
            System.out.println("Index " + i + " = " + age[i]);
        }

        System.out.println("\nValues in numbers array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " = " + numbers[i]);
        }
    }
}
