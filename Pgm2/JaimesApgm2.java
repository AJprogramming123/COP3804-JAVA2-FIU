/*********************************************************************
 Author    : Your Name 
 Course    : COP3804 Online
 Professor : Michael Robinson 
 Program # : Pgm2
             {This program will use: Parallel Array, Enhanced For Loops, String Tokenizers, ArrayLists, ArrayList of Objects}

 Due Date  : 06/06/2024


 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 

 ..........{ Andres Jaimes }..........
*********************************************************************/

import java.util.ArrayList;


public class JaimesApgm2
{
    public static void parallel(String A[],int B[],double C[])  //A = Owner, B = Car weight, C = Total miles
    {

        System.out.printf("\nParallel Array:\n\n");

        for(int i = 0; i < A.length; i++)
        {
            System.out.printf("%s\t%d\t%.2f\n", A[i],B[i],C[i]);
        }

    }//end of public static void parallel(String A[],int B[],double C[])


    public static void EnhancedForLoop(Object A[])
    {

        System.out.printf("\nEnhanced For-Loop:\n\n");

        for(Object elements: A)
        {
            System.out.printf("%s\n", elements);
        }

    }//end of public static void EnhancedForLoop(Object A[])


    public static void tokens()
    {
        //--------------------[ $%*& ]---------------------------------//

        String str1 = "Jill$Billy%Becky*Tara&Mary";

        System.out.printf("\nDelimited by ['$', '%%', '*', '&']:\n");    

        String tokenizer[] = str1.split("[$%*&]");

        for(String elements: tokenizer)
        {
            System.out.printf("%s\t", elements);
        }

        //-------------------------------------------------------------//


        //--------------------[ //. ]----------------------------------//

        String str2 = "http://gaddisbooks.com";

        System.out.printf("\n\nDelimited by [//.]:\n");

        String tokenizer2[] = str2.split("[//.]");

        for(String elements: tokenizer2)
        {
            System.out.printf("%s\t", elements);
        }


        //-------------------------------------------------------------//


	//--------------------[ ' ' ]----------------------------------//

	String str3 = "blue one red three yellow";

	System.out.printf("\n\nDelimited by [' ']:\n");

	String tokenizer3[] = str3.split("[' ']");

	for(String elements: tokenizer3)
        {
	    System.out.printf("%s\t", elements);
	}

    }//end of public static void tokens()


    public static void theArrayList()
    {
	System.out.printf("\n\nArrayList:\n");

	ArrayList<Object> theList = new ArrayList<Object>();

	theList.add(123);
	theList.add("Java");
	theList.add(3.75);
	theList.add("Fall C");
	theList.add(2099);

	for(int i = 0; i < theList.size(); i++)
        {
	    System.out.printf("[%d] = %s    ",i, theList.get(i));
	}


	System.out.printf("\n\nRemove second and fifth records:\n");

	theList.remove(4);
	theList.remove(1);

	for(int i = 0; i < theList.size(); i++)
	{
	    System.out.printf("[%d] = %s    ", i, theList.get(i));
	}
  
    }//end of public static void theArrayList()


    public static void theObjects(Object A[])
    {
	System.out.printf("\n\nArraylist of Object Data Type:\n");
	
        ArrayList<Object> theObjectList = new ArrayList<Object>();

        // Add all elements of array A to the ArrayList
        for (Object obj : A) 
	{
            theObjectList.add(obj);
        }

        // Print elements of the ArrayList
        for (int i = 0; i < A.length; i++) 
	{
            System.out.printf("[%d] = %s    ", i, theObjectList.get(i));
        }

    }//end of public static void Objects(Object A[])


    public static void main(String[] args)
    {
	//-------------------------Parallel Array--------------------------------------//

        int carsWeight[] = {50102, 23908, 12098}; //cars weight

        String owner[] = {"Michael Hall", "Maria Lopez", "Mo Freeman"}; //Owners name

	double totalMiles[] = {104.45, 232.78, 153.07}; //total miles

        parallel(owner, carsWeight, totalMiles);

 	//-----------------------------------------------------------------------------//


	//-------------------------Enhanced Loop---------------------------------------//

	Object objectArray[] = {1, 3.5, "Apples", "Bananas"};

	EnhancedForLoop(objectArray);

	//-----------------------------------------------------------------------------//


	//-------------------------String Tokenizers-----------------------------------//

        tokens();  

	//-----------------------------------------------------------------------------//


	//------------------------Array List-------------------------------------------//

	theArrayList();

	//-----------------------------------------------------------------------------//

 	//------------------------Array List of object Data Type-----------------------//

	Object List[] = {1, "one", 1.4, 0.25, "COP3804", "Java Language", 100};

        theObjects(List);


    }//end of public static void main(String[] args)


}//end of public class JaimesApgm2

