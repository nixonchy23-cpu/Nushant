public class a7 {

    public static void main(String[] args) {
        String[][] seats = new String[2][3];
        seats[0][0] = "Saroj";

        seats[0][1] = "Sushant";

        seats[0][2] = "Ujjwal";
        seats[1][0] = null;

        seats[1][1] = null;

        seats[1][2] = null;
        System.out.println("Seating Chart:");

        for (int row = 0; row < seats.length; row++) {

            for (int col = 0; col < seats[row].length; col++) {

                if (seats[row][col] == null || seats[row][col].isEmpty()) {

                    System.out.print("[empty]\t");

                } else {

                    System.out.print(seats[row][col] + "\t");

                }

            }

            System.out.println(); 

        }

    }

}

