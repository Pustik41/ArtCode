package Task4;

public class SplitStartEnd {
    
    public static void main(String[] agrs){
        int[] array = new int[15];
        
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*100);
        }
        
        System.out.println("Массив:");
        Utils.printIntArray(array);
        
        System.out.println("Массив после splitArray:"); 
        Utils.printIntArray(splitArray(array, 4, 11));
    }
    
    public static int[] splitArray(int[] arr, int start, int end){    
        int length = end - start - 1;
        
        int[] mas = new int[length];
        
        for(int i = 0; i < mas.length; i++){
            mas[i] = arr[i + start + 1];
        }
        
        return mas;
    }
    
}
