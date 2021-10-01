package week4.io_byrari_seri.ex_product_manager;

import java.io.Serializable;
import java.text.DecimalFormat;

public class Product implements Serializable {
    private int id;
    private String nameProduct ;
    private String manufacturer ;
    private int price ;
    private String otherDescription ;

    public Product(int id, String name, String manufacturer,int price, String otherDescription){
          this.id = id ;
          this.nameProduct = name;
          this.manufacturer = manufacturer ;
          this.price = price;
          this.otherDescription = otherDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    @Override
    public String toString() {
        DecimalFormat formater = new DecimalFormat("###,###,###");
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" +formater.format(price) + " VND"  +
                ", otherDescription='" + otherDescription + '\'' +
                '}';
    }
}
