package map.hashMap;

// + Implement Map, không duy trì thứ tự chèn, nhanh, cho phep key - value co the null, bat dong bo
// + Khi nao dung: - khi người dùng đăng nhập, thông tin của họ như tên, quyền truy cập
//                    có thể được lưu trong HashMap để nhanh chóng tra cứu trong phiên làm việc hiện tại.

import java.util.HashMap;
class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Object> sessionData = new HashMap<>();
        sessionData.put("username", "john_doe");
        sessionData.put("role", "admin");

    }
}
