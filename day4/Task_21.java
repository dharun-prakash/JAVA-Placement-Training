package day4;
import java.util.Scanner;

//Twisted Prime Number

public class Task_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            int temp = n;
            int rev = 0;
            while (temp > 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }
            int revCount = 0;
            for (int i = 1; i <= rev; i++) {
                if (rev % i == 0) {
                    revCount++;
                }
            }

            System.out.println((revCount == 2) ? "tpn" : "ntpn");
        } else {
            System.out.println("npn");
        }

    }
}
