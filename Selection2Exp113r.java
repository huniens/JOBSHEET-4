import java.util.Scanner;

/**
 * Selection2Exp113r
 */
public class Selection2Exp113r {    public static void main(String[] args) {
        // Scanner untuk menerima input dari pengguna
        Scanner input13 = new Scanner(System.in);

        // Minta pengguna memasukkan angka
        System.out.print("Input year : ");
        int year = input13.nextInt();

        // Periksa apakah adalah kelipatan 4
        if (year % 4 == 0) {
            if (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0)) {
                System.out.print("Leap year");
            
        } else {
                System.out.print("not a leap year");
        }
    }
}
}
