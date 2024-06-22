import java.util.Scanner;

public class DOWHILER_practice {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] array1 = new int[10];

        System.out.printf("Calculator: (input '-1' if done)\n");

        int input;
        int count = 0;

        do {
            System.out.printf("First input: ");
            int A = scnr.nextInt();

            if (A == -1) {
                break;
            }

            System.out.printf("Second input: ");
            int B = scnr.nextInt();

            if (B == -1) {
                break;
            }

            int addition = A + B;
            array1[count] = addition;
            count++;

	    System.out.printf("\n");

        } while (true);

        for (int i = 0; i < count; i++) {
            System.out.printf("Answer %d: %d\n", i+1, array1[i]);
        }
    }
}

