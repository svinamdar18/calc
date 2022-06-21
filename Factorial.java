package practice;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
    	
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter num to find factorial : ");
      int n = sc.nextInt();
        long factorial = 1;
        for(int i = 1; i <= n; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", n, factorial);
    }
}
