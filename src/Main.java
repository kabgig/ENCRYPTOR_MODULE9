import java.util.Scanner;
//REFACTOR AND ADD DATE AND TIME
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//Preparing key
        String keyWord = "B2FutfZ3qHxhX9JJWZa0eUyqiGWJsIwL6FWmV32ggEFaJnBteoYZCYYWvxGHS929";
        char[] key = new char[keyWord.length()];
        for (int i = 0; i < keyWord.length(); i++) {
            key[i] = keyWord.charAt(i);
        }
//Encrypt or Decrypt
        System.out.println("1 - Encrypt");
        System.out.println("2 - Decrypt");
        String command = s.nextLine();
//Getting source word for encryption / decryption
        String srcWord = "";
        System.out.print("Input: ");
        srcWord = s.nextLine();
        StringBuilder bldr = new StringBuilder(srcWord);
//Encrypting/Decrypting
        var res = Encrypt.encryption
                (bldr, key, srcWord, command);
        System.out.println(res);


    }
}
