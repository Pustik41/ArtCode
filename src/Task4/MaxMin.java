package Task4;

public class MaxMin {
    public static void main(String[] agrs){
        int[] array = new int[9];
        
        for(int i = 0; i < array.length; i++){
            array[i] = (int)  (Math.random()*100);
        }
        
        int max = array[0];
        int min = array[0];
        
        for(int i = 1; i < array.length; i++){    
            if(max < array[i]){
                max = array[i];
            }
            
            if(min > array[i]){
                min = array[i];
            }
        }
        
        System.out.println("Min = " + min + " Max = " + max );
    }
}
