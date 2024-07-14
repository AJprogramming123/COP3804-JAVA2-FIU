package Week4.Recursion;
//Recursion is basically just a method calling in itself.

public class RecursionisCool {
    
    public static void main(String[] args)
    {
        sayHi(5);
        System.out.println();
        countBackwards(14);

    }

    //The only other rule with recursion is it needs to know when to stop.

    public static void sayHi(int n)
    {
        if(n == 0)
        {
            System.out.printf("Done!\n");
        }else   //Need a base case
        {
            System.out.printf("hi\n");
            n--;
            sayHi(n);   //This sayHi is the exact same as the sayHi in the main method
        }   
    
    }


    public static void countBackwards(int n)
    {
        if(n == 0)
        {
            System.out.printf("Done!\n");
        }else
        {
            System.out.printf("%d\n", n);
            n--;
            countBackwards(n);
        }
    }
}

