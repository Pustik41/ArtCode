package Task4;

public class ArithmeticMean {
    
    public static void main(String[] args){
        
        int[] array = new int[10];
        int sum = 0;
        int aMean = 0;
        int graph = 0;
        
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()* 100);
            sum += array[i];
        }
        
        aMean = sum/array.length;
        
        System.out.println("Массив :");
        Utils.printIntArray(array);
        System.out.println("Среднее арифмитическое массива = "  + aMean);
        
    }
    
}
