import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double value = Double.parseDouble(console.nextLine());
        String input = console.nextLine();
        String output = console.nextLine();

        double BGN = 1.0;
        double USD = 1.79549;
        double EUR = 1.95583;
        double GBP = 2.53405;

        switch(input){
            case "BGN":
                break;
            case "USD":
                value = value * USD;
                break;
            case "EUR":
                value = value * EUR;
                break;
            case "GBP":
                value = value * GBP;
                break;
            default:
                break;



        }

        switch (output){
            case "BGN":
                value = value / BGN;
                break;
            case "USD":
                value = value / USD;
                break;
            case "EUR":
                value = value / EUR;
                break;
            case "GBP":
                value = value / GBP;
                break;
            default:
                break;
        }


        System.out.printf("%.2f %s", value,output);







    }
}