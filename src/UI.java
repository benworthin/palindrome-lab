import java.util.Scanner;

public class UI {

    public static void runUI() {

        displayUserQuestion();

        String userInput = readUserInput();

        outputToUser(userInput);

        repeatProgram();

    }

    public static void displayUserQuestion() {

        System.out.print("Enter a string ==>> ");

    }

    public static void outputToUser(String userInput) {

        System.out.println("Entered String:     " + userInput);
        System.out.println("Palindrome:         " + palindrome.isPal(userInput));
        System.out.println("Almost Palindrome:  " + palindrome.almostPal(userInput));

    }

    public static void repeatProgram() {

        System.out.print("Do you want to repeat this program [Y/N]? ===>> ");
        String userInput = readUserInput().toUpperCase();

        if (userInput.equals("Y"))
            runUI();
    }

    public static String readUserInput() {

        Scanner input = new Scanner(System.in);

        String userInput = input.nextLine();

        return userInput;

    }

}
