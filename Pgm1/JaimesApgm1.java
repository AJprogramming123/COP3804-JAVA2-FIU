/*********************************************************************
 Author    : Andres Jaimes 
 Course    : COP3804 Intermediate Java.
 Professor : Michael Robinson 
 Program # : Pgm1 
     {Purpose of this program is to create a Two-dimensional Array, later add the rows from each column, and then print my entire name}

 Due Date  : 5/19/2024

 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 

 ..........{ Andres Jaimes }..........
*********************************************************************/


//Rules:
//No Tabs only spaces
//Only leave four spaces
//Only use printf
//Leave only 2 lines between methods and dont make a line space between the class and first method
//Have to end each method with: Ex. //end public static void ____
//for loops, if-statements, etc: (leave four spaces inside the loop)
//main method should be last method



public class JaimesApgm1
{
    public static void arrays(int array[][])    //Method to apply the index's values
    {
    
        for(int x = 0; x < array.length; x++)
        {
    
            for(int y = 0; y < array[x].length; y++)
            {
    
                array[x][y] = (x + y) * 3;    //Each index of my Two Dimensional array has to be applied with (row + column) * 3
    
    
            }	    
    
        }

    
        twoDa(array);    //Calling the method: twoDa()
    
        System.out.printf("\n");    //Putting space between methods
    
        Final(array);    //Calling the method: Final()
     
    }//end of public static void arrays(int array[][])
    
    
    public static void twoDa(int array[][])    //Method to print out the index values
    {
    
        for(int x = 0; x < array.length; x++)
        {
    
            System.out.printf("\t");    //Create space from the start of each row
    
            for(int y = 0; y < array[x].length; y++)
            {
    
                System.out.printf("%d\t", array[x][y]);    //Printing the index values
    
            }	    
    
            System.out.printf("\n");    //After every column been applied
    
        }    
    
    }//end of public static void twoDa(int array[][])
    	    
        
    public static void Final(int array[][])    //Method that totals the rows of each column
    {
    
        System.out.printf("Total:\t");    //To show that the next values are the totals 	
    
        for(int x = 0; x < array.length; x++)
        { 
    
            int total = 0;    //initialize the total amount, since the total amount is being manipulated inside a different loop then I must initialize it incase that for loop doesn't produce a value.
    
            for(int y = 0; y < array[x].length; y++)
            {
    
                total += array[y][x];    //The total is given by the Rows addition.
    
            }	    
    
            System.out.printf("%d\t", total);    //Print of the total
        }
    
    }//end of public static void Final(int array[][])
    
    
    public static void main(String[] args)
    {
        int array[][] = new int[15][15];    //Declared and Allocated the Two dimensional Array
    
    
        arrays(array);    //Called the arrays method, which has the value of twoDa() & Final()
    
    
        System.out.printf("\n\nAndres Jaimes\n");   //My Full Name

    }//end of public static void main(String[] args)
    
    
}//end of public class JaimesApgm1


