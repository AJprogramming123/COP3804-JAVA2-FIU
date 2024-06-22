/*
 New rules:

 - Have to end each method with: Ex. //end public static void ____
 - for loops, if-statements, etc: (leave four spaces inside the loop)
   
   if()
   {
       System.out.print("banana")
   }
 
- Leave two spaces between each b
 
*/
 
public class Parallel_array
{
    public static void parallel()
    {
        int studentID[] = {50102,23908, 12098}; //id array
        String studentName[] = {"Joe Ho", "Ann Paz", "Mo Sy"}; //name arrays
        double studentBalance[] = {10.00, 23.78, 1.07};

        for(int x = 0; x < studentID.length; x++)
        {
            System.out.printf("%s\t%d\t%.2f\n", studentName[x], studentID[x], studentBalance[x]);
        }   
    }//end public static void parallel()

    
    public static void main(String[] args)
    {
        parallel();
    } //end public static void main(String[] args)  
}//end public class Parallel_array

