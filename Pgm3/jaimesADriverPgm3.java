public class jaimesADriverPgm3.java
{
    public static void main(String[] args)
    {
        jaimesASuperPgm3 question1 = new jaimesASuperPgm3();
        jaimesASubOne question2 = new jaimesASubOne();
        jaimesASubTwo question3 = new jaimesASubTwo(); 


        question1.methodOne(10);
	question1.methodTwo("Hello", "World");
	question1.methodThree();


        question2.displayMethod();
        question2.methodTwo("Banana", "Split");
        question2.methodThree();


       question3.methodTwo("Apple", "Syrup");
       question3.methodThree();

    }

}
