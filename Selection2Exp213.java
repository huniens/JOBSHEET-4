import java.util.Scanner;

/**
 * Selection2Exp213
 */
public class Selection2Exp213 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first angle: ");
        int angle1 = input.nextInt();
        System.out.print("Enter the second angle: ");
        int angle2 = input.nextInt();
        System.out.print("Enter the third angle: ");
        int angle3 = input.nextInt();

        int totalAngle = angle1 + angle2 + angle3;

        if (totalAngle == 180) {
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Right triangle");
            } else if (angle1 == angle2 && angle2 == angle3) {
                System.out.println("Equilateral triangle");
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene triangle");
            }
        } else {
            System.out.println("Not a triangle");
        }
    }
}