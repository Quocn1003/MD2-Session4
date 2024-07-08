package ex;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        /*
        * 1. Nhập số phần tử, khởi tạo mảng, nhập giá trị các phần tử 2 mảng số nguyên
        * 2. Khởi tạo mảng gộp có số phần tử bằng tổng số phần tử 2 mảng
        * 3. thực hiện coppy các phần tử của 2 mảng sang mảng gộp
        * */
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng 1:");
        int size1 = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[size1];
        System.out.println("Nhập các giá trị của mảng 1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d]= ",i);
            arr1[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Nhập số phần tử mảng 2:");
        int size2 = Integer.parseInt(sc.nextLine());
        int[] arr2 = new int[size2];
        System.out.println("Nhập các giá trị của mảng 2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d]= ",i);
            arr2[i] = Integer.parseInt(sc.nextLine());
        }
        //gộp mảng:
        //khởi tạo chỉ số phần tử cho mảng 3
        int currentIndex =0;
        //khởi tạo mảng 3 có số phần tử bằng tổng phần tử 2 mảng
        int[] arr3 = new int[size1+size2];
        //coppy mảng 1 sang mảng 3
        for (int i = 0; i < arr1.length; i++) {
            arr3[currentIndex]= arr1[i];
            currentIndex++;
        }
        //coppy mảng 2 sang mảng 3
        for (int i = 0; i < arr2.length; i++) {
            arr3[currentIndex]= arr2[i];
            currentIndex++;
        }
        //hiển thị mảng sau khi gộp
        System.out.println("Mảng sau khi gộp:");
        for (int element: arr3){
            System.out.printf("%d\t",element);
        }
    }
}
