import java.util.Arrays;
import java.util.Scanner;
public class ArrayExample02 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int [] arr= new int[5];

            for(int i=0;i<5;i++){
                System.out.println("Enter Number :"+(i+1));
                arr[i]=sc.nextInt();

            }
            System.out.println(Arrays.toString(arr));

            int total=0;
            for (int j=0;j<5;j++){
                total +=arr[j];
            }
            System.out.println("Total :"+total);

            System.out.println("system terminated");
        }
}
