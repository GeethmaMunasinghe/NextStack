import java.util.Random;
public class RandomArraySum {


        public static void main(String[] args) {
            Random random = new Random(); // Create Random object
            int[] numbers = new int[10];  // Array to hold 10 random numbers
            int total = 0;

            // Fill the array with random numbers (0 to 99) and calculate total
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100); // Random number between 0 and 99
                total += numbers[i];
            }

            // Print the numbers
            System.out.print("Random Numbers: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }

            // Print the total
            System.out.println("\nTotal sum: " + total);
        }


}
