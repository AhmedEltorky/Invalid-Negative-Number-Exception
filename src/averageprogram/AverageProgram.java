package averageprogram;

import java.util.Scanner;

/**
 *
 * @author Ahmed El-Torky
 */
public class AverageProgram {

    public static void main(String[] args) {
        
        int counter = 0, temp, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            try {
                temp = input.nextInt();
                if (temp >= 0) {
                    sum += temp;
                    counter++;
                } else {
                    throw new InvalidNegativeNumber(temp, "Only positive numbers allowed here.");
                }
            } catch (InvalidNegativeNumber ex) {
                ex.printMessage();
                i--;
            }
        }
        System.out.println("The average = " + (sum / counter));
    }
}
