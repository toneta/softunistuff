import java.util.Scanner;

/**
 * Created by Toneta on 2017-01-22.
 */
public class numbersToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.parseInt(scanner.nextLine());
        if (value==0){
            System.out.print("zero");
        }else if (value==11) {
            System.out.print("eleven");
        }else if (value==10){
            System.out.print("ten");
        } else if (value==12){
            System.out.print("twelve");
        } else if (value==13){
                System.out.print("thirteen");
            } else if (value==14){
                System.out.print("fourteen");
            } else if (value==15){
                System.out.print("fifteen");
            } else if (value==16){
                System.out.print("sixteen");
            } else if (value==17){
                System.out.print("seventeen");
            } else if (value==18){
            System.out.print("eighteen");
        } else if (value==19){
            System.out.print("nineteen");
        } else if (value==100){
            System.out.print("one hundred");
        }
        else  if (value>=0 && value<100){
            switch (Math.abs(value/10)){
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("fourty");
                break;
                    case 5:
                    System.out.print("fifty");
                break;
                    case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
            if (value%10!=0 && value>10){
                System.out.print(" ");
            }
            switch (value%10){
                case 1: System.out.print("one");
                break;
                case 2: System.out.print("two");
                    break;                case 3: System.out.print("three");
                    break;                case 4: System.out.print("four");
                    break;                case 5: System.out.print("five");
                    break;                case 6: System.out.print("six");
                    break;                case 7: System.out.print("seven");
                    break;                case 8: System.out.print("eight");
                    break;                case 9: System.out.print("nine");
                    break;
            }
        } else {
            System.out.println("Invalid number");
        }
        }
    }
