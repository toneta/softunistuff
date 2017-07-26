import java.util.Scanner;

/**
 * Created by Toni on 3/19/2017.
 */
public class exam4salaries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfClasses = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        int totallecturesCount = 0;
        int Jelev = 0;
        int RoYaL = 0;
        int Roli = 0;
        int Trofon = 0;
        int Sino = 0;
        int guest = 0;
        for (int i = 0; i < numberOfClasses; i++) {
            String lectorName = scanner.nextLine();
            totallecturesCount++;
            switch (lectorName){
                case ("Jelev"): Jelev++;
                    break;
                case ("RoYaL"): RoYaL++;
                break;
                case ("Roli"): Roli++;
                break;
                case ("Trofon"): Trofon++;
                break;
                case ("Sino"): Sino++;
                break;
                default: guest++;
                break;
            }
        }
        double perLecture = budget / totallecturesCount;
        System.out.printf("Jelev salary: %.2f lv\n" +
                "RoYaL salary: %.2f lv\n" +
                "Roli salary: %.2f lv\n" +
                "Trofon salary: %.2f lv\n" +
                "Sino salary: %.2f lv\n" +
                "Others salary: %.2f lv", Jelev*perLecture, RoYaL*perLecture, Roli*perLecture,
                Trofon*perLecture, Sino*perLecture, guest*perLecture);
    }
}
