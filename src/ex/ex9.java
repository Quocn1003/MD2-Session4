package ex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ex9 {
    public static void main(String[] args) {
        /*
        Chương trình chúng ta sẽ khai báo 2 biến đại diện cho email và password
        Chúng ta sẽ dùng regex để kiểm tra email
        Regex với email thì phải đúng định dạng
        Regex với password thì phải không có dấu cách (space) và phải lơn hơn 6 kí tự
        */
        Scanner sc = new Scanner(System.in);
        String emailRegex = "[\\w._%+-]+@[\\w.]+\\.[a-zA-Z]{2,6}";
        String passwordRegex = "[\\S]{7}";
        System.out.println("Nhập email: ");
        do {
            String email = sc.nextLine();
            if(Pattern.matches(emailRegex,email)){
                break;
            }else{
                System.out.println("Email không đúng định dạng vui lòng nhập lại!");
            }
        }while(true);
        System.out.println("Nhập password: ");
        do {
            String password = sc.nextLine();
            if(Pattern.matches(passwordRegex,password)){
                break;
            }else{
                System.out.println("Password không đúng định dạng vui lòng nhập lại!");
            }
        }while(true);
    }
}
