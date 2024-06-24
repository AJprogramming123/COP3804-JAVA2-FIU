/*********************************************************************
 Author    : Andres Jaimes
 Course    : COP 3804
 Professor : Michael Robinson 
 Program   : jaimesASuperPgm3
             Program Purpose/Description 
             {This is the super-class of the program, this is where the default values are and the sub-class inherit these methods}

 Due Date  : 06/25/24


 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 

 ..........{ Andres Jaimes }..........
*********************************************************************/

public class jaimesASuperPgm3
{
    private void methodOne( int value )    //with private it means there is no possibility of this method being inherited as an instance and with static it can not be inherited by a subclass 
    {
    	System.out.printf("%d\n", value);
    
    }//end of public void methodOne( int value )


    public void methodTwo( String value1, String value2 )
    {
        System.out.printf("I am super methodTwo\n");
    
    }//end of public void methodTwo( String value1, String value2 )


    public void methodThree()
    {
        System.out.printf("I am super methodThree\n");

    }//end of public void methodThree()


    public void callMethodOne( int value )
    {
        methodOne(value);

    }//end of public void callMethodOne( int value )

}//end of public class jaimesASuperpgm3
