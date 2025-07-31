import java.util.Scanner;

public class PasswordPrompt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String correctPassword = "java123";
        String enteredPassword;

        do {
            System.out.print("Enter password: ");
            enteredPassword = input.nextLine();

            if (!enteredPassword.equals(correctPassword)) {
                System.out.println("Incorrect password. Try again.");
            }

        } while (!enteredPassword.equals(correctPassword));

        System.out.println("Access granted!");
    }
}
