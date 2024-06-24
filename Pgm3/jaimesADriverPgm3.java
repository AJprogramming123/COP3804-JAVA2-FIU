public class jaimesADriverPgm3
{
    public static void main(String[] args)
    {
        jaimesASuperPgm3 question1 = new jaimesASuperPgm3();
        jaimesASubOne question2 = new jaimesASubOne();
        jaimesASubTwo question3 = new jaimesASubTwo(); 

        System.out.printf("\n");

        question1.callMethodOne(10);
	    question1.methodTwo("Hello", "World");
	    question1.methodThree();

        System.out.printf("\n");

        question2.displayMethod();
        question2.methodTwo("Banana", "Split");
        question2.methodThree();

        System.out.printf("\n");

       question3.methodTwo("Apple", "Syrup");
       question3.methodThree();

    }//end of public static void main(String[] args)

}//end of public class jaimesADriverPgm3
