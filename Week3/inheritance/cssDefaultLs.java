import java.util.Scanner;


//THIS IS THE SUPER-CLASS
public class cssDefaultLs
{

    private static void superClass()
    {
        System.out.println( "\t***I am the Super Class***" );
    }//private static void superClass()
	
    
    public void fontCSS()
    {
        //call the superClass() method
        superClass();  
        String fontType = "Times Roman"; //create data fields
        String fontSize = "12";          //create data fields  
    	
        System.out.println( "\tFont Type = " + fontType );
        System.out.println( "\tFont Size = " + fontSize );

    }//end public static void fontCSS()

    
    public void colorCSS()
    {
        //call the superClass() method
        superClass();    	
        String foreGoundColor = "black"; //create data fields
        String backGoundColor = "white"; //create data fields
         
        System.out.println( "\tForeground Color = " +
                             foreGoundColor );
         
        System.out.println( "\tBackground Color = " +
                             backGoundColor );
           
    }//end public static void colorCSS()
       
        
    //This method allows us to pause the program at any time  
    public static void pause()
    {
        //creates object to read the keyboard
        Scanner kb = new Scanner( System.in );

        System.out.print( "\n\t\t\tNice to see you again, " +
                          "       press any key to continue -> " );

        kb.nextLine(); //this command waits for keyboard input
    }//public static void pause()
    
}//end public class cssDefaults 
