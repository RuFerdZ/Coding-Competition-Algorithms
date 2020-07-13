package Day_02;

import java.util.HashMap;

public class Atbash_cipher {
    public static void main(String[] args) {
        HashMap<String,String> dict = new HashMap();

        dict.put("A","Z");
        dict.put("A","Z");
        dict.put("A","Z");
        dict.put("A","Z");
        dict.put("A","Z");

        // written in python

        /*

        lookup_table = {'A': 'Z', 'B': 'Y', 'C': 'X', 'D': 'W', 'E': 'V',
                'F': 'U', 'G': 'T', 'H': 'S', 'I': 'R', 'J': 'Q',
                'K': 'P', 'L': 'O', 'M': 'N', 'N': 'M', 'O': 'L',
                'P': 'K', 'Q': 'J', 'R': 'I', 'S': 'H', 'T': 'G',
                'U': 'F', 'V': 'E', 'W': 'D', 'X': 'C', 'Y': 'B', 'Z': 'A'}

        def atbash(message):
            cipher = ''
            for letter in message:
                if (letter != ' '):
                    cipher += lookup_table[letter]
                else:
                    cipher += ' '
            return cipher

        message = input()
        cipher = atbash(message.upper())
        print(cipher)
        print(atbash(cipher))


         */


    }
}
