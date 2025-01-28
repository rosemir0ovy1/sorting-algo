class QuickSort {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static int findPartition(int[] arr, int begin, int end){
        int pivot=arr[begin];
        int i=(begin+1);
        for(int j=begin+1; j<=end; j++){
            if(arr[j]<pivot){
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr , i-1, begin);
        return i-1;
    }

    static void quickSort(int[] arr, int begin, int end){
        if (begin < end) {
            int partition=findPartition(arr, begin, end);
            quickSort(arr, begin, partition-1);
            quickSort(arr, partition+1, end);
        }
    }
    static void display(int arr[]){
        for(int num: arr) System.out.print(num+" ");
        System.out.println();
    }
    public static void main(String args[]){
        int[] arr={1000, 100, -10, -100, 1, 0, -11};
        display(arr);
        int n=arr.length-1;
        quickSort(arr, 0, n);
        display(arr);
    }
}
