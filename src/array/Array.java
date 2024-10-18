package array;

// + Lưu trữ nhiều giá trị có cùng kiểu dữ liệu
// + Cac phan tu luu trong mang co chi muc, kich thuoc co dinh nghia la kich thuoc phai khai bao truoc.
// + Khi nao dung: - Tat ca co cung kieu du lieu, biet truoc so luong can luu tru, cần một cấu trúc dữ liệu đơn giản và nhanh chóng
//                 - hieu xuat cao
//                 - cần lưu trữ lịch sử 10 giao dịch gần đây của người dùng để hiển thị nhanh trên giao diện.
//                 - luu san pham vao gio hang khi nguoi dung add de hien thi giao dien.

public class Array {
    public static void main(String[] args) {

        // khai bao kich thuoc co dinh
        String[] transactionHistory = new String[10];
        transactionHistory[0] = "Rut tien 10k";
        transactionHistory[1] = "Rut tien 20k";

        System.out.printf("Lich su giao dich gan day: ");
        for(String transaction : transactionHistory){
            if(transaction != null){
                System.out.println("%s " +  transaction);
            }

        }
    }
}
