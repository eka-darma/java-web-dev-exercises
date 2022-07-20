package exercises.lsn1datatypes;
import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The Width of the Rectangle : ");
        Double width = input.nextDouble();

        System.out.println("The Length of the Rectangle : ");
        Double length = input.nextDouble();

        Double area = width * length;
        System.out.println("The area of Rectangle with Width " + width + " and Length " + length + " is " + area);
    }
}
