package Task4;

public class ReplaceMaxMin {
    
    public static void main(String[] agrs){
        int[] array = new int[10];
        
        for(int i = 0; i < array.length; i++){
            array[i] = (int)  (Math.random()*100);
        }
        
        int max = array[0];
        int min = array[0];
        int idMax = 0;
        int idMin = 0;
        
        for(int i = 1; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
                idMax = i;
            }
            
            if(min > array[i]){
                min = array[i];
                idMin = i;
            }
        }
        Utils.printIntArray(array);
        
        array[idMin] = max;
        array[idMax] = min;
        
        Utils.printIntArray(array);
    }
}
