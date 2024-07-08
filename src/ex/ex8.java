package ex;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi:");
        String str = sc.nextLine();
        System.out.printf("Chuỗi sau khi loại bỏ khoảng trắng thừa: '%s'",trimSpaces(str));
    }

    public static String trimSpaces(String input) {
        if (input == null) {
            return null; // Xử lý trường hợp chuỗi null
        }
        return input.trim();
    }
}
