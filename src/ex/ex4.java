package ex;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        /*
        * 1. Nhập số phần tử, khởi tạo mảng, nhập giá trị các phần tử
        * 2. In ra phần tử có giá tr nhỏ thứ 2 trong mảng
        * input:[3,5,1,7,9,5,9]
        * process: [9,9,7,5,5,3,1]
        * output:7
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("numbers[%d] = ",i);
            numbers[i] = Integer.parseInt(sc.nextLine());
        }
        //Sắp xếp mảng giảm dần
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j =i+1; j <numbers.length ; j++) {
                if (numbers[i]<numbers[j]){
                    int temp = numbers[i];
                    numbers[i] =numbers[j];
                    numbers[j] =temp;
                }
            }
        }
        int max = numbers[0];
        boolean isExits = false;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i]<max){
                System.out.printf("Giá trị lớn thứ 2 trong mảng là: %d",numbers[i]);
                isExits =true;
                break;
            }
        }
        if(!isExits)
        {
            System.out.println("Trong mảng không có giá trị lớn thứ 2!");
        }
    }
}
