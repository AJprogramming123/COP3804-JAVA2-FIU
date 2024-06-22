import java.util.Scanner;

// Main class to demonstrate inheritance and method overriding
public class InheritanceWebPageShort {

    // Method to demonstrate webPage3 settings
    public static void page3() {
        System.out.printf("%s", "Welcome to webPage3(), these are your settings\n");

        // Create an instance of WebPage3
        webPage3 wp3 = new webPage3();
        
        wp3.fontCSS(); // Call overridden fontCSS method
        wp3.colorCSS(); // Call custom colorCSS method
    }

    // Method to demonstrate webPage2 settings
    public static void page2() {
        System.out.printf("%s", "Welcome to webPage2(), these are your settings\n");

        // Create an instance of WebPage2
        webPage2 wp2 = new webPage2();

        wp2.fontCSS(); // Call overridden fontCSS method
        wp2.colorCSS(); // Call default colorCSS method from superclass
    }

    // Method to demonstrate webPageHome settings
    public static void home() {
        System.out.printf("\n%s\n", "Welcome to webPageHome(), these are your settings\n");

        // Create an instance of WebPageHome
        webPageHome wpHome = new webPageHome();

        wpHome.fontCSS(); // Call default fontCSS method from superclass
        wpHome.colorCSS(); // Call default colorCSS method from superclass
    }

    // Main method to start the program
    public static void main(String[] args) {
        home(); // Demonstrate webPageHome settings
        page2(); // Demonstrate webPage2 settings
        page3(); // Demonstrate webPage3 settings
    }
}
