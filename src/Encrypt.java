public class Encrypt {
    public static StringBuilder encryption(
            StringBuilder bldr,
            char[] key,
            String srcWord,
            int count,
            String command) {
        for (int i = 0; i < srcWord.length(); i++) {
            if (count == key.length) count = 0;
            int wordSymbol = srcWord.charAt(i); //hex code of word symbol
            int keySymbol = key[i]; //hex code of key symbol
            int shiftDigit = String.valueOf(keySymbol).charAt(0) - '0'; //taking 1st digit from KeySymbol Hex code
            //making new symbol
            int newSymbolHex=0;
            if (command.equals("1"))
                newSymbolHex = wordSymbol + shiftDigit;
            if (command.equals("2"))
                newSymbolHex = wordSymbol - shiftDigit;
            bldr.setCharAt(i, (char) newSymbolHex); //replacing char in word
            count++;
        }
        return bldr;
    }
}
