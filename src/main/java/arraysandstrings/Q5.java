package arraysandstrings;

/**
 * Created by suchintan on 2015-03-19.
 */
public class Q5 {
    //Implement a method to perform basic string compression using the counts of repeated characters.
    //For example, 'aabcccccaaa' would become 'a2b1c5a3'. If the compressed string is not smaller than the original,
    //return the original.

    public static void main(String[] args) {
        String a = "aabcccccaaa";
        String b = "abcdefgh";
        String c = "aabbccdd";
        String d = "aaaabcccd";
        String e = "";

        System.out.println(compress(a));
        System.out.println(compress(b));
        System.out.println(compress(c));
        System.out.println(compress(d));
        System.out.println(compress(e));

    }

    private static String compress(String in) {
        String out = "";

        char prev = '~'; //doesn't matter, first iteration is handled uniquely
        int count = 0;
        for(int c = 0; c < in.length(); c++){
            if(c == 0 || prev != in.charAt(c)){
                if(count > 0){
                    out += count;
                }
                prev = in.charAt(c);
                out += in.charAt(c);
                count = 0;
            }
            count++;
        }

        out += count; //hack

        return out.length() < in.length() ? out : in;
    }
}
