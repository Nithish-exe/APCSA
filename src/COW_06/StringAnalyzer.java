package COW6;

public class StringAnalyzer{
    //Level 1
    public static int countSentences(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '.' || c == '?' || c == '!') count++;
        }
        return count;
    }

    //Level 2
    public static int countVowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if ("aeiouAEIOU".indexOf(c) >= 0) count++;
        }
        return count;
    }

    //Level 3
    public static int countConsonants(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if ("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".indexOf(c) >= 0) count++;
        }
        return count;
    }

    //Level 4
    public static int countOccurences(String text, String word) {
        int count = 0;
        String lowerText = text.toLowerCase();
        String lowerWord = word.toLowerCase();
        for (int i = 0; i <= lowerText.length() - lowerWord.length(); i++) {
            if (lowerText.substring(i, i + lowerWord.length()).equals(lowerWord)) {
                count++;
            }
        }
        return count;
    }

    //Level 5
    public static int countTotalOccurance(String text, String[] searchTerms) {
        int count = 0;
        for (String term : searchTerms) {
            count += countOccurences(text, term);
        }
        return count;
    }
    
    //Level 6
    public static String[] findWords(String text, String[] searchTerms){
        return new String[0];
    }
}