public class IntegerToRoman {
   
            private Numerals[] nu = {  
            new Numerals("M", 1000),
            new Numerals("CM", 900),
            new Numerals("D", 500),
            new Numerals("CD", 400),
            new Numerals("C", 100),
            new Numerals("XC", 90),
            new Numerals("L", 50),
            new Numerals("XL", 40),    
            new Numerals("X", 10),   
            new Numerals("IX", 9),    
            new Numerals("V", 5),     
            new Numerals("IV", 4),   
            new Numerals("I", 1)    
        };

    public String intToRoman(int num) {

    String result = "";
        for(Numerals numeral:nu){
            int number_of_symb = num / numeral.value;
            if(number_of_symb != 0){
            result += numeral.symbol.repeat(number_of_symb);
                num %= numeral.value;
            }
        }
        return result;       
    }
    class Numerals {
        public String symbol;
        public int value;
        public Numerals(String symbol, int value){
            this.symbol = symbol;
            this.value = value;
        }
        
        
        
        
        
    }
  
}
