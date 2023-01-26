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
        // взять Hex код символа ключа
        //прибавить первую цифру к HEX коду символа слова
        //получили новый код буквы
        //обратно так же берем первую цифру hex кода ключа и вычитаем из зашифрованного символа hex кода
        //получается hex код слова
        int count = 0;
        StringBuilder bldr = new StringBuilder(srcWord);

        for (int i = 0; i < srcWord.length() ; i++) {
            if (count == key.length) count = 0;
            int a = srcWord.charAt(i);
            int b = key[i];

            bldr.setCharAt(i+a, key[count++]);
        }


    }
}