package list.linkedList.doublyLinkedList;

public class Product {
    String productName;
    Product next;
    Product prev;

    public Product(String productName) {
        this.productName = productName;
        this.next = null;
        this.prev = null;
    }
}

