import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        System.out.println(" => palindrome question : ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a palindrome string: ");
        String str = input.nextLine();

        int length = str.length();
        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            char startChar = str.charAt(i);
            char endChar = str.charAt(length - 1 - i);

            if (startChar != endChar) {
                isPalindrome = false;
                break;
            }


        }


        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }




    }
}




