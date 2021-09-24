package week3.java_collection_famework.product.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.* ;

public class ProductManager {
    public ArrayList<Product> productList;

    public ProductManager() {
       ArrayList<Product> productList =  new ArrayList<>() ;
       this.productList = productList;
    }


    public boolean isHaveProductList(Product product) {
        if (!productList.isEmpty()) {
            for (Product p : productList) {
                if (p == product) return true;
            }
        }
        return false;
    }

    public boolean isIdInProductList(int id) {
        if (!productList.isEmpty()) {
            for (Product p : productList) {
                if (p.getId() == id) return true;
            }
        }
        return false;
    }

    public boolean isNameInProductList(String name) {
        if (!productList.isEmpty()) {
            for (Product p : productList) {
                if (p.getName().equalsIgnoreCase(name)) return true;
            }
        }
        return false;
    }

    public void addProductList() {
        String name;
        int id;
        double price;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Product name : ");
            name = input.nextLine();
            if (isNameInProductList(name))
                System.out.println("Product name had in the Product list");
        }
        while (isNameInProductList(name));
        do {
            System.out.print("Product id : ");
            id = input.nextInt();
            if (isIdInProductList(id)) {
                System.out.println("Id had in the Product list");
            }
        } while (isIdInProductList(id));

        System.out.print("Product price : ");
        price = input.nextDouble();
        Product newProduct = new Product(name, id, price);
        productList.add(newProduct);
    }

    public void setProductInProductListWithId() {
        if (productList.isEmpty()) {
            System.out.println("There are no products in the list !");
        } else {
            Scanner input = new Scanner(System.in);
            System.out.print("Product id need edit : ");
            int id = input.nextInt();
            if (isIdInProductList(id)) {
                for (Product product : productList) {
                    if (product.getId() == id) {
                        System.out.println("Product have id is " + id + " : " + product);
                        char choice;
                        do {
                            System.out.println("Menu edit Product ");
                            System.out.println(" 1. Edit name Product ");
                            System.out.println(" 2. Edit id Product ");
                            System.out.println(" 3. Edit price Product ");
                            System.out.println(" 0 . Exit");
                            System.out.println("--------------------------------");
                            Scanner scanner = new Scanner(System.in);
                            choice = scanner.nextLine().charAt(0);
                            switch (choice) { // can lam cac dk quay lai neu ko muon
                                case '1':
                                    System.out.print("New name : ");
                                    String newName = scanner.nextLine();
                                    product.setName(newName);
                                    break;
                                case '2':
                                    System.out.print("New Id : ");
                                    int newID = scanner.nextInt();
                                    product.setId(newID);
                                    break;
                                case '3': // chua lam dieu kien nhap tien dung
                                    System.out.print("New Price : ");
                                    int newPrice = scanner.nextInt();
                                    product.setPrice(newPrice);
                                    break;
                                case '0':
                                    menuManager();
                                    break;
                                default:
                                    System.out.println("Lets choice follow Menu! ");
                            }
                        } while (choice != 0);
                    }
                }
            } else System.out.println("Id have not in Product list");
        }
    }

    public void deleteProductInProductListWithId() {
        if (productList.isEmpty()) {
            System.out.println("There are no products in the list !");
        } else {
            Scanner input = new Scanner(System.in);
            System.out.print("Product id need remove : ");
            int id = input.nextInt();
            if (isIdInProductList(id)) {
                for (Product product : productList) {
                    if (product.getId() == id) {
                        System.out.println("Product remove is " + product.toString());
                        productList.remove(product);
                    }
                }
            } else System.out.println("Id have not in Product list");
        }
    }

    public void displayProduct() {
        if (productList.isEmpty()) {
            System.out.println("There are no products in the list !");
        } else {
            int i = 1;
            for (Product product : productList) {
                System.out.println(i + ". " + product.toString());
                i++;
            }
        }
    }

    public void findProductInProductListWithName() {
        if (productList.isEmpty()) {
            System.out.println("There are no products in the list !");
        } else {
            Scanner input = new Scanner(System.in);
            System.out.print("Product name need find : ");
            String name = input.nextLine();
            if (isNameInProductList(name)) {
                for (Product product : productList) {
                    if (product.getName().equalsIgnoreCase(name)) {

                    }
                }
            } else System.out.println("Name have not in the Product list !");
        }
    }

    public void sortWithPriceDecrease() {
        if (productList.isEmpty()) {
            System.out.println("There are no products in the list !");
        } else {
            PriceDecreaseComparator priceDecreaseComparator = new PriceDecreaseComparator();
            Collections.sort(productList, priceDecreaseComparator);
            System.out.println("Product list decrease with Price");
            int i = 1;
            for (Product product : productList) {
                System.out.println(i + ". " + product.toString());
                i++;
            }
        }
    }

    public void sortWithPriceAscending() {
        if (productList.isEmpty()) {
            System.out.println("There are no products in the list !");
        } else {
            PriceAscendingComparator priceAscendingComparator = new PriceAscendingComparator();
            Collections.sort(productList, priceAscendingComparator);
            System.out.println("Product list ascending with Price");
            int i = 1;
            for (Product product : productList) {
                System.out.println(i + ". " + product.toString());
                i++;
            }
        }
    }
    public void menuManager(){
        char choice = '?';
        while (choice != '0') {
            System.out.println("Menu Product Manager");
            System.out.println("1. Add product");
            System.out.println("2. Edit product with id ");
            System.out.println("3. Delete product with id ");
            System.out.println("4. Display products list");
            System.out.println("5. Sort in ascending order of price");
            System.out.println("6 . Sort in decrease order of price");
            System.out.println("0. Exit program");
            System.out.println("--------------------------------------------");
            System.out.print("choice :");
            Scanner change = new Scanner(System.in);
            choice = change.nextLine().charAt(0);
            switch (choice) {
                case '1':
                   addProductList();
                    break;
                case '2':
                   setProductInProductListWithId();
                    break;
                case '3':
                    deleteProductInProductListWithId();
                    break;
                case '4':
                   displayProduct();
                    break;
                case '5':
                   sortWithPriceAscending();
                    break;
                case '6':
                    sortWithPriceDecrease();
                    break;
                case '0':
                    System.exit(0);
                default:
                    System.out.println("Choice again !");
            }
        }
    }

}