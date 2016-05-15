package Task7;

import Task4.Utils;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = new int[9];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random()*10); 
        }
        
        System.out.println("Изначальный массив:");
        Utils.printIntArray(arr);
        
        for(int i = 0; i < arr.length / 2; i++){
            int num = arr[arr.length - 1 - i];
            
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = num;                  
        }
        
        System.out.println("Инвертированный массив:");
        Utils.printIntArray(arr);
    }
}
