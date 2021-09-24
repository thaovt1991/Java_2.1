package week3.java_collection_famework.product.arraylist;

import java.util.Comparator ;

public class PriceAscendingComparator implements Comparator<Product>{
    @Override
    public int compare(Product productOne, Product productTwo) {
        if (productOne.getPrice() > productTwo.getPrice()) {
            return -1;
        } else if (productOne.getPrice() == productTwo.getPrice()) {
            return 0;
        } else {
            return 1;
        }
    }

}
