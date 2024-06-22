/*********************************************************************
 Author    : Andres Jaimes 
 Course    : COP3804 Intermediate Java.
 Professor : Michael Robinson 
 Program # : Program Purpose/Description 
             { A brief description of the program }

 Due Date  : 5/19/2024

 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 

 ..........{ Andres Jaimes }..........
*********************************************************************/


//Rules:
//No Tabs only spaces
//Only leave four spaces
//Only use printf



public class Introduction
{
        
    public static void printing(String myName, String myMajor, double gpa, int credits, String className)
    {
        //printing all the data received, one field per line/row
        System.out.printf("\nMy name is %s \n", myName);
        System.out.printf("\nMy name is %s \n", myMajor);
        System.out.printf("\nMy name is %s \n", gpa);
        System.out.printf("\nMy name is %s \n", credits);
        System.out.printf("\nMy name is %s \n", className);

        //Printing all data received, in one line/row
        System.out.printf("\nMy gpa is %.5f My current class is %d credits and its name is %s My name is %s and my major is %s\n", gpa, credits, className, myName, myMajor);

    }
	





    //main method must be the last method
    public static void main(String[] args)
    {

        printing("Andres", "IT", 3.99, 3, "Java3804"); //To show System.out.printf samples	
		
    }


}//end of public class Introduction

//Finish with saying (top)



