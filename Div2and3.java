import java.util.Scanner;

public class Div2and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        int i = 1;

        do {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= N);
    }
}
