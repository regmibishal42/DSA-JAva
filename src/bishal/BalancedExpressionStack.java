package bishal;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
public class BalancedExpressionStack {

    private final List<Character> leftBrackets = Arrays.asList('(','<','{','[');
    private final List<Character> rightBrackets = Arrays.asList(')','>','}',']');

    //)1+2) --false
    // (1+2*3) --true
    // (1+2*3>) --false
    public boolean checkExpression(String expression){
        Stack<Character> stack = new Stack<>();
        for(char ch:expression.toCharArray()){
            if(isLeftBracket(ch))
                stack.push(ch);
            if(isRightBracket(ch)){
                if(stack.empty()) return false;
                char top = stack.pop();
                if(bracketsMatch(top,ch)) return false;
            }

        }
        return stack.empty();
    }
    private boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }
    private boolean isRightBracket(char ch){
         return rightBrackets.contains(ch);
    }
    private boolean bracketsMatch(char left,char right){
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
//        return  (right == ')' && left != '(') ||
//                (right == '[' && left != ']') ||
//                (right == '{' && left != '}') ||
//                (right == '<' && left != '>') ;

    }



}
