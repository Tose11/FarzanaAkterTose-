
package labassignment;

import java.util.Scanner;
public class SumOfSeries {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     int i,n,sum=0;
     System.out.print("Enter n: ");
     n=input.nextInt();
     for(i=1; i<=n; i++)
     {
      System.out.print(i+" ");
      sum = sum+i;
     }
     System.out.println();
     System.out.print("Sum of N : "+sum);
     
    }
}
