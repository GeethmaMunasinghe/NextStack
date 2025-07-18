
import java.util.Arrays;
public class Example02 {

        public static void printArr(int[] print){
            for (int i=0;print.length>i;i++){
                System.out.println(print[i]);
            }
        }

        public static void main(String[] args) {

            int arr[]={10,20,30,50,40,90,80};
            printArr(arr);

        }

}
