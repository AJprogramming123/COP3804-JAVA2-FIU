/*********************************************************************
 Author    : Andres Jaimes 
 Course    : COP 3804
 Professor : Michael Robinson 
 Program # : Pgm4
             { This is to show how recursion propely works, this class isn't associated to any other class and it's purpose is to give an example of a way to use recursion to solve problems like factoring }

 Due Date  : 07/16/2024

 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 

 ..........{ Andres Jaimes }..........
*********************************************************************/

public class JaimesARecursion 
{
    //This code uses recursion to achieve what a loop would do.
    public static long factorial(int n)    //The factorial method calls itself, each time with a decremented value of 'n', until it reaches base case.
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

            System.out.printf("\n\t\t  Dec\t\t\tTotal\n%d: %d! = %d * %d! = %d * %d\t\t = \t%d%n", n, n, n, n - 1, n, result / n, result);
            return result;
        }

    }//end of public static long factorial(int n)


    public static void main(String[] args)
    {
        factorial(10);

    }//end of public static void main(Stirng[] args)

}//end of public class JaimesARecursion
