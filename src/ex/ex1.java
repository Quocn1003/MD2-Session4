package ex;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        /**
         * 1. Nhập vào số phần tử của mảng, khai báo mảng 1 chiều số nguyên
         * 2. Nhập giá trị các phần tử của mảng
         * 3. Nhập chỉ số phần tử cần xoá
         * 4. Xoá phần tử theo chỉ số trong mảng
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
        //validate bắt buộc phải nhập đúng chỉ số có tồn tại
        int indexDelete;
        System.out.println("Nhập chỉ số phần tử cần xoá: ");
        do {
            indexDelete = Integer.parseInt(sc.nextLine());
            if (indexDelete<0 || indexDelete>= oldArr.length){
                System.err.println("Chỉ số phần tử xoá không tồn tại trong mảng, vui lòng nhập lại: ");
            }else break;
        }while (true);
        //thực hiện xoá
        //tạo mảng mới có số phần tử = size -1
        int[] newArr = new int[oldArr.length-1];
        //coppy các giá trị còn lại trong mảng oldArr samg mảng newArr
        for (int i = 0; i < oldArr.length; i++) {
            if (i<indexDelete)
            {
                newArr[i] = oldArr[i];
            }else if (i>indexDelete)
            {
                newArr[i-1] = oldArr[i];
            }
        }
        //hiển thị các giá trị mảng newArr
        System.out.println("Giá trị các phần tử sau khi xoá: ");
        for (int element: newArr){
            System.out.printf("%d\t",element);
        }
    }
}