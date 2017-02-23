import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class wordbreak {
    public static void firstRepeatingLetter(String str)
        {
        Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
        if(str==null) System.out.println("No String found");
        char[] chars = str.toCharArray();
        for(Character ch:chars){
            if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        for(Character ch:keys){
            if(dupMap.get(ch) > 1){
                System.out.println(ch);
                break;
            }
        }

    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        firstRepeatingLetter(s);
        
    }
}