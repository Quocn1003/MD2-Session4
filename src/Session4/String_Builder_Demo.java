package Session4;

public class String_Builder_Demo {
    public static void main(String[] args) {
        //1. khởi tạo chuỗi StringBuilder
        StringBuilder strBuilder = new StringBuilder("Rikkei Academy");
        //2. append(String str): Nối 2 chuỗi
        System.out.println("Nối chuỗi: "+strBuilder.append(" - Học viện đào tạo CNTT"));
        //3. insert(int offset,String str): chèn chuỗi str vào từ vị trí offset
        System.out.println("Chèn chuỗi: "+ strBuilder.insert(0,"Học viện "));
        //4. delete(int startIndex,int endIndex): xoá từ starIndex đến endIndex-1;
        System.out.println("Xoá ký tự: "+ strBuilder.delete(0,8));
        //5. reverse()
    }
}
