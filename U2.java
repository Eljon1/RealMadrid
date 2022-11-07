import java.util.Scanner;

public class U2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int sum = 0;
        int b = a.length();
        for (int i = 0; i < b; i++) {
            char c = a.charAt(i);
            int e = (int) c;
            sum = sum + e;
            System.out.println(c + " = " + e + '\n' + "Shuma: " + sum);

        }
    }
}

