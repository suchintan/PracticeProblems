package arraysandstrings;

/**
 * Created by suchintan on 2015-03-19.
 */
public class Q2 {
    //Implement a function reverse(char* str) in c++ which reverses a null terminated string

    public static String reverse(String in){
        StringBuilder reverse = new StringBuilder("");
        for(char c = 0; c < in.length(); c++){
            reverse.append(in.charAt(in.length()-c-1));
        }

        return reverse.toString();
    }

    public static void main(String[] args) {
        String s = "I like poop";
        System.out.println(reverse(s));
    }
}
