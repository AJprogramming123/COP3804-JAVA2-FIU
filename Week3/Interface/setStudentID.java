class setStudentID implements studentIDinterface
{
    //creating global public variables

    //"global variable" typically refers to class fields (instance variables) that are accessible throughout the class. 
    //These can be accessed directly from outside the class, which doesn't make sense but professor does it that way.
    
    public int    studentID;
    public String studentLastName;
    public String studentFirstName;
    public String studentMiddleName;
    public String studentAddress1;	  
    public String studentAddress2;
    public String studentCity;
    public String studentState;
    public String studentCountry;
    public String studentZipCode;
    public String studentTelNumber;
             
           
    public void studentSchool( )
    {
        //the SchoolID variable used here is the
        //public global variable from the interface 
        System.out.println( SchoolID );
    
    }//end public void studentSchool( String SchoolID )
    
    
    public void studentID( int studentID )
    {
        //assigns received studentID value to
        //global studentID variable  
        this.studentID = studentID;
        System.out.println( this.studentID );
        
    }//end public void studentID( int studentID )
    
         
    public void studentLastName( String studentLastName )
    {
        //assigns received studentLastName value to
        //global studentLastName variable  
        this.studentLastName = studentLastName;
        System.out.println( this.studentLastName );
        
    }//end public void studentLastName( String studentLastName )
           
         
    public void studentFirstName( String studentFirstName )
    {
        //assigns received studentFirstName value to
        //global studentFirstName variable  
        this.studentFirstName = studentFirstName;
        System.out.println( this.studentFirstName );
        
    }//end public void studentFirstName( String studentFirstName )
         
          
    public void studentMiddleName( String studentMiddleName )
    {
        //assigns received studentMiddleName value to
        //global studentMiddleName variable  
        this.studentMiddleName = studentMiddleName;
        System.out.println( this.studentMiddleName );
        
    }//end public void studentMiddleName( String studentMiddleName )
          
       
    public void studentAddress1( String studentAddress1 )
    {
        //assigns received studentAddress1 value to
        //global studentAddress1 variable  
        this.studentAddress1 = studentAddress1;
        System.out.println( this.studentAddress1 );
        
    }//end public void studentAddress1( String studentAddress1 )
             
       
    public void studentAddress2( String studentAddress2 )
    {
        //assigns received studentAddress2 value to
        //global studentAddress2 variable  
        this.studentAddress2 = studentAddress2;
        System.out.println( this.studentAddress2 );
        
    }//end public void studentAddress2( String studentAddress2 )
           
             
    public void studentCity( String studentCity )
    {
        //assigns received studentCity value to
        //global studentCity variable  
        this.studentCity = studentCity;
        System.out.println( this.studentCity );
        
    }//end public void studentCity( String studentCity )
               
           
    public void studentState( String studentState )
    {
        //assigns received studentState value to
        //global studentState variable  
        this.studentState = studentState;
        System.out.println( this.studentState );
        
    }//end public void studentState( String studentState )
             
        
    public void studentCountry( String studentCountry )
    {
        //assigns received studentCountry value to
        //global studentCountry variable  
        this.studentCountry = studentCountry;
        System.out.println( this.studentCountry );
        
    }//end public void studentCountry( String studentCountry )
          
       
    public void studentZipCode( String studentZipCode )
    {
        //assigns received studentZipCode value to
        //global studentZipCode variable  
        this.studentZipCode = studentZipCode;
        System.out.println( this.studentZipCode );
        
    }//end public void studentZipCode( String studentZipCode )
           
           
    public void studentTelNumber( String studentTelNumber )
    {
        //assigns received studentTelNumber value to
        //global studentTelNumber variable  
        this.studentTelNumber = studentTelNumber;
        System.out.println( this.studentTelNumber );
        
    }//end public void studentTelNumber( String studentTelNumber )


    public static void main( String arg[] )
    {
        //create and object of the interface type
        //from our own class that is implementing the interface
        studentIDinterface MySetStudentID = new setStudentID();
    
        //call the implemented methods from the interface  
        //passing our own data, except for the schoolID that 
        //we will get from the interface, see studentSchool()
        //method
        MySetStudentID.studentSchool();
        MySetStudentID.studentID( 1234567 );
        MySetStudentID.studentLastName( "Hamilton" );
        MySetStudentID.studentFirstName( "Joseph" );
        MySetStudentID.studentMiddleName( "Michael" );
        MySetStudentID.studentAddress1( "123 main st" );
        MySetStudentID.studentAddress2( "apt #456" );
        MySetStudentID.studentCity( "Miami" );
        MySetStudentID.studentState( "Florida" );
        MySetStudentID.studentCountry( "USA" );
        MySetStudentID.studentZipCode( "76512" );
        MySetStudentID.studentTelNumber( "555-555-5555" );

    }//end public void main( String arg[] )

    
}//end class setStudentID implements studentIDinterface}   