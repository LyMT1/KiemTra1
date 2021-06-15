import java.util.Scanner;

public class baiTap2 {
    public void passwordvalidation() {
        System.out.println("---- Bài Tập 2 ----");
        System.out.println("Nhập mật khẩu: ");
        Scanner scanner = new Scanner(System.in);
        String passwd = scanner.nextLine();
            String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$*%^&+=])(?=\\S+$).{10,}";

            if (passwd.codePoints().count() < 10){
                System.out.println("Mật khẩu yếu");

            }
            else if (!passwd.matches(pattern)){
                System.out.println("Mật khẩu chưa đủ mạnh");
            }

            else if (passwd.matches(pattern)){
                System.out.println("Đặt mật khẩu thành công");
            }
    }

}
