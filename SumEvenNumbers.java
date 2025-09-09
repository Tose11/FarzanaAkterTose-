
package labassignment;

import java.util.Scanner;
public class SumEvenNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int sum = 0;
        for(int i=2; i<=n; i+=2)
        {
            sum += i;   
        }
        System.out.println("Sum of all Even Numbers : "+sum);


    }
}

