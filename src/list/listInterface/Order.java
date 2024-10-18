package list.listInterface;

import java.util.ArrayList;
import java.util.List;

//vi du khi quan li don hang, trong don hang co 1 danh sach cac san pham thi dung list la hop li
public class Order {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    // do cac gia tri co chi muc nen viec truy xuat rat nhanh
    public void getAllProduct(){
        for(Product product : productList){
            System.out.println(product.getName() );
        }
    }

}
