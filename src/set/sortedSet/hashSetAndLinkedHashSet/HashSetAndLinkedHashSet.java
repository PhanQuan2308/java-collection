package set.sortedSet.hashSetAndLinkedHashSet;

// HashSet: implement Set su dung bảng băm để lưu giá trị, không duy trì thứ tự khi thêm, không lưu các giá trị trùng lặp, hieu xuat cao
//          + ung dung:  - Danh sách email đã đăng ký
//                       - Khi bạn cần lưu trữ các phần tử duy nhất với hiệu suất cao, không cần giữ thứ tự nhập

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// LinkedHashSet: implement Set, duy tri thu tu khi them, khong luu giá trị trùng lặp.
//                + ung dung: - giữ thứ tự mà các phần tử được thêm vào (Lưu trữ lịch sử duyệt web: Nếu bạn cần lưu trữ lịch sử duyệt web của người dùng)
//                            - Khi bạn muốn tránh sự trùng lặp nhưng vẫn cần giữ thứ tự nhập liệu,
//                            - Khi bạn cần cả lưu trữ phần tử duy nhất và duy trì thứ tự nhập
public class HashSetAndLinkedHashSet {

    // Phương thức sử dụng HashSet để lưu trữ danh sách email duy nhất
    public void manageEmails() {
        Set<String> emailSet = new HashSet<>();
        emailSet.add("user1@example.com");
        emailSet.add("user2@example.com");
        emailSet.add("user1@example.com");  // Trùng lặp, sẽ bị bỏ qua

        System.out.println("Danh sách email trong HashSet (không có thứ tự): " + emailSet);
    }

    // Phương thức sử dụng LinkedHashSet để lưu trữ các thẻ tag và duy trì thứ tự
    public void manageTags() {
        Set<String> tagSet = new LinkedHashSet<>();
        tagSet.add("Java");
        tagSet.add("Spring Boot");
        tagSet.add("Java");  // Trùng lặp, sẽ bị bỏ qua

        System.out.println("Danh sách thẻ tag trong LinkedHashSet (có thứ tự): " + tagSet);
    }

    public static void main(String[] args) {
        HashSetAndLinkedHashSet example = new HashSetAndLinkedHashSet();

        // Sử dụng HashSet
        example.manageEmails();

        // Sử dụng LinkedHashSet
        example.manageTags();
    }
}
