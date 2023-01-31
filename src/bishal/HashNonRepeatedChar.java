package bishal;

import java.util.HashMap;
import java.util.*;

public class HashNonRepeatedChar {
    private String string;
    private Map<Character,Integer> hash = new HashMap<>();
    public HashNonRepeatedChar(String string){
        this.string = string.toLowerCase();
    }
    public char findNonRepeated(){
        for(char ch:string.toCharArray()){
           int count = hash.containsKey(ch) ? hash.get(ch) : 0;
           hash.put(ch,count+1);
        }
        for(var ch:string.toCharArray()){
            if(hash.get(ch)==1) return ch;
        }
        return Character.MIN_VALUE;
    }
}
