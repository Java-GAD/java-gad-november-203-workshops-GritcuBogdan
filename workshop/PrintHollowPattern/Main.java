import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un numar: ");
        int n = scanner.nextInt();

        printHollowPattern(n);

        scanner.close();

    }

    public static void printHollowPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                }
                else {System.out.print(" ");}
            }
            System.out.println();
        }

    }

}
