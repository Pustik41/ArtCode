package Task4;

public class CountNumeral {
    
     public static void main(String[] agrs){
         int[] array = {1, 15, 4, 6, 15, 32, 45, 15, 6, 32};
         int count = 0;
         int digit = 15;
         
         for(int i = 0; i < array.length; i++){
             if(array[i] == digit){
                 count++;
             }
         }
         
         System.out.println("Цифра " + digit + " встречается в массиве - " + count + " раз(а)");
     }
    
}
