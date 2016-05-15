package Task4;

public class SumTwoArray {
    
    public static void main(String[] agrs){
        int[] a = {1, 2, 4, 8};
        int[] b = {3, 34, 2, 12};
        
        for(int i = 0; i < a.length; i++){
            a[i] += b[i];
        }
        
        Utils.printIntArray(a);
    }    
}
