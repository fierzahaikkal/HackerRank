import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner userInput = new Scanner(System.in);
        int num = userInput.nextInt();
        
        if(num % 2 == 0){
          if(num >= 2 && num <=5){
              System.out.println("Not Weird");
          }else if(num >= 6 && num <=20){
              System.out.println("Weird");
          }else if(num > 20){
              System.out.println("Not Weird");
          }
    }else{
        System.out.println("Weird");
    }
}
}
