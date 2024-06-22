
//extends is to inherit the public code of Vehicle class
//Think of the Super-class being an ancestory it's giving inheritance to its descendance

public class Car extends Vehicle
{
    // Example attributes
    private String brand;
    private int speed;

    // Constructor
    public Car() 
    {
        this.brand = "DefaultBrand";
        this.speed = 0;
    }

   
}