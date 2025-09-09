
package labassignment;
import java.util.Scanner;
public class ReverseOfNumbers {
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
     System.out.println("Reverse number : "+sum);
    }
    
}
