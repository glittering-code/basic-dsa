public class Main {
  public static int left(int i) {
    return 2*i+1;
  }
  public static int right(int i) {
    return 2*i+2;
  }
  public static void swap(int [] arr, int l, int r) {
    int temp = arr[l];
    arr[l] = arr[r];
    arr[r] = temp;
  }
  // arr[idx] = 4 , arr[l] = 14 arr[r] = 7
  public static void maxHeapify(int [] arr, int idx, int len) {// idx = 1
    if(idx > len)
      return;
    int l = left(idx); // l = 3
    int r = right(idx); // r = 4
    int largest = idx; // 1
    if(l < len && arr[l] > arr[largest]) {
      largest = l;
    }
    if(r < len && arr[r] > arr[largest]) {
      largest = r;
    }
    if(largest != idx) {
      swap(arr,idx,largest);
      maxHeapify(arr,largest,len);
    }
  }
  public static void buildMaxHeap(int [] arr) {
    for(int i = arr.length/2-1 ; i >= 0 ; --i) {
      maxHeapify(arr,i,arr.length-1);
    }
  }
  public static void heapSort(int [] arr) {
    buildMaxHeap(arr);
    printArray(arr);
    for(int i = arr.length-1 ; i >= 0 ; --i) { // 7
      swap(arr,0,i);
      maxHeapify(arr,0, i); //6
    }
  }
  public static void printArray(int [] arr) {
    for(int i = 0 ; i <= arr.length-1 ; ++i) {
      System.out.print(arr[i] + "\t");
    }
    System.out.println();
  }
  public static void main(String [] args) {
    int [] arr = {3,2,4,1,7,9,0};
    heapSort(arr);
    printArray(arr);
  }

}
