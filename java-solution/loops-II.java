import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner userInput = new Scanner(System.in);
        int q=userInput.nextInt();
        
        for(int i=0;i<q;i++){
            int a = userInput.nextInt();
            int b = userInput.nextInt();
            int n = userInput.nextInt();
            
            for(int j = 0; j < n; j++){
                a = a + (int)Math.pow(2,j)*b;
                System.out.print(a + " ");
            }
            System.out.println("");
        }
    }
}
