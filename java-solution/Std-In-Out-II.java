import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner userInput = new Scanner(System.in);
        int num2 = userInput.nextInt();
        double num1 = userInput.nextDouble();
        userInput.nextLine();
        String word = userInput.nextLine();
        
        
        System.out.println("String: " + word);
        System.out.println("Double: " + num1);
        System.out.println("Int: " + num2);
    }
}
