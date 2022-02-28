public class array
{
    public static void insertInTheEnd(int [] arr, int data, int len) {
        arr[len] = data;
    }
    public static void insertInTheBeginning(int [] arr, int data, int len) {
        for(int i = len-1 ; i >= 0 ; --i) {
            arr[i+1] = arr[i];
        }
        arr[0] = data;
    }
    public static void deleteInTheBeginning(int [] arr,int len) {
        for(int i = 1 ; i < len ; ++i) {
            arr[i-1] = arr[i];
        }
    }
    public static int linearSearch(int [] arr, int data) {
        for(int i = 0 ; i < arr.length ; ++i) {
	        if(arr[i] == data) {
	            return i;
	        }
	    }
	    return -1;
    }
    public static int binarySearch_recr(int [] arr, int data, int low, int high) {
        if(low > high)
            return -1;
        int mid = (low+high)/2;
        if(arr[mid] == data)
            return mid;
        else if(arr[mid] > data) {
            return binarySearch_recr(arr,data,low,mid-1);
        } else {
            return binarySearch_recr(arr,data,mid+1,high);
        }
    }
    public static int binarySearch_recr(int [] arr, int data) {
       return binarySearch_recr(arr,data,0,arr.length-1);
    }
    public static int binarySearch(int [] arr, int data) {
        int low = 0, high = arr.length-1;
        while(low < high) {
            int mid = (low+high)/2;
            if(arr[mid] == data) {
                return mid;
            } else if(arr[mid] > data) {
                high = mid-1;
            } else { // arr[mid] < data
                low = mid+1;
            }
        }
        return -1; // unsuccessful search
    }
    //worst case complexity = n^2 
    // best case complexity =  n^2
    public static void BubbleSort(int arr[]) {
        int len = arr.length;
        // (n-1)
        for(int i = 0 ; i < len-1 ; ++i) {
            for(int j = 0 ; j < len-1 ; ++j) { // (n-1)
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                    
            }
        }
        // (n-1)*(n-1) = n^2-2n+1 = O(n^2) 
    }
    //worst case and best case complexity =
    // = n+(n-1)+(n-2)+(n-3)+..... 2 + 1
    // = n(n+1)/2
    // n^2
    // (n-1) + (n-2) + (n-1-2) + (n-1-3) + (n-1-4) + ..... 3 + 2  1
    // n(n+1)/2 = (n-1)n/2 = (n^2-n)/2 = N^2-n = O(n^2)  
    public static void BubbleSortOptimized(int arr[]) {
        int len = arr.length;
        for(int i = 0 ; i < len-1 ; ++i) {
            for(int j = 0 ; j < len-1-i ; ++j) { // note this line
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                    
            }
        }
    }
    // worst case complexity = n^2
    // bets case complexity = n
    // n-1 + (n-1-1) + (n-1-2) + (n-1-3) + (n-1-4) + ......... 1
    //O(n^2)
    // n-1 = O(n)
    public static void BubbleSortWithSwapOptimization(int arr[]) {
        int len = arr.length;
        boolean swapped = true;
        // (n-1)
        for(int i = 0 ; i < len-1 && swapped ; ++i) {
            swapped = false;
            // 0 to len-1-0
            // 0 to n-1
            for(int j = 0 ; j < len-1-i ; ++j) {
                if(arr[j] > arr[j+1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    // worst case complexity = n^2
    // best case complexity = n
    public static void BubbleSortWith2Opts(int arr[]) {
        int len = arr.length;
        boolean swapped = true;
        for(int i = 0 ; i < len-1 && swapped ; ++i) {
            swapped = false;
            for(int j = 0 ; j < len-1-i ; ++j) {
                if(arr[j] > arr[j+1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void insertionSort(int arr[]) {
        for(int i = 0 ; i < arr.length ; ++i) {
            int data = arr[i];
            int j = i-1;
            for(; j >= 0 && arr[j] > data ; --j) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = data;
        }
    }
    public static void selectionSort(int arr[]) {
        //int i 
        for(int i = 0 ; i < arr.length ; ++i) {
            int j = i;
            int smallest = j;
            //int idx = j;
            for(; j < arr.length ; ++j) {
                if(arr[j] < arr[smallest]) {
                    smallest = j;
                    //idx = j;
                }
            }
            // i and smallest
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }
    public static int linearSearch_recr1(int [] arr, int data, int start) {
        if(start == arr.length)
            return -1;
        if(arr[start] == data) {
            return start;
        }
        return linearSearch_recr(arr,data,start+1);
        
    }
    public static int linearSearch_recr(int [] arr, int data, int len) {
        if(len == 0)
            return -1;
        if(arr[len-1] == data) {
            return len-1;
        }
        return linearSearch_recr(arr,data,len-1);
        
    }
    public static int linearSearch_recr(int [] arr, int data) {
        return linearSearch_recr(arr,data,arr.length);
    }
    public static void merge(int [] arr, int l, int mid, int r) {
        int [] left = new int[mid-l+1];
        int [] right = new int[r-mid];
        for(int i = l,k = 0 ; i <= mid ; ++i,++k) {
            left[k] = arr[i];
        }
        for(int i = mid+1,k = 0 ; i <= r ; ++i,++k) {
            right[k] = arr[i];
        }
        int i = 0,  j = 0 , k = l;
        while(i < left.length && j < right.length) {
            if(left[i] < right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        while(i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int [] arr, int l, int r) {
        if(l < r) {
            int mid = (l + r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    public static void mergeSort(int [] arr) {
        mergeSort(arr,0,arr.length-1);
    }
    public static void swap(int [] arr, int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int [] arr, int p, int r) {
        int pivot = arr[r];
        int i = p-1;
        for(int j = p ; j <= r ; ++j) {
            if(arr[j] < pivot) {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,r);
        return i+1;
    }
    public static void quickSort(int [] arr, int p, int r) {
        if(p < r) {
            int q = partition(arr,p,r);
            quickSort(arr,p,q-1);
            quickSort(arr,q+1,r);
        }
    }
    public static void quickSort(int [] arr) {
        quickSort(arr,0,arr.length-1);
    }
	public static void main(String[] args) {
	    /*int [] arr = new int[10];
	    insertInTheEnd(arr,10,0);
	    insertInTheEnd(arr,20,1);
	    insertInTheBeginning(arr,30,2);
	    deleteInTheBeginning(arr,3);
	    for(int i = 0 ; i < arr.length ; ++i) {
	        System.out.print(arr[i] + " ");
	    }*/
	    int arr[] = {12, 2, 10, 0, -1,0,4,5,3,15};
	    int index = linearSearch_recr(arr,16);
	    //System.out.println("index = " + index);
	    quickSort(arr);
	    for(int i = 0 ; i < arr.length ; ++i) {
	        System.out.print(arr[i] + "\t");
	    }
	    index = binarySearch_recr(arr,40);
	    System.out.println("index = " + index);
		//System.out.println("Hello World");
	}
}







