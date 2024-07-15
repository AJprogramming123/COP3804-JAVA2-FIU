package Pgm4;

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

    }
}
