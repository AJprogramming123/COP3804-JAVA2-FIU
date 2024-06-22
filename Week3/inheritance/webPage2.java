public class webPage2 extends cssDefaultLs
{
    //The super-class cssdefaults has a method with the same name of this method.
    //This method overrides the method in the super-class. So OVERRIDING overrides the superclass

    public void fontCSS() // <--- OVERRIDDING
    {
        System.out.printf("%\n\t\t\t^^^I am the Sub Class^^^");

        String fontType = "Courier";
        String fontSize = "10";

        System.out.printf("\t\t\tFont Type = " + fontType );
        System.out.printf("\t\t\tFont Size = " + fontSize );



    }
}
