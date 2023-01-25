import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Preparing key
        String keyWord = "B2FutfZ3qHxhX9JJWZa0eUyqiGWJsIwL6FWmV32ggEFaJnBteoYZCYYWvxGHS929";
        char[] key = new char[keyWord.length()];
        for (int i = 0; i < keyWord.length(); i++) {
            key [i] = keyWord.charAt(i);
        }



        //Getting source word for encryption
        Scanner s = new Scanner(System.in);
        System.out.print("Input: ");
        String srcWord = s.next();

        int count = 0;
        StringBuilder bldr = new StringBuilder(srcWord);

        for (int i = 0; i < srcWord.length() ; i++) {
            if (count == key.length) count = 0;

            int a = srcWord.charAt(i);
            char

            bldr.setCharAt(i+a, key[count++]);
        }


    }
}