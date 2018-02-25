public class palindrome {

    public static boolean isPal(String userInput) {

        for(int i = 0; i < userInput.length(); i++) {

            if (userInput.charAt(i) != userInput.charAt(userInput.length() - 1 - i))
                return false;
        }

        return true;

    }

    /*
     * Precondition:  s is a String of one character.
     * Postcondition: The value of true is returned if s is a letter and false otherwise.
     * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
    private static boolean isLetter(String letter)
    {
        return true;      // This statement is provided to allow initial compiling.
    }

    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: All non-letter characters are removed from s, and this "purged" String is returned.
     * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
    private static String purge(String s)
    {
        return "";        // This statement is provided to allow initial compiling.
    }

    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: After purging all non-letter characters from s,
     *                the value of true is returned if the resulting String is a Palindrome, false otherwise.
     * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
    public static boolean almostPal(String s)
    {
        return true;      // This statement is provided to allow initial compiling.
    }

}