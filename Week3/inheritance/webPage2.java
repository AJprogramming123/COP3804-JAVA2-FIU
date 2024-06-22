// Another subclass extending CssDefaults
public class webPage2 extends cssDefaultLs {

    // Override method to customize font CSS settings differently

    public void fontCSS() {
        System.out.printf("\n\t\t\t^^^I am the Sub Class^^^\n");

        String fontType = "Courier";
        String fontSize = "10";

        // Output customized font CSS settings
        System.out.printf("\t\t\tFont Type = " + fontType );
        System.out.printf("\t\t\tFont Size = " + fontSize );
    }
}
