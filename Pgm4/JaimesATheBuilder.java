/*********************************************************************
 Author    : Andres Jaimes 
 Course    : COP 3804
 Professor : Michael Robinson 
 Program # : Pgm4
             { This is to show how a subclass class can become a superclass and be inherited by another class, this example inherits subclass 2 which means it has the same inheritances from the Super-class PolySuper and 
               if sub2 had any new methods then it will inherit that too}

 Due Date  : 07/16/2024

 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 

 ..........{ Andres Jaimes }..........
*********************************************************************/

public class JaimesATheBuilder extends sub2 {
    public void builder()
    {
        System.out.printf("I am TheBuilder\n");

    }//end of public void builder()

}//end of public class JaimesATheBuilder extends sub2
