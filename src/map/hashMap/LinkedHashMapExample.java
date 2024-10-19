package map.hashMap;



// + Ke thua HashMap va implement Map, duy trì thứ tự chèn các phần tử nhung cham, khong dong bo

// + Vi du: Duy trì thứ tự của các bộ lọc tìm kiếm (Search Filters)

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    private LinkedHashMap<String, String> filters = new LinkedHashMap<>();

    // Thêm bộ lọc
    public void addFilter(String filterType, String filterValue) {
        filters.put(filterType, filterValue);
    }

    // Áp dụng các bộ lọc theo thứ tự
    public void applyFilters() {
        for (String filterType : filters.keySet()) {
            System.out.println("Applying filter: " + filterType + " = " + filters.get(filterType));
        }
    }

    public static void main(String[] args) {
        LinkedHashMapExample searchFilters = new LinkedHashMapExample();
        searchFilters.addFilter("Price", "Low to High");
        searchFilters.addFilter("Brand", "Apple");
        searchFilters.addFilter("Rating", "4 stars & above");

        // Áp dụng các bộ lọc theo thứ tự người dùng chọn
        searchFilters.applyFilters();
    }
}
