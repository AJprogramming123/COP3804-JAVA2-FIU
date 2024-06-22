import java.util.Scanner;

public class OneDimensionArray {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] array1 = new String[100]; // Initialize Array1

        int count = 0;
        String inputter;
        do {
            System.out.println("Enter a value (type 'Done' to finish): ");
            inputter = scnr.nextLine();
            if (!inputter.equals("Done")) {
                array1[count] = inputter;
                count++;
            }
        } while (!inputter.equals("Done"));

        for (int i = 0; i < count; i++) { // Loop until count instead of Array1[i].length
            System.out.printf("%d: %s\n", i, array1[i]);
        }
    }
}

