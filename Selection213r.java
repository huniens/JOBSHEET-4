import java.util.Scanner;

/**
 * Selection213r
 */
public class Selection213r {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.println("Nilai uas      :");
        float finalExam = input05.nextFloat();
        System.out.println("Nilai uts      :");
        float midExam = input05.nextFloat();
        System.out.println("Nilai kuis     :");
        float quiz = input05.nextFloat();
        System.out.println("Nilai tugas    :");
        float assignment = input05.nextFloat();
        float total = (finalExam * 0.4F) + (midExam * 0.3F) + (quiz * 0.1F) + (assignment * 0.2F);
        System.out.println(total);

        if (total<= 39) {
             String message = total >=39 ? "Retake" : "Pass";
             String letterGrade = "E";
             System.out.println("Final Grade = " + letterGrade + "and the decision is " + message);
             
        } else if (total <= 50){
             String letterGrade = "D";
             String message = total >= 50 ? "Retake" : "Pass";
             System.out.println("Final Grade = " + letterGrade + " and the decision is " + message );
            
        } else if (total <=60) {
            String letterGrade = "C";
            String message = total >60 ? "Retake" : "Pass";
            System.out.println("Final grade = " + letterGrade + " and the decision is " + message  );
        
        } else if (total <= 65) {
            String letterGrade = "C+";
            String message = total >= 65 ? "Retake" : "Pass";
            System.out.println("Final Grade = " + letterGrade + " and the decision is " + message);

        } else if (total <= 73) {
            String letterGrade = "B";
            String message = total >= 73 ? "Retake" : "Pass";
            System.out.println("Final grade = " + letterGrade + " and the decision is " + message);
        } else if (total <= 80) {
            String letterGrade = "B+";
            String message = total >=80 ? "Retake" : "Pass";
            System.out.println("Final grade = " + letterGrade + " and the decision is " + message);
            
        } else if (total <= 100) {
            String letterGrade = "A";
            String message = total >= 100 ? "Retake" : "Pass";
            System.out.println("Final Grade = " + letterGrade + " And the decision is " + message);

        } else {
            System.out.println("Nilai Yang Anda Maksukan Salah, Coba Lagi!");            
        }
                      
    }
}       