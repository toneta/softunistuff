import java.util.Scanner;

/**
 * Created by Toneta on 2017-01-20.
 */
public class biri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        Double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        if(city.equals("Sofia")){
            if (product.equals("coffee")){
                price = .5;
            } else if (product.equals("water")){
                price = .8;
            } else if (product.equals("beer")){
                price = 1.2;
            } else if (product.equals("sweets")){
                price = 1.45;
            } else if (product.equals("peanuts")){
                price = 1.6;
            }
        } else if (city.equals("Plovdiv")){
             if (product.equals("coffee")){
            price = .4;
        } else if (product.equals("water")){
            price = .7;
        } else if (product.equals("beer")){
            price = 1.15;
        } else if (product.equals("sweets")){
            price = 1.30;
        } else if (product.equals("peanuts")){
            price = 1.5;
        }

        } else if (city.equals("Varna")){
            if (product.equals("coffee")){
                price = .45;
            } else if (product.equals("water")){
                price = .7;
            } else if (product.equals("beer")){
                price = 1.10;
            } else if (product.equals("sweets")){
                price = 1.35;
            } else if (product.equals("peanuts")){
                price = 1.55;
            }


        }

        System.out.println(price*quantity);
    }
}
