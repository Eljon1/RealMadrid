import java.util.Scanner;

    public class Task7 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter th amount of money : ");
            double amount = scanner.nextDouble();
            System.out.println("Enter the price od the product : ");
            double price = scanner.nextDouble();
            System.out.println("Change as below : ");
            int[] coinValues = getChange(amount, price);
            for (int i = 0; i < coinValues.length; i++) {
                System.out.print(coinValues[i] + ",");
            }
        }

        private static int[] getChange(double total, double price) {
            int[] coinValues = new int[]{1, 5, 10, 25, 50, 100};
            int[] coinCounts = new int[6];
            double change = (total - price) * 100;
            for (int i = coinValues.length - 1; i >= 0; i--) {
                coinCounts[i] = (int) (change / coinValues[i]);
                change = change - (coinValues[i] * coinCounts[i]);
            }
            return coinCounts;
        }
    }
}
