//https://www.geeksforgeeks.org/frequent-element-array/
// 1 3 2 4 1 2 1
import java.util.*;
class HelloWorld {
    // O(n)
    public static int maxFrequentElement_better(int [] arr) {
        // key - value
        // arr - 1
        int max = 0;
        int number = arr[0];
        Map<Integer,Integer> m = new HashMap<>();
        for(int i = 0 ; i < arr.length ; ++i) {
            if(m.containsKey(arr[i]) == true) {
                int count = m.get(arr[i]);
                m.put(arr[i],count+1);
                if(count+1 > max) {
                    max = count+1;
                    number = arr[i];
                }
            } else {
                m.put(arr[i],1);
                if(1 > max) {
                    max = 1;
                    number = arr[i];
                }
            }
        }
        
        /*for (Map.Entry<Integer, Integer> entry : m.entrySet()){
            if(entry.getValue() > max) {
                max = entry.getValue();
                number = entry.getKey();
            }
        }*/
     System.out.println("most frequent element is " + number + " appearing " + max + " times" );
        return number;
            //System.out.println(value);
        
        
    }
    public static int maxFrequentElement(int [] arr) {
        int max = 0;
        int number = arr[0];
        for(int i = 0 ; i < arr.length ; ++i) { // going over each element of the array
            int count = 0;
            for(int j = 0 ; j < arr.length ; ++j) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > max) {
                max = count;
                number = arr[i];
            }
        }
        System.out.println("most frequent element is " + number + " appearing " + max + " times" );
        return number;
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int [] arr = {1,3,2,4,3,3,3};
        maxFrequentElement_better(arr);
    }
}
