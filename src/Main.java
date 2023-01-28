import java.text.SimpleDateFormat;
import java.util.Calendar;
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

//Preparing date
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "HH:mm:ss dd:MMM:yyyy");
        String date = dateFormat.format(calendar.getTime());
        System.out.println(date);

//Encrypt or Decrypt
        System.out.println("1 - Encrypt");
        System.out.println("2 - Decrypt");
        String command = s.nextLine();

//Getting source word for encryption / decryption
        String srcWord = "";
        System.out.print("Input: ");

//Add time or not
        srcWord = (command.equals("1"))
                ? s.nextLine() + " " + date : s.nextLine();
        StringBuilder bldr = new StringBuilder(srcWord);

//Encrypting/Decrypting
        var res = Encrypt.encryption
                (bldr, key, srcWord, command);
        System.out.println(res);


    }
}
