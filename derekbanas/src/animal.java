import java.util.Scanner;
import java.util.*;

public class animal {
    public static final double FAVNUMBER = 1.61;
    private String name;
    private int weight;
    private boolean hasOwner = false;
    private byte age;
    private long uniqueID;
    private char favChar;

    protected static int numberOfAnimals = 0;
    static Scanner userinput = new Scanner(System.in);
    public  Animal(int a){
        numberOfAnimals++;
        int sunNum = a+1;
        System.out.println(sunNum);

    }
}

    public static void main(String[] args) {
        animal theAnimal = new animal();
    }

