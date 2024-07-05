package Exam2.youtube;

public class shoe {
    
    //These are called the 'instance variables' because each each time you use the shoe object it uses a class and makes a new shoe object with these variables.
    //When you make an object it's called an 'instance', in short instance is one time or one thing. 
    public final String brand;
    public final double size;

    shoe(String brand, double size) 
    {
        //If you did brand = brand then the program will get confused on which brand to use, so that's why we use this. (to differentiate)
        this.brand = brand;
        this.size = size; 
    }

}
