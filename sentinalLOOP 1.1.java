import java.util.Scanner;
public class sentinalLOOP {
    // question 3 sentinel loop

    //explain all string functions in java

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to add to the sum.");
        System.out.println("Enter 'n' to stop the program.");
        System.out.println("or enter string");

        while (true) {
            System.out.print("Enter input: ");
            String userInput = input.nextLine();

            if (userInput.equalsIgnoreCase("n")) {
                System.out.println("Exiting.");
                break;
            }

            if (isInteger(userInput)) {
                int number = Integer.parseInt(userInput);
                sum += number;
                System.out.println("Current sum: " + sum);
            } else {
                for (int i = 0; i < 2; i++) {
                    System.out.println(userInput);
                }
            }
        }

        System.out.println("Final sum: " + sum);
    }

    public static boolean isInteger(String str) {
        if (str == null || str.isEmpty()) return false;
        int start = 0;
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            if (str.length() == 1) return false;
            start = 1;
        }
        for (int i = start; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}