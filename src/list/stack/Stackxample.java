package list.stack;

// + Ke thua tu Vector, dong bo hoa, cham, kich thuoc dong,  nguyen tac LIFO la phan tu them vao sau se duoc lay ra truoc
// + Cac thao tac them sua xoa chi co the tac dong len dinh.
// +

import java.util.Scanner;
import java.util.Stack;

public class Stackxample {
    // Hàm đảo ngược chuỗi sử dụng Stack
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        // Đẩy từng ký tự của chuỗi vào stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Lấy các ký tự từ stack và tạo ra chuỗi đảo ngược
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());  // Lấy ra ký tự từ stack
        }

        return reversedString.toString();  // Trả về chuỗi đã đảo ngược
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập vào chuỗi bạn muốn đảo ngược: ");
        String input = scanner.nextLine();

        // Đảo ngược chuỗi
        String result = reverseString(input);

        // Hiển thị chuỗi đã đảo ngược
        System.out.println("Chuỗi sau khi đảo ngược: " + result);
    }



}
