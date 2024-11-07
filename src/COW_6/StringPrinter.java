package COW6;

public class StringPrinter{
    //Level 1
    public static void printOutEachChar(String word){
        for (int i = 0; i < word.length(); i++) {
            System.out.println("Char " + (i + 1) + ": " + word.charAt(i));
        }
    }

    //Level 2
    public static void printOutInReverse(String word){
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.println("Char " + (word.length() - i) + ": " + word.charAt(i));
        }
    }

    //Level 3
    public static void printTwoWords(String words){
        String[] word = words.split(" ");
        for (int w = 0; w < word.length; w++) {
            System.out.println("Word #" + (w + 1));
            for (int i = 0; i < word[w].length(); i++) {
                System.out.println("Char " + (i + 1) + ": " + word[w].charAt(i));
            }
        }
    }

    //Level 4
    public static void printOutBirthday(String birthday){
        int firstSpace = birthday.indexOf(" ");
        int comma = birthday.indexOf(",");
        System.out.println("Month: " + birthday.substring(0, firstSpace));
        System.out.println("Day: " + birthday.substring(firstSpace + 1, comma));
        System.out.println("Year: " + birthday.substring(comma + 2));
    }

    //Level 5
    public static void printOutAddress(String address){
        int spaceIndex = address.indexOf(" ");
        int comma1 = address.indexOf(",");
        int comma2 = address.lastIndexOf(",");
        int spaceZip = address.lastIndexOf(" ");
        System.out.println("Number: " + address.substring(0, spaceIndex));
        System.out.println("Street Name: " + address.substring(spaceIndex + 1, comma1));
        System.out.println("County: " + address.substring(comma1 + 2, comma2));
        System.out.println("State: " + address.substring(comma2 + 2, spaceZip));
        System.out.println("ZIP: " + address.substring(spaceZip + 1));
    }

    //Level 6
    public static void printWords(String text){

    }
}