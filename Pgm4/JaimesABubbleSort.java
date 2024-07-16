/*********************************************************************
 Author    : Your Name 
 Course    : Java section. Example Java-1, Java-2, Java-3, or Java-4
 Professor : Michael Robinson 
 Program # : Program Purpose/Description 
             { This is the bubble sort portion of the project assignment, it isn't associated with any other class it's just to show how bubble sorting works. The goal was to sort my name in alphabetical order }

 Due Date  : 07/16/2024

 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 

 ..........{ Andres Jaimes }..........
*********************************************************************/

public class JaimesABubbleSort 
{
    public static void bubbleSort(String[] myName)
    {
        int maxElement;
        int index;
        String temp;

        for( maxElement = myName.length - 1; maxElement >= 0; maxElement--)
        {
            for(index = 0; index <= maxElement - 1; index++)
            {
                if(myName[index].compareTo(myName[index + 1]) > 0)
                {
                    temp = myName[index];
                    myName[index] = myName[index + 1];
                    myName[index + 1] = temp;
                }
            }
        }

        displayName(myName);
    }


    public static void displayName(String array[])
    {
        for(String element : array)
        {
        System.out.printf("%s ", element);
        }
    }


    public static void main(String[] args)
    {
        String[] myName = {"Jaimes", "Andres"};

        System.out.printf("Before bubble sort: ");
        displayName(myName);

        System.out.printf("\n\n");

        System.out.printf("After bubble sort: ");
        bubbleSort(myName);


    }
}
