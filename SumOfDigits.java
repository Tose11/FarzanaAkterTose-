
package labassignment;

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
     int num = input.nextInt();
     int rem,temp,sum=0;
     temp = num;
     while(temp!=0)
     {
         rem = temp%10;
         sum = sum + rem;
         temp = temp/10;
     }
     System.out.print("Sum of Digits : "+sum);
    }
}
