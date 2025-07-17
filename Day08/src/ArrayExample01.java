import java.util.Arrays;
import java.util.Scanner;
public class ArrayExample01 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int [] arr= new int[5];

            for(int i=0;i<5;i++){
                System.out.println("Enter Number :"+(i+1));
                arr[i]=sc.nextInt();

            }
            System.out.println(Arrays.toString(arr));



            System.out.println("system terminated");
        }

}
