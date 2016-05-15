package Task7;

public class ReplaceTheSymbol {
    public static void main(String[] args){
        
        String str = "array is a data type";
        char reSym = '@';
        char symbol = 'a';
        
        for(int i  = 0; i < str.length(); i++){
            
            if(i == str.length() - 1 && str.charAt(i) == symbol ){           
                str = str.substring(0, i)  + String.valueOf(reSym);
                break;
            }
            if(str.charAt(i) == symbol){
                str = str.substring(0,i) + String.valueOf(reSym) + str.substring(i + 1);
            }               
        }
        
        System.out.println(str);
    }
    
}
