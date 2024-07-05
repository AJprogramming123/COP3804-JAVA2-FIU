package Exam2.youtube;

public class walking extends shoe{ //walking is the subclass and shoe is the superclass
    
    public final boolean gorTex;

    walking(boolean gorTex, String brand, double size) //since shoe has "brand" and "size" you have to include it in this constructor
    {
        super(brand, size); //you have to create a shoe object in order to work, because you need the shoe first before walking. 
        this.gorTex = gorTex;
    }
}
