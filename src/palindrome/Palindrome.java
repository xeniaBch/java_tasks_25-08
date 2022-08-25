package palindrome;

public class Palindrome {
//task from lesson

    public static boolean isPal(String phrase) {
        //remove spaces
       String test = phrase.replaceAll("\\s+", "");
        boolean isPal = false;
        for (int i = 0; i < test.length()/2; i++) {
            if (test.charAt(i) == test.charAt(test.length()-1-i)) {
                isPal = true;
            } else {
                isPal = false;
                break;
            }
        }
        return isPal;
    }


}