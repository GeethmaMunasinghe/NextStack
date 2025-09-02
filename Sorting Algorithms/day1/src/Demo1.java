import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int []arr={50,20,60,55,5};

        for (int i=0;i<arr.length-1;i++){

            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
                try {
                    Thread.sleep(2000);
                    System.out.println(Arrays.toString(arr));

                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
            System.out.println("----------------------------");
        }
    }
}
