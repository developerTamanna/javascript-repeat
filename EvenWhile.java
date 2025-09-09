import java.util.Scanner;

public class EvenWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        int i = 2;

        while (i <= N) {
            System.out.print(i + " ");
            i += 2;
        }
    }
}
