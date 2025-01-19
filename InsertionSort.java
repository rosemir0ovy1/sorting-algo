class InsertionSort{
    static void insertionSort(int[] arr, int n){
        for(int i=1;i<n;i++){
            int j=i-1;
            int key=arr[i];
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    static void display(int[] arr){
        for(int num:arr) System.out.print(num+" ");
        System.out.println();
    }

    public static void main(String args[]){
        int[] arr={1000, 10, 1, 100, 55};
        int n=arr.length;

        System.out.println("Before Sorting:");
        display(arr);

        insertionSort(arr, n);

        System.out.println("After Sorting:");
        display(arr);
    }
}