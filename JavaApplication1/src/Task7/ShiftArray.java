package Task7;

import Task4.Utils;

public class ShiftArray {
    public static void main(String[] args){
        
        int[] arr = {1,2,3,4,5};
        int shift = 3;
        
        for(int i = 0; i < shift; i++){
            for(int j = arr.length - 1; j > 0; j--){
                int num = arr[j];
                arr[j] = arr[j - 1];
                arr[j -1] = num;
            }
        }
        
        Utils.printIntArray(arr);
    }
    
}
