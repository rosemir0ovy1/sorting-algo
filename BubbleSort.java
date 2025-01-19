class BubbleSort{
    static void bubbleSort(int[] arr, int n){
        for(int i=0;i<n;i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
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

        bubbleSort(arr, n);

        System.out.println("After Sorting:");
        display(arr);
    }
}