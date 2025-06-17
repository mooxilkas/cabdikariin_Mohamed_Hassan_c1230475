import java.util.Scanner;
import java.util.Random;
public class passwordGenerator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Random random = new Random();

            String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String smallLetters = "abcdefghijklmnopqrstuvwxyz";
            String numbers = "0123456789";
            String symbols = "!@#$%^&*";

            String all = capitalLetters + smallLetters + numbers + symbols;

            System.out.print("Enter password length: ");
            int length = input.nextInt();

            String password = "";

            // Add at least 1 of each type
            password += capitalLetters.charAt(random.nextInt(capitalLetters.length()));
            password += smallLetters.charAt(random.nextInt(smallLetters.length()));
            password += numbers.charAt(random.nextInt(numbers.length()));
            password += symbols.charAt(random.nextInt(symbols.length()));

            // Add random characters to reach desired length
            for (int i = 4; i < length; i++) {
                int index = random.nextInt(all.length());
                password += all.charAt(index);
            }

            System.out.println("Your password is: " + password);
        }
    }

