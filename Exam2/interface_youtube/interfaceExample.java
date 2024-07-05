package Exam2.interface_youtube;


interface waterbottleInterface { //An interface is basically an outline for a class. A class where we write the code outside.
    
    String color = "Blue";

    void fillUp();
    void pourOut();

    //only rule is all methods must be implemented into the class unlike variables. You can access color without redeclaring it in the class.
}

public class interfaceExample implements waterbottleInterface  //Class implements waterbottle interface, it needs to have the things in the outline. A blueprint.
{
    //every interface needs to be in the class.

    public static void main(String[] args)
    {
        System.out.println(color);

        interfaceExample ex = new interfaceExample();
        ex.fillUp();
    }


    @Override
    public void fillUp() {
        System.out.println("It is filled");
    }
    //needs the color and fillUp();

    
    public void pourOut()
    {
        System.out.println("It's been poured out");
    }

}
