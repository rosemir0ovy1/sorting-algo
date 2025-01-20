class MergeSort{
    static void mergeSort(int[] arr, int n){
        if(n<2) return;

        int mid=n/2;
        int[] lArr=new int[mid];
        int[] rArr=new int[n-mid];

        for(int i=0; i<mid; i++) lArr[i]=arr[i];

        for(int i=mid; i<n; i++) rArr[i-mid]=arr[i];

        mergeSort(lArr, mid);

        mergeSort(rArr, n-mid);

        merge(arr, lArr, rArr, mid, n-mid); 
    }

    static void merge(int[] arr, int[] lArr, int[] rArr, int left, int right){
        int i=0, j=0, k=0;
        while(i<left && j<right){
            if(lArr[i]<rArr[j]){
                arr[k]=lArr[i];
                k++; i++;
            }else{
                arr[k]=rArr[j];
                k++; j++;
            }
        }

        while(i<left){
            arr[k]=lArr[i]; i++;
        }
        while(j<right){
            arr[k]=rArr[j]; j++;
        }
    }

    static void display(int[] arr){
        for(int num:arr) System.out.print(num+" ");
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={1000, 10, 55, 100, 1};
        int n=arr.length;

        System.out.println("Before Merge Sort");
        display(arr);

        mergeSort(arr, n);
        
        System.out.println("After Merge Sort");
        display(arr);
    }
}