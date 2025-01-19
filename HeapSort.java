public class HeapSort {

    static void SWAP(int [] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void MAX_HEAPIFY(int[] arr, int i, int n){
        int largest=i;
        int rc=2*i+2;
        int lc=2*i+1;

        if(lc<n && arr[lc]>arr[largest]) largest=lc;
        if(rc<n && arr[rc]>arr[largest]) largest=rc;

        if(largest!=i){
            SWAP(arr, i, largest);
            MAX_HEAPIFY(arr, largest, n);
        }
    }

    static void display(int[] arr){
        for(int num:arr) System.out.print(num +" ");
        System.out.println();
    }

    public static void main(String args[]){

        int[] arr={4,10,5,3,1,2};
        int n=arr.length;

        for(int i=(n/2)-1; i>=0; i--){
            MAX_HEAPIFY(arr, i, n);
        }

        display(arr);

        for(int i=n-1; i>=0; i--){
            SWAP(arr, 0, i);
            MAX_HEAPIFY(arr, 0, i);
        }

        display(arr);

    }
}
