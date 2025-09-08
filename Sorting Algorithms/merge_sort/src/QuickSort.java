public class QuickSort{
    public static void main(String[] args) {
        int [] arr={10,5,2,6,1,45,3};
        int n=arr.length;
        quickSort(arr,0,n-1);

        for (int value:arr){
            System.out.print(value+" ");
        }

    }
    public static void quickSort(int [] arr,int low,int high){//quicksort implementation

        if(low<high){
            int pi=partion(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);

        }
    }

    static int partion(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i+1,high);


            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}