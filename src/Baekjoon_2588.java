import java.util.Scanner;

public class Baekjoon_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        int n3 = n1 * (n2 % 10);
        int n4 = n1 * (n2 / 10 % 10);
        int n5 = n1 * (n2 / 100);

        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n3 + n4 * 10 + n5 * 100);
    }
}
