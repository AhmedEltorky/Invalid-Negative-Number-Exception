package averageprogram;

/**
 *
 * @author Ahmed El-Torky
 */
public class InvalidNegativeNumber extends Throwable {

    private String message;
    private int num;

    public InvalidNegativeNumber(int num, String message) {
        this.num = num;
        this.message = message;
    }

    public void printMessage() {
        System.out.println("The number " + num + " invalid.");
        System.out.println(message);
    }

}
