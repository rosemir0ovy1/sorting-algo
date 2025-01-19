class SelectionSort{
    static void selectionSort(int arr[], int n){
        for(int i=0; i<n-1; i++){
            int minInd=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minInd]) minInd=j;
            }
            if(i!=minInd){
                int temp=arr[i];
                arr[i]=arr[minInd];
                arr[minInd]=temp;
            }
        }
    }

    static void display(int[] arr){
        for(int num: arr) System.out.print(num+" ");
        System.out.println();
    }

    public static void main (String args[]){
        int[] arr={10000, 10, 100, 1, 1000};
        int n=arr.length;

        System.out.println("Before Sorting");
        display(arr);

        selectionSort(arr,n);

        System.out.println("After Sorting");
        display(arr);
    }
}