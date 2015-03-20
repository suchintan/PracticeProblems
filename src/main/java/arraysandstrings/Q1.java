package arraysandstrings;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by suchintan on 2015-03-19.
 */
public class Q1 {
    //Implement a method to determine if a string has all unique characters. What if you cannot use additional
    //data structures?
    public static boolean unique(String in){
        Set<Character> s = new HashSet<Character>();

        for(char c : in.toCharArray()){
            if(s.contains(c)){
                return false;
            }

            s.add(c);
        }


        return true;
    }

    public static void main(String[] args) {
        String unique = "abcdefghijklmnopqrstuvwxyz";
        String repeat = "asdbjskdasdadlsfdjfaslfkj";

        System.out.println(unique(unique));
    }

}
