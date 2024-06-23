//An interface in Java is like a contract or a blueprint for classes. It defines a set of methods that any class implementing the interface must provide. 
//However, the interface itself does not provide any implementation for these methods; it only specifies what methods must be available.


public interface studentIDinterface
{
    
    public String SchoolID = "UNI_87945";

    //Templates of methods
    void studentID( int studentID );
    void studentLastName( String studentLastName );
    void studentFirstName( String studentFirstName );
    void studentMiddleName( String studentMiddleName );
    void studentAddress1( String studentAddress1 );
    void studentAddress2( String studentAddress2 );
    void studentCity( String studentCity );
    void studentState( String studentState );
    void studentCountry( String studentZipCode );
    void studentZipCode( String studentZipCode );
    void studentTelNumber( String studentTelNumber );



}