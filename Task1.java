import java.util.Scanner;

public class Task1 {
    public static final double PI = 3.14;
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        float diameter = scanner.nextFloat();

        float perimeter = (float) (PI * diameter);

        System.out.println("Perimeter of the circle with diameter:" + diameter + "is" + perimeter);


    }
}
