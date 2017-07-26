    import java.text.DecimalFormat;
    import java.util.Scanner;

    /**
     * Created by Toni on 3/17/2017.
     */
    public class poolTubes {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            DecimalFormat format = new DecimalFormat("0.##");
            int v = Integer.parseInt(scanner.nextLine());
            int p1 = Integer.parseInt(scanner.nextLine());
            int p2 = Integer.parseInt(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            double letersFilled = (p1*h) + (p2*h);
            int percentageFilled = (int)((letersFilled*100)/v);
            int  pipe1perc = (int)((p1*h)*100/letersFilled);
            int pipe2perc = (int)((p2*h)*100/letersFilled);
            double pisnami = letersFilled-v;
            if (letersFilled<=v){
                System.out.printf("The pool is %d%% full. Pipe 1: %d%%. Pipe 2: %d%%.",percentageFilled, pipe1perc, pipe2perc);
            } else {
                System.out.printf("For %s hours the pool overflows with %s liters.", format.format(h), format.format(pisnami));
            }
        }
    }
