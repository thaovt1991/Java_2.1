package week3.java_collection_famework.product.arraylist;

public class RunManagerProduct {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        //Create 1 list exp
        Product nokia = new Product("Nokia", 1, 5500000);
        Product iphone = new Product("Iphone", 2, 10000000);
        Product samsung = new Product("SamSung", 3, 7000000);
        manager.productList.add(nokia);
        manager.productList.add(iphone);
        manager.productList.add(samsung);
        manager.menuManager();
    }
}
