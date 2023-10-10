package ra.bt.bt2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = Integer.parseInt(scanner.nextLine());
        if (arrSize <= 0) {
            throw new NullPointerException("Mảng rỗng");
        } else {
            int[] arr = new int[arrSize];
            for (int i = 0; i < arrSize; i++) {
                arr[i] = (int) (Math.random() * 10);
            }
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[0] > max) {
                    max = arr[0];
                }
            }
            System.out.println(max);
        }
    }
}
