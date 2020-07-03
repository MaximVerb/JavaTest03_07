package oefstrings;

public class StringsParameters {
    public static String spoon = "Lepel";
    public static String website = "http://www.smartdeveloper.be";
    public static String aSentence = "De mooie zeeman nam Anna mee zei Ed";

    public StringsParameters() {
    }

    static boolean isPalindroom (String aString) {
        char[] charArray = aString.toLowerCase().toCharArray();
        char[] secondCharArr = new char[aString.length()];
        for (int i = aString.length()-1, j = 0; i >= 0; i--, j++) {
            secondCharArr[i] = charArray[j];
        }
        String turnAround = new String(secondCharArr);
        return turnAround.equals(aString.toLowerCase());
    }


    static boolean isPhrasePalindrome (String aString) {
        char[] charArray = aString.toLowerCase().toCharArray();
        char[] secondCharArr = new char[aString.length()];
        for (int i = aString.length()-1, j = 0; i >= 0; i--, j++) {
            secondCharArr[i] = charArray[j];
        }
        String turnAround = new String(secondCharArr);
        return turnAround.equals(aString.toLowerCase());
    }

    static boolean isUrl (String aString) {
        String url = "http://";
        for(int i = 0 ; i < url.length(); i++) {
            if (aString.charAt(i) == url.charAt(i)) {
                continue;
            } else if (aString.charAt(i) != url.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    static int isVowel (String aString) {
        int count = 0;
        char[] vowels = {'a','e','u','i','o','j','x','y'};
        char[] allStringChar = aString.toCharArray();
        for(int i = 0; i < vowels.length; i++) {
            for (int j = 0; j < allStringChar.length; j++) {
                if (allStringChar[j] == vowels[i]) {
                    count++;
                }
            }
        }
        return count;
    }
}
