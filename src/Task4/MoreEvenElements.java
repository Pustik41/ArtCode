package Task4;

public class MoreEvenElements {
    public static void main(String[] args){
        int[] a = new int[10];
        int[] b = new int[10];
        int evenA = 0;
        int evenB = 0;
        
        for(int i = 0; i < a.length; i++){
            a[i] = (int) ((Math.random()*50) + 25);
            b[i] = (int) ((Math.random()*50) + 25);
            
            if(a[i] % 2 == 0) evenA++;
            if(b[i] % 2 == 0) evenB++;
        }
        
        System.out.println("Массив А:");
        Utils.printIntArray(a);
        System.out.println("Массив B");
        Utils.printIntArray(b);
        
        if(evenA > evenB){
            System.out.println("Больше парных элементов в массиве A");
        } else {
             System.out.println("Больше парных элементов в массиве B");
        }
    }
}
