package Session4;

public class String_demo {
    public static void main(String[] args) {
        //1. Khởi tạo chuỗi bằng literal --> immutable
        String str1 = "Rikkei Academy";
        String str2 = "Học viện Rikkei";
        String str3 = "Rikkei Academy";//str1 và str3 cùng trỏ đến 1 vùng nhớ lưu trữ Rikkei Academy trong chuỗi
        //2. Khởi tạo chuôỗi từ constructor của lớp String
        String str4 = new String("Rikkei Academy");
        String str5 = new String("Rikkei Academy");//str4 và str5 trỏ đến 2 vùng nhớ khác nhau
        //3. str1.equals(str2): so sánh 2 chuỗi str1 và str2
        System.out.println("So sánh 2 chuỗi str1 và str3 với equals: "+str1.equals(str3));
        System.out.println("So sánh 2 chuỗi str1 và str4 với equals: "+str1.equals(str4));
        System.out.println("So sánh 2 chuỗi str4 và str5 với equals: "+str4.equals(str5));
        System.out.println("So sánh 2 chuỗi str1 và str2 với equals: "+str1.equals(str2));
        System.out.println("So sánh 2 chuỗi str1 và str3 với == : "+(str1==str3));
        System.out.println("So sánh 2 chuỗi str4 và str5 với == : "+(str4==str5));
        System.out.println("So sánh 2 chuỗi str1 và str4 với == : "+(str1==str4));
        //int length(): trả ra đô dài chuỗi
        System.out.println("Độ dài chuỗi str1 là: "+str1.length());
        //char str.charAt(int index): Trả ra ký tự tại chỉ số index
        System.out.println("Ký tự có chỉ số 2 trong str1 là: "+str1.charAt(2));
        //String str1.concat(str2): nối 2 chuỗi str1 và str2
        System.out.println("Nối 2 chuỗi str1 và str2: "+ str1.concat((" ").concat(str2)));
        //String str.toUpperCase(): Viết hoa các kí tự trong chuỗi
        System.out.println("VIết hoa chuỗi str1: "+ str1.toUpperCase());
        //String str.toLowerCase(): Viết thường các kí tự trong chuỗi
        System.out.println("Viết thường str1: "+str1.toLowerCase());
        //String str.trim(): Xoá khoảng trắng 2 đầu chuỗi
        String str6 = "     Rikkei Academy    ";
        System.out.println("Cắt khoảng trắng 2 đâu str6: "+str6.trim());
        //boolean str1.equalsIgnoreCase(str2): so sách giá trị str1 và str2 không phân biệt hoa thường
        String str7 = "RiKkei ACAdemy";
        System.out.println("So sánh str1 và str2 không phân biệt hoa thường: "+ str1.equalsIgnoreCase(str7));
        //int str1.compareTo(str2): trả về độ chênh theo bảng mã ASCII
        String str8 = "ABCD";
        String str9 = "ABDC";
        System.out.println("Độ chênh theo bảng mã ASCI của str8 và str9: "+ str8.compareTo(str9));
        //boolean str1.contains(str2): Kiểm tra chuỗi str1 có chứa str2 không
        //int str1.indexOf(str2): trả ra chỉ số của chuõi str2 trong chuỗi str1
        //String str1.replace(oldStr,newStr): thay thế chuỗi oldStr bằng chuỗi newStr trong str1;
        //boolean str1.startWith(str2): kiểm tra chuỗi str1 có bắt đầu bằng chuỗi str2 hay không
        //boolean str1.encWith(str2): kiểm tra chuỗi str1 có kết thúc bằng chuỗi str2 hay không
        //String[] str.split("delimiter"): cắt chuỗi thành các chuỗi con theo chuỗi delimiter
        String[] arrString = str2.split(" ");
        for(String element: arrString){
            System.out.println(element);
        }
        //String str.subString(int index):cắt chuỗi từ vị trí index đến cuối
        //String str.subString(int beginIndex,int enđIndex):cắt chuỗi từ vị trí beginIndex đến vị trí endIndex

    }
}
