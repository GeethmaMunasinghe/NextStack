import java.util.Arrays;
import java.util.Scanner;
public class ArraysExample {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int [] arr= new int[5];

            System.out.println("Enter the first number");
            arr[0]=sc.nextInt();

            System.out.println("Enter the second number");
            arr[1]=sc.nextInt();

            System.out.println("Enter the third number");
            arr[2]=sc.nextInt();

            System.out.println("Enter the fourth number");
            arr[3]=sc.nextInt();

            System.out.println("Enter the fifth number");
            arr[4]=sc.nextInt();

            System.out.println(Arrays.toString(arr));

            System.out.println("system terminated");
        }

}
