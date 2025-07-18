import java.util.Random;
public class RandomArraySum {


        public static void main(String[] args) {
            Random random = new Random(); // Create Random object
            int[] numbers = new int[5];  // Array to hold 10 random numbers
            int total = 0;

            for (int i = 0; i < 5; i++) {
                numbers[i] = random.nextInt(100); // Random number between 0 and 99
            }

            // Print the numbers
            System.out.print("Random Numbers: ");
            for (int i=0;i<5;i++) {
                System.out.println(numbers[i]);
            }

            // Print the total
            System.out.println("\nTotal sum: " + total);
        }


}
