import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        String str;
        String reverseStr = "";

        System.out.println("Entre a String:");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();


        for (int i = str.length() -1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);

        }

        System.out.println("Reversed string is:" + reverseStr);

    }
}
