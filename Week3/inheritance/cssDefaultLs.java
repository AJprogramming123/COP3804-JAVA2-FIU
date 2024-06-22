import java.util.Scanner;

//THIS IS THE SUPER-CLASS

public class cssDefaultLs
{
    
    private static void superClass()
    {
        System.out.printf("\t***I am the Super Class***");
    	
   
    }//private static void superClass()


    public void fontCSS()
    {
        //call the superClass() method
        superClass();
	String fontType = "Times Roman"; //create data fields
	String fontSize = "12";		 //create data fields

  
        System.out.printf("\tFont Type = %s\n" + fontType);
	System.out.printf("\tFont Size = %s\n" + fontSize);
    
    }//end public static void fontCSS()


    //This method allows us to pause the program at any time
    public static void pause()
    {
        //creates object to read the keyboard
	Scanner kb = new Scanner(System.in);

	System.out.printf("\n\t\t\tNice to see you again,\tpress any key to continue -> ");

	kb.nextLine(); //this command waits for keyboard input

    }//public static void pause()

}//end public class cssDefaults


