import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_10817 {
    public static void main(String[] args) {
        int[] nums = new int[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(nums);
        System.out.println(nums[1]);
    }
}
