package Pgm4;

public class JaimesARecursion {
    //This code uses recursion to achieve what a loop would do.

    public static long factorial(int n) //The factorial method calls itself, each time with a decremented value of 'n', until it reaches base case.
    {
        System.out.printf("Calling step %d\n", n);

        if(n <= 1) //base case
        {
            System.out.printf("You have Reached base case, Returning step: \n\n");
        
            return 1;
        }
        else
        {
            long result = n * factorial(n - 1);

            System.out.printf("Returning step -> %d: %d! = %d * %d! = %d * %d = %d%n", n, n, n, n - 1, n, result / n, result);
            return result;
        }

        
    }


    public static void main(String[] args)
    {
        factorial(10);
    }

}
