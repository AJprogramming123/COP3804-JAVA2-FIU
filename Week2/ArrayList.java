import java.util.ArrayList;

//We can modify the ArrayList's size at any time, and we can add or delete indexes from any location.

public class ArrayList_Learning
{	
    static String lines = "---------------------";


    public static void alphaArrayList()
    {
        System.out.printf(lines);
	System.out.printf(" Processing ArrayList of String Data Type");
	System.out.printf("\t\tUsing for loops");
	System.out.printf(lines);
	System.out.printf(" Creating ArrayList...");
    
        //Create an ArrayList object
	ArrayList<String> arrayList = new ArrayList<String>();

	System.out.printf(" Adding data elements to the ArrayList...");
    
	//Data is always added at the end of the Array List
	arrayList.add( "a" );	//[0]
	arrayList.add( "b" );	//[1]
	arrayList.add( "c" );	//[2]
	arrayList.add( "d" );	//[3]
	arrayList.add( "e" );	//[4]
	arrayList.add( "f" );	//[5]
   
	System.out.printf("\nGetting data elements from the ArrayList");
    
    	//Use get method of ArrayList class to retrieve an element.
	//get(index) returns element at the index in the ArrayList.
	//Notice that the command to retrieve an element/index from
	//and Array List is: arrayListName.get(location)
	
	for(int x = 0; x < arrayList.size(); x++) //The method .length is not applicable to ArrayLists in Java; it's used for arrays. Instead of .length, you should use .size() to get the number of elements in an ArrayList.
	{
	System.out.printf("%s", arrayList.get(x) );
	
	}
    
    
    
    
    
    }
    public static void main(String[] args)
    {
       alphaArrayList();
    
    
    }






}
