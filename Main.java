import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userInput = 0;
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter a number: ");
            userInput = keyboard.nextInt();

            for (int i = userInput; i >= 0; i--) {
                System.out.print(i + " ");
            }
            choice = keyboard.nextLine();
            System.out.println("Continue? (y/n)");
            choice = keyboard.nextLine();
        }
        System.out.println("Good bye!");
    }
}