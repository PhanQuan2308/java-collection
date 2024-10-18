package list.linkedList.singleLinkedList;

// Khong the tham chieu nguoc nen xoa 1 node rất kho khan, sử dung it bo nho hon DoubleLinkedList
// Moi node se co 1 data và 1 next pointer se tro đến node tiếp theo và next pointer cua node cuối cùng sẽ trỏ đến null,
// Vi du: trong 1 linkledList se co Head -> Node1 -> Node2 -> Node3 -> ... -> null.

// + khi tao node moi them vao dau danh sach, no se gan Head vao node moi va next pointer cua node nay se tro den node tiep theo
// + khi tao node vao cuoi danh sach thi -> duyet qua toan bo danh sach -> tim node cuoi cung ->
//                                       -> tao node can them -> gán next pointer của node cuối cùng đến node moi -> next poniter cua node moi tro den null

// + khi xoa node dau tien: cap nhat head tro toi node tiep theo
// + khi xoa node cuoi cung: duyet danh sach -> tim node truoc node cuoi -> dat next pointer thanh null

import org.w3c.dom.Node;

// + khi nao dung: + vi du xem lai lich su truy cap trang web cua nguoi dung thì lưu vào SinglyLinkedList la hop li vì khi lấy ra thì no se duyet lan luot, tranh bo sot.
public class SingleLinkedListExample {
    private Node head;

    // Class Node đại diện cho mỗi trang trong lịch sử truy cập
    private class Node {
        String url;
        Node next;

        public Node(String url) {
            this.url = url;
            this.next = null;
        }
    }

    // Thêm một URL mới vào lịch sử truy cập
    public void addPage(String url) {
        Node newNode = new Node(url);
        if (head == null) {
            head = newNode;  // Nếu danh sách rỗng, nút mới sẽ là phần tử đầu tiên
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;  // Duyệt đến phần tử cuối cùng
            }
            current.next = newNode;  // Thêm nút mới vào cuối danh sách
        }
    }

    // Hiển thị tất cả lịch sử truy cập từ đầu đến cuối
    public void displayHistory() {
        Node current = head;
        System.out.println("Lịch sử truy cập:");
        while (current != null) {
            System.out.println(current.url);
            current = current.next;  // Di chuyển tới nút tiếp theo
        }
    }

    public static void main(String[] args) {
        SingleLinkedListExample history = new SingleLinkedListExample();

        // Thêm các trang vào lịch sử truy cập
        history.addPage("Google.com");
        history.addPage("YouTube.com");
        history.addPage("Facebook.com");

        // Hiển thị lịch sử truy cập từ đầu đến cuối
        history.displayHistory();
    }
}
