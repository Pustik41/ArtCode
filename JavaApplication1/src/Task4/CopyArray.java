package Task4;

public class CopyArray {
    
    public static void main(String[] agrs){
    
        int[] a  = {1, 2, 32, 5};
        int[] b = {3, 45, 6, 23};
        
        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
        }
        
        Utils.printIntArray(b);
    }
}
