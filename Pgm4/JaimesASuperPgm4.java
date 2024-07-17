/*********************************************************************
 Author    : Andres Jaimes 
 Course    : COP 3804
 Professor : Michael Robinson 
 Program # : Pgm4
             { This is the original super-class for this project, it has 3 subclasses that end of being super-classes in themselves. callMethod1 has to be private because it can't be inherited to other classes }

 Due Date  : 07/16/2024

 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 

 ..........{ Andres Jaimes }..........
*********************************************************************/

public class JaimesASuperPgm4
{
    private void method1(int parameter)
    {
        System.out.printf("This is the int value received\t: %d\n", parameter);

    }//end of private void method1(int parameter)


    public void callMethod1(int parameter)
    {
        method1(parameter);    //Not specified to use in the rubric but I wanted to show that this private method was created to not be inherited to other classes.

    }//end of public void callMethod1(int parameter)


    public void method2(String parameter1, String parameter2)
    {
        System.out.printf("\nFirst String: %s\tSecond String: %s\n", parameter1, parameter2);
        System.out.printf("I am super method2\n");

    }//end of public void method2(String parameter1, Stirng parameter2)


    public void method3()
    {
        System.out.printf("I am super method3\n");
    }//end of public void method3()

}//end of public class JaimesASuperPgm4
