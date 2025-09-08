public class MergeSort {
    public static void main(String[] args) {
        int [] array={5,2,9,1,2,6,7,4};
        System.out.println("Before sorting");
        printArray(array);
        mergeSort(array,0,array.length-1);
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left<right){
            int mid=left+(left+right)/2;
            mergeSort(array,left,mid);
            System.out.println(left+","+mid);
            mergeSort(array,mid+1,right);

            merge(array,left,mid,right);
            System.out.println("/nSorted Array...");
            printArray(array);
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int n1=mid-left+1;
        int n2=right-mid;

        int [] L=new int[n1];
        int [] R=new int[n2];

        for(int i=0; i<n1;i++){
            L[i]=array[left+i];
        }
        for (int j=0;j<n2;j++){
            R[j]=array[mid+j+1];
        }
        int i=0;
        int j=0;
        int k=left;
        while (i<n1&&j<n2){
            if (L[i]<=R[j]){
                array[k++]=L[i++];
            }else{
                array[k++]=R[j++];
            }
        }
        while(i<n1){
            array[k++]=L[i++];
        }
        while(j<n2){
            array[k++]=R[j++];
        }

    }


    private static void printArray(int[] array) {
        for (int value:array){
            System.out.println(value+" ");
        }
        System.out.println();
    }
}
