import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

       String str, reverseStr = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        str = sc.nextLine();

        int strLength = str.length();

        for (int i = strLength -1; i>=0; i--)
            reverseStr = reverseStr + str.charAt(i);

        if (str.equals(reverseStr))
            System.out.println(str + "is a palindrome");
        else
            System.out.println(str + "is not a palindrome");


    }
}
