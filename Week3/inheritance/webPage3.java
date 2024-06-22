// Subclass extending CssDefaults to customize CSS settings
public class webPage3 extends cssDefaultLs {

    // Override method to customize font CSS settings

    public void fontCSS() {
        System.out.println("\n\t\t\t^^^I am the Sub Class^^^");
        String fontType = "Loma";
        String fontSize = "15";

        // Output customized font CSS settings
        System.out.println("\t\t\tFont Type = " + fontType);
        System.out.println("\t\t\tFont Size = " + fontSize);
    }

    // Method to customize color CSS settings
    public void colorCSS() {
        System.out.println("\n\t\t\t^^^I am the Sub Class^^^");
        String foreGoundColor = "Blue";
        String backGoundColor = "Yellow";

        // Output customized color CSS settings
        System.out.println("\t\t\tForeground Color = " + foreGoundColor);
        System.out.println("\t\t\tBackground Color = " + backGoundColor);
    }
}
