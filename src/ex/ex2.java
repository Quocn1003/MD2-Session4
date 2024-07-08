package ex;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        /**
         * 1. Nhập vào số phần tử của mảng, khai báo mảng 1 chiều số nguyên
         * 2. Nhập giá trị các phần tử của mảng
         * 3. Nhập chỉ số phần tử cần thêm
         * 4. Nhập giá trị của phần tử cần thêm
         * 5. Thêm giá trị phần tử theo chỉ số trong mảng
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] oldArr = new int[size];
        System.out.println("Nhập giá trị các phần tử của mảng: ");
        for (int i = 0; i < oldArr.length; i++) {
            System.out.printf("oldArr[%d]= ",i);
            oldArr[i] = Integer.parseInt(sc.nextLine());
        }
        //validate bắt buộc phải nhập đúng chỉ số chèn
        int indexInsert;
        System.out.println("Nhập chỉ số phần tử cần chèn: ");
        do {
            indexInsert = Integer.parseInt(sc.nextLine());
            if(indexInsert<0){
                System.err.println("Chỉ số phần tử không hợp lệ, vui lòng nhập lại");
            }else break;
        }while(true);
        System.out.println("Nhập giá trị phần tử cần chèn: ");
        int valueInsert = Integer.parseInt(sc.nextLine());
        //tạo mảng newArr
        int[] newArr;
        if (indexInsert>= oldArr.length){
            newArr = new int[indexInsert+1];
            //copy và chèn phần tử mới vào newArr
            for (int i = 0; i < oldArr.length; i++) {
                newArr[i]= oldArr[i];
            }
            newArr[indexInsert] = valueInsert;
        }else{
            newArr = new int[oldArr.length+1];
            //copy và chèn phần tử mới vào newArr
            for (int i = 0; i < newArr.length; i++) {
                if(i<indexInsert){
                    newArr[i]=oldArr[i];
                } else if (i>indexInsert) {
                    newArr[i] = oldArr[i-1];
                }else {
                    newArr[i] = valueInsert;
                }
            }
        }
        //copy và chèn phần tử mới vào newArr
        //hiển thị các giá trị mảng newArr
        System.out.println("Giá trị các phần tử sau khi thêm: ");
        for (int element: newArr){
            System.out.printf("%d\t",element);
        }
    }
}
