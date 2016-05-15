package Task4;

public class MaxArithMean {
    public static void main(String[] agrs){
        int[] arr = new int[6];
        int frontSum = 0;
        int endSum = 0;
        int count = 0;
        int n = 0;
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random()*10);
            
            if(arr.length % 2 != 0){
                if(i <= arr.length/2){
                    frontSum += arr[i];
                }    
            }
            else if(i < arr.length/2){
                frontSum += arr[i];
                n = 1;
            }
            
            if(i >= arr.length/2){
                endSum += arr[i];
                count++;
            }
        }
        
        double maxFront =(double) frontSum/count;
        double maxEnd = (double) endSum/count; 
        
        System.out.println("Массив:");
        Utils.printIntArray(arr);
        
        if(maxFront < maxEnd){
            for(int i = arr.length/2; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }
        else{
            for(int i = 0; i <= arr.length/2 - n; i++){
                System.out.print(arr[i] + " ");
            }
        }
        
    }
}
