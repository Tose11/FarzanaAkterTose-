
package labassignment;
import java.util.Scanner;
public class SumOfOddSeries {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     int i,n,sum=0;
     System.out.print("Enter n: ");
     n=input.nextInt();
     for(i=1; i<=n; i+=2)
     {
      System.out.print(i+" ");
      sum = sum+i;
     }
     System.out.println();
     System.out.print("Sum of N : "+sum);
     
    }
}
