package bishal;
import java.util.*;

public class HashFirstRepeatChar {
    private char[] charArray;
    private Map<Character,Integer> map = new HashMap<>();

    public HashFirstRepeatChar(String string){
       // charArray = new char[string.length()];
        charArray = string.toLowerCase().toCharArray();
    }

    public char findFirstRepeatedChar(){
        //creating map from char array
        for(char ch:charArray){
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch,count+1);
        }

        //finding first repeated char
        for(char ch:charArray)
            if(map.get(ch)>1) return ch;


        return Character.MIN_VALUE;
    }
    //second soliution using set
    public char FindFirstRepeatedUsingSet(){
        Set<Character> set = new HashSet<>();
        for(char ch:charArray){
            if(set.contains(ch)) return ch;
            set.add(ch);
        }

        return Character.MIN_VALUE;
    }
    public void print(){
        System.out.println(charArray);
    }

}
