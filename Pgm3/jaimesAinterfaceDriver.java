/*********************************************************************
 Author    : Andres Jaimes
 Course    : COP 3804
 Professor : Michael Robinson 
 Program   : jaimesAinterfaceDriver
             Program Purpose/Description 
             {This is the driver of the interface, meaning that this is where the blueprint will be placed and used}

 Due Date  : 06/25/24


 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 

 ..........{ Andres Jaimes }..........
*********************************************************************/

class jaimesAinterfaceDriver implements jaimesAinterface
{
    public String personPantherID = "6289563";
    public String personLastName = "Jaimes";
    public String personFirstName ="Andres";


    public String school = "FIU";


    public void thePersonSchool(String person)
    {
        System.out.printf("School: %s\n", person);

    }//end of public void thePersonSchool(String person)


    public void thePersonPantherID(String person)
    {
        System.out.printf("Panther ID: %s\n", person);

    }//end of public void thePersonPantherID(String person)


    public void thePersonLastName(String person)
    {
        System.out.printf("Last Name: %s\n", person);

    }//end of public void thePersonLastName(String person)


    public void thePersonFirstName(String person)
    {
        System.out.printf("First Name: %s", person);

    }//end of public void thePersonFirstName(String person)


    public static void main(String[] args)
    {
        jaimesAinterfaceDriver driver = new jaimesAinterfaceDriver();

        driver.thePersonSchool(driver.school);
        driver.thePersonPantherID(driver.personPantherID);
        driver.thePersonLastName(driver.personLastName);
        driver.thePersonFirstName(driver.personFirstName);

    }//end of public static void main(String[] args)

}//end of class jaimesAinterfaceDriver implements jaimesAinterface
