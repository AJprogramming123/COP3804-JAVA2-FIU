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
