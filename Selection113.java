import java.util.Scanner;

/**
 * Selection113
 */
public class Selection113 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner (System.in);
        System.out.print("Input a number = ");
        int number = input05.nextInt();
        //if(number%2 == 0){
            //System.out.println(number+" is an even number!");
        //}else{
            //System.out.println(number+" is an odd number!");
       // }
       String message = (number % 2 == 0) ? " is an even number!" : " is an odd number!";
        System.out.println(number + message);
    }
}