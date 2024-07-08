package Session4;

import java.util.regex.Pattern;

public class Regex_demo {
    public static void main(String[] args) {
        //validate password bao gồm 6 ký tự gồm ký tự hoa, thường, số
        String passwordRegex= "[a-zA-Z0-9]{6}";
        String password = "admin1";
        System.out.println("Regex password: "+ Pattern.matches(passwordRegex,password));
    }
}
