//A two-dimensional array is a group of one dimension array.




public class TwoDimensionArray
{

    public static void process2dArray(int row, int col)
    {

    int number2d[][] = new int[row][col];

     //Load two dimensional array with each 
    System.out.printf( "\nLoading two dimensional array\n" );

    for(int x = 0; x < row; x++) //Process rows
    {
    	
    for(int y = 0; y < col; y++) //Process Columns
    {
    	number2d[x][y] = x + y;
    	System.out.printf("Row: %d\tColumn: %d = %d\n", x,y,number2d[x][y]);
    
    }
    
      System.out.printf("\n");
    }
	
    
     System.out.printf("Finished :)\n");

    
    
    }


    public static void main(String[] args)
    {
    
    process2dArray(10,10);
    process2dArray(20,20);
    
    }




}
