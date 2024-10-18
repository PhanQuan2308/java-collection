package list.listInterface;

// La:  + interface trong Collection Framework, danh sach cac phan tu co thu tu va trung lap, thay doi kich thuoc 1 cach linh hoat.
//      + Co the goi method tren no, tim kiem nhanh vi truy cap thong qua chi so, them xoa thi cham do can dich chuyen cac phan tu.
//      + Trong 1 List khong the luu cac gia tri co khac kieu du lieu, luu duoc khi ma su dung Object
// Khi nao dung: + can danh sach cac phan tu, so luong linh hoat, cac thao tac them sua xoa linh hoat, luu cac phan tu trung lap.
// Vi du:     + Quan li sinh vien, cho phep cac ten trung lap, hien thi danh sach gio hang, trong 1 gio hang co nhieu san pham giong nhau


public class ListExample {

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Smartphone", 500);

        Order order = new Order();
        order.addProduct(product1);
        order.addProduct(product2);

        order.getAllProduct();

    }

}
