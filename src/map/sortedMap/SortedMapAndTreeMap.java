package map.sortedMap;

// SortedMap: ke thua Map, tu dong sap xep tang dan, cac key khong cho phep null, cac value cho phep null.

// TreeMap: implement Map, tu dong sap xep tang dan, dung thuat toan Red-Black-Tree.


import java.util.TreeMap;

public class SortedMapAndTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Thêm các phần tử vào TreeMap
        treeMap.put("Banana", 10);
        treeMap.put("Apple", 5);
        treeMap.put("Orange", 8);

        // Duyệt qua các phần tử theo thứ tự tự nhiên (theo bảng chữ cái)
        for (String key : treeMap.keySet()) {
            System.out.println(key + ": " + treeMap.get(key));
        }

    }
}
