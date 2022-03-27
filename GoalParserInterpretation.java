public class GoalParserInterpretation {
    public String interpret(String command) {
        String result = "";
        
        for(int i=0;i<command.length();i++){
            if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                result += "o";
                i++;
            }else if( i+3 < command.length() && command.charAt(i) == '(' && command.charAt(i+3) == ')'){
                result += "al";
                i += 3;
            }else{
                result += command.charAt(i);
            }
        
        }
        return result;
    }
}
