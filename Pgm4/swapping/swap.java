package Pgm4.swapping;

//purpose: To place three items in ascending order

public class swap {
    
    public static void swapThem( int fn, int sn, int tn)
    {
        int temp = 0;

        if (fn > sn)    //temp = 0 fn = 80 sn = 48 tn = 7
        {
            temp = fn;  //temp = 80 fn = 80 sn = 48 tn = 7
            fn = sn;    //temp = 80 fn = 48 sn = 48 tn = 7
            sn = temp;  //temp = 80 fn = 48 sn = 80 tn = 7

            System.out.printf("After first swap\t:\t%d %d %d\n", fn, sn, tn);
        }

        if( sn > tn)
        {
            temp = sn; 
            sn = tn;
            tn = temp;

            System.out.printf("After second swap\t:\t%d %d %d", fn, sn, tn);

        }

        if( fn > sn)
        {
            temp = fn;
            fn = sn;
            sn = temp;

            System.out.printf("After third swap\t:\t%d %d %d", fn, sn, tn);
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