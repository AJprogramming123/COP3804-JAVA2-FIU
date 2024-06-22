import java.util.ArrayList;

public class ArrayList_OBJECT 
{
    public static void arrayListObjects(Object arrayObjects[]) 
    {
        // Notice that we have accepted an array of Object data type containing multiple data types
        System.out.printf("\nCopying an array of Objects into an ArrayList of Objects");

        // Create an ArrayList of Objects data type
        ArrayList<Object> arrayListObjects = new ArrayList<Object>();

        // Copy the elements from the array of Objects to the ArrayList of Objects and display them
	
        for (int x = 0; x < arrayObjects.length; x++) { // Since it's an array and not arrayList
            arrayListObjects.add(arrayObjects[x]);
            System.out.printf("\narrayListObjects(%d) = %s", x, arrayListObjects.get(x));
        }
    }


    public static void arrayOfObjects() 
    {
        System.out.printf("\nProcessing an array of Objects");

        // Create an array of Objects. Notice that they are made of multiple data types
        Object arrayList[] = {2, 0.5, "Hello", "Banana"};

        // Call arrayListObjects method with the array of Objects
        arrayListObjects(arrayList);
    }


    public static void main(String[] args)
    {
        // Call arrayOfObjects method
        arrayOfObjects();
    }
}

