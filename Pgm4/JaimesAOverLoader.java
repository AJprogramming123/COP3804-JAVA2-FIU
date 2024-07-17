/*********************************************************************
 Author    : Andres Jaimes 
 Course    : COP 3804
 Professor : Michael Robinson 
 Program # : Pgm4
             { Just to show how overloading Super-classes. In this example the subclass "sub2" becomes a superclass because I used it to inherit itself with JaimesAOverLoader }

 Due Date  : 07/16/2024

 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 

 ..........{ Andres Jaimes }..........
*********************************************************************/

public class JaimesAOverLoader extends sub2
{
    public void method2()
    {
        System.out.printf("\nHello I am the overloader\n");
    }//end of public void method2()

}//end of public class JaimesAOverLoader extends sub2
