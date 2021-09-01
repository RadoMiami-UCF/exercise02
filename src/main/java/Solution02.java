import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args)
    {
        /*Ask what's the input string
        Store said input string
        Find length of input string
        Say input string and letters*/
        Scanner in = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String iString = in.nextLine();
        System.out.println(iString + " has " + iString.length() + " characters");

    }
}
