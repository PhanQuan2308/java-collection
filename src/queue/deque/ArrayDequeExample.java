package queue.deque;

// + Implement Deque, sử dụng mảng động nên có hiệu suất truy cập liên tiếp và tuần tự nhanh hơn so với các cấu trúc dựa trên danh sách liên kết như LinkedList.
// + Khong dong bo

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    private Deque<String> requestQueue = new ArrayDeque<>();

    // Thêm yêu cầu vào hàng đợi
    public void addRequest(String request) {
        requestQueue.offerLast(request);  // Thêm yêu cầu vào cuối hàng đợi
        System.out.println("Request added: " + request);
    }

    // Xử lý yêu cầu từ đầu hàng đợi
    public void processRequest() {
        if (!requestQueue.isEmpty()) {
            String request = requestQueue.pollFirst();  // Lấy yêu cầu từ đầu
            System.out.println("Processing request: " + request);
        } else {
            System.out.println("No requests to process");
        }
    }
}
