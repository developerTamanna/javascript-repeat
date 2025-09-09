import java.util.Scanner;

public class SumOddWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= N) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }

        System.out.println("Sum of odd numbers = " + sum);
    }
}
