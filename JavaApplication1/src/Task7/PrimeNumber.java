package Task7;

public class PrimeNumber {
    
    public static void main(String[] args){
     
        int num = 21;
        
        if(num % 2 == 0 && num != 2){
            System.out.println("Число - " + num + " не является простым");
        }
        else if(checkNum(num)){        
            System.out.println("Число - " + num + " является простым");
        }
        else{
            System.out.println("Число - " + num + " не является простым");
        }
    }
    
    public static boolean checkNum(int x){
        
        for(int i = 3; i < x; i = i + 2){
            if(x % i == 0){     
                return false;
            }
        }
        
        return true;
    }
 
       
}
