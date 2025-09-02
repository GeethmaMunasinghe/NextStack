import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        int[] arr={26,2,18};

        for (int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;

            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;

            }
            arr[j+1]=key;
            try {
                Thread.sleep(1000);
                System.out.println(Arrays.toString(arr));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("-------------------------------");

        }
        System.out.println("Array sorted");
        System.out.println(Arrays.toString(arr));

    }
}
