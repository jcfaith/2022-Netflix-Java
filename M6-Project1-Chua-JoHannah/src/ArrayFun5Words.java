import java.util.Scanner;
import java.util.Arrays;

public class ArrayFun5Words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr1 = new String[5];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter a word: ");
            arr1[i] = scan.nextLine();
        }

        System.out.println("The array elements are: " + Arrays.toString(arr1));

    }
}
