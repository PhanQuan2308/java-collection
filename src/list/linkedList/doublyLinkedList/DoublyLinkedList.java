package list.linkedList.doublyLinkedList;

// + Moi node se chua 2 tham chieu, cau truc: null <- node1 <-> node2 <-> Node3 <-> ... -> null
// + Mot node chua 3 phan: data chua gia tri, prev pointer tro ve node truoc , next pointer tro den node tiep theo , node dau va cuoi se tro den null

// + Duyet 2 chieu, them va xoa de dang
// + Phuc tap, ton bo nho

// + Ung dung: - Khi nguoi dung muon hoan tac 1 hanh dong thi co the chuyen trang thai nhanh chong
//             - khi người dùng tim kiếm thì nó sẽ lưu tên của sản phẩm đã tìm kiếm và khi
//               người dùng tiếp tục tìm kiếm thì nó sẽ gợi ý tên sản phẩm trước đó, sau đó khi mà vượt quá 5 sản phẩm thì nó sẽ xóa cái cuối đi.

public class DoublyLinkedList {
    private Product head, tail;  // Đầu và cuối của danh sách liên kết đôi
    private int size;
    private final int capacity = 5;  // Giới hạn tối đa 5 sản phẩm gợi ý

    // Thêm sản phẩm vào danh sách gợi ý
    public void addProduct(String productName) {
        Product newProduct = new Product(productName);

        // Nếu danh sách đã đầy, xóa sản phẩm cuối cùng (cũ nhất)
        if (size == capacity) {
            removeLastProduct();
        }

        // Thêm sản phẩm mới vào đầu danh sách
        if (head == null) {
            head = tail = newProduct;
        } else {
            newProduct.next = head;
            head.prev = newProduct;
            head = newProduct;
        }

        size++;
    }

    // Xóa sản phẩm cuối cùng (cũ nhất)
    private void removeLastProduct() {
        if (tail != null) {
            if (tail.prev != null) {
                tail = tail.prev;
                tail.next = null;
            } else {
                head = tail = null;  // Danh sách chỉ có một sản phẩm
            }
            size--;
        }
    }

    // Hiển thị các sản phẩm gợi ý
    public void showRecommendations() {
        System.out.println("Danh sách sản phẩm đã tìm kiếm:");
        Product current = head;
        while (current != null) {
            System.out.println(current.productName);
            current = current.next;
        }
        System.out.println();
    }

    // Xóa tất cả sản phẩm nếu cần
    public void clearRecommendations() {
        head = tail = null;
        size = 0;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addProduct("Laptop");
        list.addProduct("Smartphone");
        list.addProduct("Tablet");
        list.addProduct("Smartwatch");
        list.addProduct("Headphones");

        // Hiển thị danh sách gợi ý hiện tại
        list.showRecommendations();

        // Người dùng tìm kiếm thêm một sản phẩm, sản phẩm cũ nhất sẽ bị xóa
        list.addProduct("Camera");

        // Hiển thị danh sách gợi ý sau khi thêm sản phẩm mới
        list.showRecommendations();

    }
}
