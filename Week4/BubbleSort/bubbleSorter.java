package Week4.BubbleSort;
import java.util.Random;

//What bubble sort is goes through a list of numbers and if that number is not in order it 
//swaps them and restarts until there isn't any swapping necessary.

public class bubbleSorter {
    public static void main(String[] args)
    {

        Random rand = new Random();
        int[] numbers = new int[10]; 

        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = rand.nextInt(10000);
        }

        System.out.printf("Before: ");
        printArray(numbers);




        //Sorting algorithm here <- Where the bubble sorts happen
    boolean swappedSomething = true;

    while (swappedSomething)
    {
        swappedSomething = false;
        
        for(int i = 0; i < numbers.length - 1; i++) //Reason why numbers.length -1 is because when we're looking at the second to last element we'll be comparing it with the one after it which will be the last element so there's no reason to look at the last element by itself. Basically there wouldn't be anything to compare it with. 
        {
            if(numbers[i] > numbers[i + 1])
            {
                swappedSomething = true;

                int temp = numbers[i]; //The bigger number or the number in the list being examined right now
                numbers[i] = numbers[i + 1];  //the temporary chosen number of the list would equal the second number of the list. 
                numbers[i + 1] = temp; //now the second number of the list plus 1 will equal the third number of the list which becomes the temporary number.
            }
        }
    }
        System.out.printf("\nAfter: ");
        printArray(numbers);

    
    }



    private static void printArray(int[] numbers)
    {
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
