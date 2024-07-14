package Week4.swapping;

//purpose: To place three items in ascending order

public class swap {
    
    public static void swapThem( int fn, int sn, int tn)
    {
        int temp = 0;   //Temporary: Since you're going to swap 3 number's you'll need a fourth one that's going to allow you to do swapping of numbers.


        //Grab the first number and swap it with the second number and swap the second with the third number
        if (fn > sn)    //temp = 0 fn = 80 sn = 48 tn = 7
        {
            temp = fn;  //temp = 80 fn = 80 sn = 48 tn = 7
            fn = sn;    //temp = 80 fn = 48 sn = 48 tn = 7
            sn = temp;  //temp = 80 fn = 48 sn = 80 tn = 7

            System.out.printf("After first swap\t:\t%d %d %d\n", fn, sn, tn);
        }

        //Grab the second number and swap it with the third number if it is smaller then the third number
        if( sn > tn)
        {
            temp = sn; 
            sn = tn;
            tn = temp;

            System.out.printf("After second swap\t:\t%d %d %d\n", fn, sn, tn);

        }

        //Grab the first number to check if the first number is STILL larger then second number.
        if( fn > sn)
        {
            temp = fn;
            fn = sn;
            sn = temp;

            System.out.printf("After third swap\t:\t%d %d %d\n", fn, sn, tn);
        }
    }
    


public static void main (String[] args)
{
    int fn = 80; //fn is the first number
    int sn = 48; //sn is second number
    int tn = 7; //tn is third number

    System.out.printf("Original items\t:\t%d %d %d\n", fn, sn, tn);

    swapThem( fn, sn, tn);
}

}


//To Swap you'll need to have a temporary number that is used when swapping numbers.