package ra.bt.byUycho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inputData(scanner);
    }

    private static void inputData(Scanner scanner) {
        while (true) {
            System.out.println("1: start");
            System.out.println("2: stop");
            try {
                byte select = Byte.parseByte(scanner.nextLine());
                switch (select) {
                    case 1:
                        try {
                            System.out.println("Nhập vào lần lượt 2 số");
                            int a = Integer.parseInt(scanner.nextLine());
                            int b = Integer.parseInt(scanner.nextLine());
                            divide2Num(a, b);
                            add2Num(a, b);
                            multiple(a, b);
                            subtract2Num(a, b);
                        } catch (NumberFormatException e) {
                            System.out.println("Không phải là số, nhập lại");
                            inputData(scanner);
                        }
                        break;
                    case 2:
                        System.exit(0);
                    default:
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Không phải lựa chọn nhập lại");
                inputData(scanner);
            }
        }
    }

    private static void divide2Num(int a, int b) {
        try {
            if (a == 0 || b == 0) {
                throw new ArithmeticException();
            }
            System.out.printf("%d : %d = %.2f\n", a, b, (float) a / b);
            System.out.printf("%d : %d = %.2f\n", b, a, (float) b / a);
        } catch (ArithmeticException e) {
            System.out.println("a hoặc b bằng 0,nhập lại ");
            inputData(new Scanner(System.in));
        }
    }

    private static void subtract2Num(int a, int b) {
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d - %d = %d\n", b, a, b - a);
    }

    private static void multiple(int a, int b) {
        System.out.printf("%d * %d = %d\n", a, b, a * b);
    }

    private static void add2Num(int a, int b) {
        System.out.printf("%d + %d = %d\n", a, b, a + b);
    }
}
