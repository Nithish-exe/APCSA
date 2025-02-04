package COW6;

public class StringBuilder
{
    //Level 1
    public String combineWords(String word1, String word2, String word3) {
        return word1 + " " + word2 + " " + word3;
    }
    //Level 2
    public String combineNumTimes(String word, int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result += word;
        }
        return result;
    }

    public String combineWordsInOrder(String word1, String word2) {
        return (word1.compareTo(word2) <= 0) ? word1 + " " + word2 : word2 + " " + word1;
    }
    //Level 3
    public String combineWordsInOrder(String word1, String word2, String word3) {
        String[] words = {word1, word2, word3};
        java.util.Arrays.sort(words);
        return words[0] + " " + words[1] + " " + words[2];
    }

    public String hideText(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if ("aeiouAEIOU".indexOf(c) >= 0) result += "O";
            else if (c == ' ') result += "+";
            else result += "X";
        }
        return result;
    }
    //Level 4
    public String reverseWord(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    public String getStartingLetters(String text) {
        String result = "";
        result += text.charAt(0); // First letter
        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i - 1) == ' ') {
                result += text.charAt(i);
            }
        }
        return result;
    }
    //Level 5
    public String elongateWord(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if ("aeiouAEIOU".indexOf(c) >= 0) {
                int repeat;
                if (i > 0 && "aeiouAEIOU".indexOf(word.charAt(i - 1)) >= 0) {
                    repeat = 3;
                } else {
                    repeat = 4;
                }
                result += String.valueOf(c).repeat(repeat);
            } else if (i != 0 && i != word.length() - 1) {
                result += c + "" + c;
            } else {
                result += c;
            }
        }
        return result;
    }
    
    //Level 6
    public static String repeatedAndReverse(String word, int n){
        return "";
    }
}
