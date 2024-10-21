package list.arrayList;

// + Lưu trữ danh sách các đối tượng có khả năng thay đổi kích thước động.
// + Lưu trữ các kiểu dữ liệu Object.
// + Không đồng bộ (không an toàn cho đa luồng nếu không có đồng bộ hóa).
// + Có tất cả các đặc điểm của List do nó implement List.
// + Nhanh nhờ bất đồng bộ và có chỉ mục.
// + Ứng dụng thực tế: Lưu trữ danh sách giỏ hàng và điểm số sinh viên.
// + Nen dung de get, khong nen dung de add va delete
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        // vi du khi nguoi dung them 2 san pham vao gio hang thi nen dung ArrayList
        ArrayList<Product> productArrayList = new ArrayList<>();

        productArrayList.add(new Product("laptop", 10));
        productArrayList.add(new Product("xe dap", 20));

        System.out.printf("San pham trong gio hang: " );
        for(Product product : productArrayList){
            System.out.println(product);
        }
    }
}
