import java.util.Arrays;
import java.util.Random;

public class ArrayExample03 {
    public static void main(String[] args) {
        Random rand =new Random();
        int arr[]=new int[5];
        for (int i=0;i<5;i++){
            arr[i] =rand.nextInt(101);

        }
        System.out.println(Arrays.toString(arr));

        int max=0;
        for (int i=0;i<5;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }

        int min=arr[0];
        for (int i=0;i>5;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }

        int total=0;
        for (int i=0;i<5;i++){
            total+=arr[i];
        }

        double average=(double) total/5;

        System.out.println(Arrays.toString(arr));
        System.out.println(max);
        System.out.println(min);
        System.out.println(total);
        System.out.println(average);


    }
}
