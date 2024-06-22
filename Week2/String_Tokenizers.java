public class String_Tokenizers
{
    public static void split1()
    {
        //Create a string to be tokenized
	String str = "one two three four";

	//display heading with the String str values
	System.out.printf("\n\nSplitting %s delimited by ' '\n", str);
	
	//here we display the str string
	System.out.printf("\n\n%s\t=", str);

	//Using the split method of the String class,
	//place each word in str separated by one space
	//into their own index inside an array called tokens
	String tokens[] =  str.split( " " );

	//here we display each word in the tokens array
	for(String s : tokens)
	{
	    System.out.printf("\t  %s", s);
	
	}//end for (String s : tokens)

    
    
    
    
    }//end for public static void split1()


    public static void split2()
    {
        // Create a string to tokenized
        String str = "one and two and three and four";
    
        // display heading with the String str values
        System.out.printf("\n\nSplitting %s delimited by ' '\n", str);
	
        //Here we display the str string
        System.out.printf("\n%s\t=", str);


        //Using the split method of the String class,
        //place each word in str separated by one space
        //into their own index inside an array called tokens
        String tokens[] =  str.split( " and " );

    
        //here we display each word in the tokens array
        for(String s : tokens)
        {
            System.out.printf("\t  %s", s);
        }
    
    }


    public static void split3()
    {
        //Create a string to tokenized.
	String str = "joe@gaddisbooks.com";

	//display heading with the String str values
	System.out.printf("\n\nSplitting %s delimited by @.\n\n", str);

	//here we display the str string
	System.out.printf("%s\t=", str);
    
    	//Using the split method of the String class.
	//Place each word in str separated by any of the
	//following variables inside the "" of: "[0.]"
	//into their own index inside an array called tokens
	String tokens[] = str.split("[@.]");	//Don't forget the square brackets [] when splitting strings into different indexes
	
   	 for(String s : tokens)
        {
            System.out.printf("\t  %s", s);
        }

    }


     public static void split4()
    {
        //Create a string to tokenized.
	String str = "Jill$Billy%Becky*Tara&Mary";

	//display heading with the String str values
        System.out.printf("\n\nSplitting %s delimited by ['$', '%%', '*', '&']\n\n", str);
                               
	//here we display the str string
	System.out.printf("%s\t=", str);
    
    	//Using the split method of the String class.
	//Place each word in str separated by any of the
	//following variables inside the "" of: "[0.]"
	//into their own index inside an array called tokens
	String tokens[] = str.split("[$%*&]");	//Don't forget the square brackets [] when splitting strings into different indexes
	
   	 for(String s : tokens)
        {
            System.out.printf("\t  %s", s);
        }

    }


    public static void main(String[] args)
    {
    split1();
    split2();
    split3();
    split4();
    }




}
