public class palindrome {

    public static boolean isPal(String userInput) {

        for(int i = 0; i < userInput.length(); i++) {

            if (userInput.charAt(i) != userInput.charAt(userInput.length() - 1 - i))
                return false;
        }

        return true;

    }

    private static String purge(String userInput) {


        userInput = userInput.replaceAll("[^a-zA-Z0-9]","" );
        return userInput;

    }

    public static boolean almostPal(String userInput) {


        String purgedUserInput = purge(userInput);
        return isPal(purgedUserInput);

    }

}