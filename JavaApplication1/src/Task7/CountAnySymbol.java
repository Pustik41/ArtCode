package Task7;


public class CountAnySymbol {
    public static void main(String[] args){
        String str = "Посчитать колличество искомого символа в строке (искомый символ может быть разным)";
        char symbol = 'а';
        int count = 0;
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == symbol){
                count++;
            }
        }
        
        System.out.println("Строка: " + str);
        System.out.println("Искомый символ - '" + symbol  + "'");
        System.out.println("Количесво упоминаний символа в строке = " + count);
    }
}
