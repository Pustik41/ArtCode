package Task4;

public class EvenAndOddNumber {
    
    public static void main(String[] agrs){
        
       int[] array = new int[10];
       
       for(int i = 0; i < array.length; i++){
           array[i] = (int) (Math.random()*50);
           
           if(i % 2 == 0){
               if(array[i] % 2 != 0){
                   array[i] = array[i] + 1;
               }
           }else{                  
                if(array[i] % 2 == 0){
                    array[i] = array[i] + 1;
                } 
            }
       }
       
       Utils.printIntArray(array);
    }
    
}
