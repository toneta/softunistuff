import java.util.Scanner;

/**
 * Created by Toni on 2/4/2017.
 */
public class tradeComission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        Double sales = Double.parseDouble(scanner.nextLine());
        double commission;
        if (city.equalsIgnoreCase("Sofia")){
            if (0 <= sales && sales <= 500){
                commission = sales*0.05;
                System.out.println(commission);
            } else if (500<sales && sales <=1000){
                commission = sales*0.07;
                System.out.println(commission);

            } else if (1000<sales && sales <=10000){
                commission = sales*0.08;
                System.out.println(commission);

            } else if (sales>10000){
                commission = sales*0.12;
                System.out.println(commission);

            }

        } else if (city.equalsIgnoreCase("Varna")){
            if (0 <= sales && sales <= 500){
                commission = sales*0.045;
                System.out.println(commission);
            } else if (500<sales && sales <=1000){
                commission = sales*0.075;
                System.out.println(commission);
            } else if (1000<sales && sales <=10000){
                commission = sales*0.10;
                System.out.println(commission);
            } else if (sales>10000){
                commission = sales*0.13;
                System.out.println(commission);
            }


        } else if (city.equalsIgnoreCase("Plovdiv")){
            if (0 <= sales && sales <= 500){
                commission = sales*0.055;
                System.out.println(commission);

            } else if (500<sales && sales <=1000){
                commission = sales*0.08;
                System.out.println(commission);

            } else if (1000<sales && sales <=10000){
                commission = sales*0.12;
                System.out.println(commission);

            } else if (sales>10000){
                commission = sales*0.145;
                System.out.println(commission);

            }


        } else {
            System.out.println("error");
        }
    }
}
