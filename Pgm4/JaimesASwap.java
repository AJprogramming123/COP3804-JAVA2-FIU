package Pgm4;

public class JaimesASwap
{
    public static void swapThem( int fn, int sn, int tn, int fourth)
    {
        int temp = 0;   //Temporary: Since you're going to swap 3 number's you'll need a fourth one that's going to allow you to do swapping of numbers.
    
        //To ensure fn is the smallest number
        if (fn > sn)    //temp = 0 fn = 80 sn = 48 tn = 7
        {
            temp = fn;  //temp = 80 fn = 80 sn = 48 tn = 7
            fn = sn;    //temp = 80 fn = 48 sn = 48 tn = 7  <- Since fn is bigger then sn then switch their values for the smaller one and make sn the bigger one
            sn = temp;  //temp = 80 fn = 48 sn = 80 tn = 7 
        }

        if( fn > tn)
        {
            temp = fn; 
            fn = tn;    // <- Since fn > tn then switch them to make sure fn is the smaller one 
            tn = temp;
        }

        if(fn > fourth)
        {
            temp = fn;
            fn = fourth;
            fourth = temp;
        }

        //to ensure sn is the second smallest
        if(sn > tn)
        {
            temp = sn;
            sn = fourth;
            fourth = temp; 
        }

        if(sn > fourth)
        {
            temp = sn;
            sn = fourth;
            fourth = temp;
        }

        //to ensure tn is the third smallest
        if(tn > fourth)
        {
            temp = tn;
            tn = fourth;
            fourth = temp;
        }

        System.out.printf("After swapping\t:\t%d %d %d %d\n", fn, sn, tn, fourth);
    }


    public static void main (String[] args)
    {
        int fn = 784; //fn is the first number
        int sn = 5; //sn is second number
        int tn = 123; //tn is third number
        int fourthn = 56; //This is the fourth number


        System.out.printf("Original list\t:\t%d %d %d %d\n", fn, sn, tn, fourthn);
    
        swapThem( fn, sn, tn, fourthn);
    }
    //To Swap you'll need to have a temporary number that is used when swapping numbers.
}