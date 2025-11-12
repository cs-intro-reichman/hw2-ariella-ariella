//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String stringOfLetters = args[0];
            String lowerCaseLetterBank = "abcdefghijklmnopqrstuvwxyz";
            String upperCaseLetterBank = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            for (int index = 0; index < stringOfLetters.length(); index ++) {
                int indexOfLower = lowerCaseLetterBank.indexOf(stringOfLetters.charAt(index));
                if (indexOfLower == -1) {
                        break;
                } else {
                        String upperCaseChar = upperCaseLetterBank.charAt(indexOfLower);
                        stringOfLetters = stringOfLetters.substring(0, index) + upperCaseChar + stringOfLetters.substring(index +1);
                }
            }
            String anLetters = "AEFHILMNORSX";
            for (int letterIndex = 0; letterIndex < stringOfLetters.length(); letterIndex++) {
                String curLetter = stringOfLetters.charAt(letterIndex);
                if (anLetters.indexOf(curLetter) == -1) {
                        System.out.println("Give me a " + curLetter + ": " + curLetter + "!");
                } else {
                        System.out.println("Give me an " + curLetter + ": " + curLetter + "!");
                }
            }
            System.out.println("What does that spell?");
            for( int i = 0; i < Integer.parseInt(args[1]); i++) {
                System.out.println(stringOfLetters + "!!!");
            }
        }
}
