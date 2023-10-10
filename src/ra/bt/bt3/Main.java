package ra.bt.bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng > 0");
        int length = Integer.parseInt(scanner.nextLine());
//        int[] arr = new int[length];
//        for (int i = 0; i < arr.length; i++) {
//            try {
//                arr[i] = Integer.parseInt(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("đéo phải số ");
//                arr[i] = Integer.parseInt(scanner.nextLine());
//            }
//        }
//        int sum = 0;
//        for (int i = 0; i <arr.length ; i++) {
//                sum+= arr[i];
//        }
//        System.out.println(sum);
        String[] strArr = new String[length];
        int sumArr = 0;
        for (int i = 0; i < strArr.length; i++) {
            System.out.printf("Nhập phần tử %d\n", i + 1);
            strArr[i] = scanner.nextLine();
            try {
                int n = Integer.parseInt(strArr[i]);
                sumArr += n;
            } catch (NumberFormatException e) {
                System.out.printf("%s ko phải là số nguyên\n", strArr[i]);
            }
        }

        System.out.println("Tổng của mảng:" + sumArr);
    }
}
