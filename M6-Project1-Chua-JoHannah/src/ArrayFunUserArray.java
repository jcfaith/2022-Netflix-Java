import java.util.Scanner;
import java.util.Arrays;

public class ArrayFunUserArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter a number: ");
            num[i] = scan.nextInt();
        }

        Arrays.sort(num);
        System.out.println("The array elements are: " + Arrays.toString(num));

    }
}