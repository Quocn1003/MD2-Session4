package Session4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate_Data {
    public static void main(String[] args) {
        /*
        * Nhập vào mã sinh viên  gồm 5 ký tự , bắt đầu bằng SV, 3 ký tự sau là số
        * */
        Scanner sc =new Scanner(System.in);
        String studentIDRegex = "SV[0-9]{3}";
        System.out.println("Nhập mã sinh viên: ");
        String studenID;
        do {
            studenID = sc.nextLine();
            if(Pattern.matches(studentIDRegex,studenID)){
                break;
            }else {
                System.out.println("Mã sinh viên không đúng định dạng vui lòng nhập lại: ");
            }
        }while (true);
        System.out.println("Mã sinh viên vừa nhập: "+studenID);
    }
}
