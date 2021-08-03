import java.util.ArrayList;
import java.util.List;

class Function {
    public static void main (String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("Hello world");
        wordList.add("Hello world Buddies");
        wordList.add("What is my p@5w0r^D");
        wordList.add("Hello world123 567 132");
        wordList.add("Hello world123 567 132xassa*&*097");
        wordList.add("How are you? im fine thankyouHow are you? im fine thankyou!");
        wordList.add("How are you? im fine thankyou!");
        wordList.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi");
        wordList.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisiLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quisnostrud exercitation ullamco laboris nisi");

        for (String s: wordList) {
            System.out.println(s + " - " +longestWord(s));
        }
    }

    public static String longestWord(String sen) {
        String[] words = sen.split("[^\\w]");
        String longest = "";
        for(String word : words) {
            if(word.length() > longest.length())longest = word;
        }

        return longest;
    }
}
