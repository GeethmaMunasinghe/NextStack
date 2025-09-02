import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr={50,20,30};

        for (int i=0;i<arr.length-1;i++){
            int minIndex=i;

            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if (minIndex!=i){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
            try{
                Thread.sleep(100);
                System.out.println(Arrays.toString(arr));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("-------------------------------");
        }
        System.out.println("Array is sorted");
        System.out.println(Arrays.toString(arr));
    }
}
