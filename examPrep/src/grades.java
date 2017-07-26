import java.util.Scanner;

/**
 * Created by Toni on 3/16/2017.
 */
public class grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsNumber = Integer.parseInt(scanner.nextLine());
        double topStudents = 0;
        double between4and5 = 0;
        double between3and4 = 0;
        double failed = 0;
        double sum = 0;

        for (int i = 0; i < studentsNumber; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            sum +=grade;
            if (grade>=5){
                topStudents++;
            } else if(grade>=4){
                between4and5++;
            } else if(grade>=3){
                between3and4++;
            } else {
                failed++;
            }
        }
        System.out.printf("Top students: %.2f%%\n" +
                "Between 4.00 and 4.99: %.2f%%\n" +
                "Between 3.00 and 3.99: %.2f%%\n" +
                "Fail: %.2f%%\n" +
                "Average: %.2f",(topStudents/studentsNumber)*100,(between4and5/studentsNumber)*100,
                (between3and4/studentsNumber)*100,(failed/studentsNumber)*100, sum/studentsNumber);
    }
}
