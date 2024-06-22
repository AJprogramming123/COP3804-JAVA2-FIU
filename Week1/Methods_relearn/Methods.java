import java.util.Scanner;

public class Methods
{
private String name;
private int age;
private double weight;
    
    //-Four spaces-
    public Methods(String name, int age, double weight)
    {
        //-Four spaces-
        this.name = name;
        this.age = age;
	this.weight = weight;
    
    }    

	

    public static void Complete(Methods obj)
    {
     
       String getName = obj.name;
       int getAge = obj.age;
       double getWeight = obj.weight;

       System.out.printf("My name is %s, My age is %d, My weight is %.2f", getName, getAge, getWeight);
    }


/*
    public static void main(String[] args)
    {
    Methods obj = new Methods("Andres Jaimes", 20, 190.2);
    Methods.Complete(obj);
    }
*/    
    
    
    

   
}
