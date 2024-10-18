package queue.priorityQueue;

// + implement Queue, phần tử có độ ưu tiên cao nhất sẽ được xử lý trước, khong tuan theo thu tu  FIFO
// + Mac dinh phan tu nho nhat se co do uu tien cao nhat, có the tuy chinh muc do uu tien bang cach su dung Comparator
// + Bat dong bo, nhanh
// + khi nao dung: - Khách hàng VIP sẽ nhận email trước, tiếp theo là khách hàng mới, và sau cùng là khách hàng thông thường.
//                 -

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        // mac dinh do uu tien
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(1);
        pq.add(2);
        System.out.println("Priority queue mac dinh uu tien: " + pq);

        PriorityQueue<PriorityTask> taskQueue = new PriorityQueue<>();

        // Thêm các công việc với độ ưu tiên khác nhau
        taskQueue.add(new PriorityTask("Làm báo cáo", 2));  // Ưu tiên trung bình
        taskQueue.add(new PriorityTask("Xử lý lỗi khẩn cấp", 1));  // Ưu tiên cao
        taskQueue.add(new PriorityTask("Đi họp", 3));  // Ưu tiên thấp

        // Xử lý các công việc theo độ ưu tiên
        while (!taskQueue.isEmpty()) {
            System.out.println("Công việc tiếp theo: " + taskQueue.poll().getTaskName());
        }


    }
}

class PriorityTask implements Comparable<PriorityTask> {
    private String taskName;
    private int priority;  // 1 là ưu tiên cao nhất

    public PriorityTask(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public int compareTo(PriorityTask other) {
        return Integer.compare(this.priority, other.priority);  // Ưu tiên giá trị nhỏ hơn (cao hơn)
    }
}