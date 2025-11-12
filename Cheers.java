//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String originalStringOfLetters = args[0];
            String lowerCaseLetterBank = "abcdefghijklmnopqrstuvwxyz";
            String upperCaseLetterBank = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String stringOfLetters = "";
            for (int index = 0; index < originalStringOfLetters.length(); index ++) {
                int indexOfLower = lowerCaseLetterBank.indexOf(originalStringOfLetters.charAt(index));
                if (indexOfLower != -1) {
                        char upperCaseChar = upperCaseLetterBank.charAt(indexOfLower);
                        stringOfLetters = stringOfLetters.substring(0, index);
                        stringOfLetters = stringOfLetters + upperCaseChar;
                } else {
                        stringOfLetters = stringOfLetters.substring(0, index);
                        stringOfLetters = stringOfLetters + originalStringOfLetters.charAt(index);
                }
            }
            String anLetters = "AEFHILMNORSX";
            for (int letterIndex = 0; letterIndex < stringOfLetters.length(); letterIndex++) {
                char curLetter = stringOfLetters.charAt(letterIndex);
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
