package ex;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi 1:");
        String str1 = sc.nextLine();
        System.out.println("Nhập chuỗi 2:");
        String str2 = sc.nextLine();
        String str3 = str1.concat(" ".concat(str2));
        System.out.printf("Chuỗi sau khi nối: %s",str3);
    }
}
