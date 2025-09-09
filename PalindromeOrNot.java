
package labassignment;

import java.util.Scanner;
public class PalindromeOrNot {
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
     int num = input.nextInt();
     int temp,rem,sum=0;
     temp = num;
     while(temp!=0)
     {
        rem = temp%10;
        sum = sum*10 + rem;
        temp = temp /10;
     }
     if(sum == num)
     {
         System.out.println("Palindrome Number");
     }
     else{
        System.out.println("Not Palindrome");
     }
    }
     
    
}
