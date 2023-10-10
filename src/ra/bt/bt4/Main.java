package ra.bt.bt4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi:");
        String str = scanner.nextLine();
        String[] arrStr = str.split("");
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < arrStr.length; i++) {
            try {
                int n = Integer.parseInt(arrStr[i]);
                integerList.add(n);
            } catch (NumberFormatException e){
                System.out.printf("%s không phải là số\n",arrStr[i]);
                integerList.add(0);
            }
        }
        System.out.println(integerList);
    }
}
