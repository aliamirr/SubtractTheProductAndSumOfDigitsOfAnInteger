

import java.util.Scanner;

public class SubtractProductAndSum {

        public static int subtractProductAndSum(int n)
        {
            int sum = 0 ;
            int product = 1;

            while (n > 0)
            {
                sum += n % 10;
                product *= n % 10;
                n /= 10;


            }
            int Result = product - sum;
            return Result;
        }

    public static void main(String[] args) {
        int N;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        N = inp.nextInt();

        System.out.println("The difference of the product and sum of the number is: " + (subtractProductAndSum(N)));
    }
}