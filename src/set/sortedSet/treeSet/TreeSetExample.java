package set.sortedSet.treeSet;

import java.util.TreeSet;

// + Implement SortedSet, su dung thuat toan Red-Black-Tree, đảm bảo phần tử sắp xếp theo thứ tự tự nhiên hoặc theo thứ tự do bạn định nghĩa thông qua Comparator
// + Không chứa phần tử trùng lặp, bat dong bo.
// + Khi nao dung: -  nếu bạn có một danh sách các sản phẩm và muốn sắp xếp chúng theo giá từ thấp đến cao.
//                 - dang ki username là duy nhất.
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String > usernames = new TreeSet<>();

        usernames.add("Quan");
        usernames.add("Quan1");

        // Tai day check value de cho ten Quan la duy nhat
        if (!usernames.add("Quan")) {
            System.out.println("Tên người dùng 'Quan' đã tồn tại!");
        }
    }


}
