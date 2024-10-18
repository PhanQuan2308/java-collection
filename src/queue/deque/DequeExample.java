package queue.deque;

// + Các phần tử có thể được thêm và xóa ở cả đầu và cuối của hàng đợi.
// + Hoat dong nhu 1 stack hoac 1 queue(do thao duoc ca 2 dau)
// + Thêm và xóa phần tử ở cả hai đầu, nhanh, bat dong bo
// + Ví dụ: - Trong một hệ thống quản lý công việc, những công việc khẩn cấp có thể được thêm vào đầu hàng đợi, còn các công việc ít khẩn cấp hơn sẽ được thêm vào cuối.
//          - Trong các hệ thống web xử lý tác vụ (jobs), như gửi email, xử lý dữ liệu nền, hoặc xử lý hàng đợi công việc theo độ ưu tiên.

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    private Deque<String> taskQueue;

    public void TaskQueue() {
        taskQueue = new LinkedList<>();
    }

    // Thêm công việc ưu tiên cao vào đầu hàng đợi
    public void addHighPriorityTask(String task) {
        taskQueue.addFirst(task);
    }

    // Thêm công việc ưu tiên thấp vào cuối hàng đợi
    public void addLowPriorityTask(String task) {
        taskQueue.addLast(task);
    }

    // Xử lý công việc ở đầu hàng đợi
    public String processTask() {
        return taskQueue.pollFirst();
    }

    public static void main(String[] args) {
        DequeExample queue = new DequeExample();

        queue.addLowPriorityTask("Gửi email quảng cáo");
        queue.addHighPriorityTask("Xử lý lỗi khẩn cấp");
        queue.addLowPriorityTask("Gửi báo cáo hàng tuần");

        System.out.println("Xử lý: " + queue.processTask()); // Xử lý "Xử lý lỗi khẩn cấp"
        System.out.println("Xử lý: " + queue.processTask()); // Xử lý "Gửi email quảng cáo"
    }
}
