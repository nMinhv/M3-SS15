package ra.bt.bt1;

import java.util.Scanner;

public class Throws {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        addInteger(scanner);
        try {
            addInteger(scanner);
        }catch (NumberFormatException e){
            System.out.println("Số nhập vào không đúng định dạng");
            addInteger(scanner);
        }
    }


    private static void addInteger(Scanner scanner) throws NumberFormatException{
        System.out.println("Nhập vào 2 sỗ:");
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.printf("%d + %d = %d", a, b, a + b);
    }
}
