import java.util.Scanner;

/**
 * Created by Toni on 1/31/2017.
 */
public class fruitStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        boolean isWeekend = day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday");
        boolean weekDay = day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednesday") || day.equalsIgnoreCase("thursday") || day.equalsIgnoreCase("friday");
        if (fruit.equalsIgnoreCase("banana")){
            if(weekDay){
                System.out.println(quantity*2.5);
            } else if (isWeekend){
                System.out.println(quantity*2.7);
            }else {
                System.out.println("error");
            }
        } else if (fruit.equalsIgnoreCase("apple")){
            if(weekDay){
                System.out.println(quantity*1.2);
            } else if(isWeekend){
                System.out.println(quantity*1.25);
            }else {
                System.out.println("error");
            }
        } else if (fruit.equalsIgnoreCase("orange")){
            if(weekDay){
                System.out.println(quantity*.85);
            } else if(isWeekend){
                System.out.println(quantity*.9);
            }else {
                System.out.println("error");
            }
        } else if (fruit.equalsIgnoreCase("grapefruit")){
            if(weekDay){
                System.out.println(quantity*1.45);
            } else if(isWeekend){
                System.out.println(quantity*1.6);
            }else {
                System.out.println("error");
            }
        } else if (fruit.equalsIgnoreCase("kiwi")){
            if(weekDay){
                System.out.println(quantity*2.7);
            } else if(isWeekend){
                System.out.println(quantity*3);
            }else {
                System.out.println("error");
            }
        } else if (fruit.equalsIgnoreCase("pineapple")){
            if(weekDay){
                System.out.println(quantity*5.5);
            } else if (isWeekend){
                System.out.println(quantity*5.6);
            } else {
                System.out.println("error");
            }
        } else if (fruit.equalsIgnoreCase("grapes")){
            if(weekDay){
                System.out.println(quantity*3.85);
            } else if(isWeekend) {
                System.out.println(quantity*4.2);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }


    }
}
