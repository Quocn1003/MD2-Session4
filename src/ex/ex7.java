package ex;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String str1 = sc.nextLine();
        System.out.println("Nhập chuỗi con:");
        String str2 = sc.nextLine();
        boolean isContain = str1.contains(str2);
        if(isContain){
            System.out.println("Chuỗi con nằm trong chuỗi ban đầu");
        }else {
            System.out.println("Chuỗi con không nằm trong chuỗi ban đầu");
        }
    }
}
