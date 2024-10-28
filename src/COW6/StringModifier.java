package COW6;

public class StringModifier{
    //Level 1
    public String turnIntoAllCaps(String text) {
        return text.toUpperCase();
    }

    public String exclaimWord(String word) {
        return word + "!";
    }

    //Level 2
    public String twistWord(String word) {
        int mid = word.length() / 2;
        return word.substring(mid) + word.substring(0, mid);
    }

    //Level 3
    public String respondToAction(String text) {
        int madeIndex = text.indexOf(" made ");
        String noun = text.substring(0, madeIndex);
        String action = text.substring(madeIndex + 6);
        return action + " was created by " + noun;
    }

    //Level 4
    public String makeMoreDramatic(String text) {
        int likeIndex = text.indexOf("like");
        int dislikeIndex = text.indexOf("dislike");
        if (dislikeIndex != -1) {
            String subject = text.substring(dislikeIndex + 8, text.length());
            return "Do you really dislike " + subject + ", or do you hate " + subject + "?";
        } else if (likeIndex != -1) {
            String subject = text.substring(likeIndex + 5, text.length());
            return "Do you really like " + subject + ", or do you love " + subject + "?";
        }
        return text;
    }

    //Level 5
    public String convertPhoneNumber(String phoneNumber) {
        String digitsOnly = phoneNumber.replaceAll("[^0-9]", "");
        if (digitsOnly.length() == 11 && digitsOnly.startsWith("1")) {
            return digitsOnly.substring(1);
        }
        return digitsOnly;
    }

    public String pigLatinateWord(String word) {
        if ("aeiouAEIOU".indexOf(word.charAt(0)) >= 0) {
            return word + "ohay";
        } else {
            int firstVowel = -1;
            for (int i = 0; i < word.length(); i++) {
                if ("aeiouAEIOU".indexOf(word.charAt(i)) >= 0) {
                    firstVowel = i;
                    break;
                }
            }
            if (firstVowel != -1) {
                return word.substring(firstVowel) + word.substring(0, firstVowel) + "ay";
            } else {
                return word;
            }
        }
    }
    
    //Level 6
    public static String pigLatinateText(String text){
        return "";
    }
    
    public static String staggerCapitals(String text){
        return "";
    }
    
}