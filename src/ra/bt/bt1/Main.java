package ra.bt.bt1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        handleAddInteger(scanner);
    }

    private static void handleAddInteger(Scanner scanner) {

        try {
            System.out.println("Nhập vào 2 sỗ:");
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            System.out.printf("%d + %d = %d", a, b, a + b);
        } catch (NumberFormatException e) {
            System.out.println("Đầu vào không dúng định dạng");
            handleAddInteger(scanner);
        }
    }
}
