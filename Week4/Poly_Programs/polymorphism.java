//The difference between polymorphism and inheritance is that when you
//have polymorphism then you have a subclass that turns to a super class
class Bird
{
    public void sing()
    {
        System.out.printf("Tweet Tweet Tweet");
    }

    public void complete()
    {
        System.out.printf("\nWe are done\n");
    }
}

class Robin extends Bird
{
    public void sing()
    {
        System.out.printf("\nTwiddledeedee");
    }
}


//Since Robin is a sub-class of Bird then it inherits the complete() method so does the the Eagle class

class Eagle extends Robin
{
    public void bigBird()
    {
        System.out.printf("\nGIANTTT");
    }    
}


public class polymorphism
{
    public static void main(String[] args)
    {
      Bird b = new Bird();
        b.sing();
        b.complete();

      Robin r = new Robin();
        r.sing();
        r.complete();
    
      Eagle e = new Eagle();
        e.sing();
        e.bigBird();
        e.complete();
        
    
    }

}