/*********************************************************************
 Author    : Andres Jaimes 
 Course    : COP 3804
 Professor : Michael Robinson 
 Program # : Pgm4
             { This is the driver of the class, meaning every sub class or inherited sub-class will be called from here. I'm using certain ways to include private methods to show I implemented them}

 Due Date  : 07/16/2024

 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 

 ..........{ Andres Jaimes }..........
*********************************************************************/

public class JaimesATheDriverPgm4 
{
    public static void main(String[] args)
    {
        JaimesASuperPgm4 superobject = new JaimesASuperPgm4();
        superobject.callMethod1(5);    //Reason why i'm using this method is to call the private method1 to prove its not inheritable.
        superobject.method2("Apple", "Banana");
        superobject.method3();

        System.out.printf("\n");

        sub1 SUB = new sub1();
        SUB.method2("Monkey", "Gorilla");
        SUB.method3();

        System.out.printf("\n");

        sub2 SUB2 = new sub2();
        SUB2.method2("Chocolate", "Strawberry");
        SUB2.method3();

        System.out.printf("\n");

        sub3 SUB3 = new sub3();
        SUB3.method2("Up", "Down");
        SUB3.method3();

        System.out.printf("\n");

        JaimesATheBuilder builder = new JaimesATheBuilder();
        builder.method2("Florida", "Kentucky");
        builder.method3();
        builder.builder();

        System.out.printf("\n");

        JaimesAOverLoader overload = new JaimesAOverLoader();
        overload.method2();
        overload.method3();

    }//end of public static void main(String[] args)

}//end of public class JaimesATheDriverPgm4
