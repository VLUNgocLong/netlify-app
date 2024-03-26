package baitap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Tạo tài khoản và mật khẩu mẫu
        String correctUsername = "admin";
        String correctPassword = "password123";

        // Nhập thông tin từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên đăng nhập:");
        String username = scanner.nextLine();
        System.out.println("Nhập mật khẩu:");
        String password = scanner.nextLine();

        // Kiểm tra thông tin đăng nhập
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Đăng nhập thành công");
        } else {
            System.out.println("Đăng nhập thất bại");
        }
        scanner.close();
    }
}
