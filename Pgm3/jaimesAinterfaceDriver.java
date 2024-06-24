class jaimesAinterfaceDriver implements jaimesAinterface
{
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
        System.out.printf("First Name: %s\n", person);
    }//end of public void thePersonLastName(String person)


    public void thePersonFirstName(String person)
    {
        System.out.printf("Last Name: %s", person);
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