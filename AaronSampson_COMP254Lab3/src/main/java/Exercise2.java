import java.util.Scanner;
public class Exercise2 {

    public static boolean palindrome(String string){

        int length = string.length();

        //If length is 0 or 1, its a pal
        if (length <= 1)
            return true;

        //Not a palidrome if initial and last characters are different
        if (string.charAt(0) != string.charAt(length-1)){
            return false;
        }

        //Remove first and last character... recur
        return palindrome(string.substring(1,length -1));

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        String input = scanner.nextLine();

        boolean result = palindrome(input);
        if (result)
            System.out.println("It is palimdrome");
        else
            System.out.println("Not palindrome");

    }
}
