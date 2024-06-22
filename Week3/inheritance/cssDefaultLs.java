import java.util.Scanner;

// Superclass defining default CSS settings
public class CssDefaultLs {

    // Private static method in the superclass
    private static void superClass() {
        System.out.println("\t***I am the Super Class***");
    }

    // Public method to define font CSS settings
    public void fontCSS() {
        superClass(); // Call superclass method
        String fontType = "Times Roman";
        String fontSize = "12";

        // Output font CSS settings
        System.out.printf("\tFont Type = %s\n", fontType);
        System.out.printf("\tFont Size = %s\n", fontSize);
    }

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

    // Static method to pause the program
    public static void pause() {
        Scanner kb = new Scanner(System.in);
        System.out.printf("\n\t\t\tNice to see you again, press Enter to continue -> ");
        kb.nextLine(); // Wait for user input
    }
}
