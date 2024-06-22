public class EnhancedForLoop
{
    public static void process(String arrayOne[])
    {
    
        //search the above array and display one index at a time
	for(String elements : arrayOne)
	{
	    System.out.printf(" %s\n", elements);
          
	}
	
    }
    

    public static void main(String[] args)
    {
        String arrayOne[] = {"one","two","three","four","five"};

	process(arrayOne);
    
    
    }
    










}
