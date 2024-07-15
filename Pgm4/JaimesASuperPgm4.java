package Pgm4;

public class JaimesASuperPgm4
{
    private void method1(int parameter)
    {
        System.out.printf("This is the int value received\t: %d\n", parameter);

    }


    public void callMethod1(int parameter)
    {
        method1(parameter);    //Not specified to use in the rubric but I wanted to show that this private method was created to not be inherited to other classes.
    }


    public void method2(String parameter1, String parameter2)
    {
        System.out.printf("\nFirst String: %s\tSecond String: %s\n", parameter1, parameter2);
        System.out.printf("I am super method2\n");
    }


    public void method3()
    {
        System.out.printf("I am super method3\n");
    }

}






