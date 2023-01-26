import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Preparing key
        String keyWord = "B2FutfZ3qHxhX9JJWZa0eUyqiGWJsIwL6FWmV32ggEFaJnBteoYZCYYWvxGHS929";
        char[] key = new char[keyWord.length()];
        for (int i = 0; i < keyWord.length(); i++) {
            key[i] = keyWord.charAt(i);
        }

        Scanner s = new Scanner(System.in);
        //Encrypt or Decrypt
        System.out.println("1 - Encrypt");
        System.out.println("2 - Decrypt");
        String command = s.next();

        //Getting source word for encryption
        String srcWord = "";
        System.out.print("Input: ");
        while (s.hasNext()){
            srcWord = srcWord + " " + s.next();
        }
        srcWord.trim();
        System.out.println(srcWord);

        int count = 0;
        StringBuilder bldr = new StringBuilder(srcWord);

        if (command.equals("1")) {
            var res =
                    Encrypt.encryption
                            (bldr, key, srcWord, count,command);
            System.out.println(res);
        }

    }
}
