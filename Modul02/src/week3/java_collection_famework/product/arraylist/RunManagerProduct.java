package week3.java_collection_famework.product.arraylist;

import java.util.*;

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
//    public static void menuManager(ProductManager manager){
//        char choice = '?';
//        while (choice != '0') {
//            System.out.println("Menu Product Manager");
//            System.out.println("1. Add product");
//            System.out.println("2. Edit product with id ");
//            System.out.println("3. Delete product with id ");
//            System.out.println("4. Display products list");
//            System.out.println("5. Sort in ascending order of price");
//            System.out.println("6 . Sort in decrease order of price");
//            System.out.println("0. Exit program");
//            System.out.println("--------------------------------------------");
//            System.out.print("choice :");
//            Scanner change = new Scanner(System.in);
//            choice = change.nextLine().charAt(0);
//            switch (choice) {
//                case '1':
//                    manager.addProductList();
//                    break;
//                case '2':
//                    manager.setProductInProductListWithId();
//                    break;
//                case '3':
//                    manager.deleteProductInProductListWithId();
//                    break;
//                case '4':
//                    manager.displayProduct();
//                    break;
//                case '5':
//                    manager.sortWithPriceAscending();
//                    break;
//                case '6':
//                    manager.sortWithPriceDecrease();
//                    break;
//                case '0':
//                    System.exit(0);
//                    menuManager(manager);
//                default:
//                    System.out.println("Choice again !");
//            }
//        }
//    }
}
