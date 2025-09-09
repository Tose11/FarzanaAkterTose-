
package labassignment;

import java.util.Scanner;
public class GreatestCommonDivision {
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      int num1,num2,n1,n2,rem,gcd;
      System.out.print("Enter First Numbers : ");
      num1 = input.nextInt();
      System.out.print("Enter Second Numbers : ");
      num2 = input.nextInt();
      n1=num1;
      n2=num2;
      while(n2!=0)
      {
       rem = n1%n2;
       n1=n2;
       n2=rem;
      }
      gcd=n1;
      System.out.println("GCD : "+gcd);
    }
}
