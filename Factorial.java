package practice;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
    	
     
      int n=10;
        long factorial = 1;
        for(int i = 1; i <= n; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", n, factorial);
    }
}
