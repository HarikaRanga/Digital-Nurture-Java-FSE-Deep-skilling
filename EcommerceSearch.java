import java.util.ArrayList;
import java.util.List;

class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void display() {
        System.out.println("ID: " + productId +
                ", Name: " + productName +
                ", Price: ₹" + price);
    }
}

public class EcommerceSearch {

    // Linear Search Method
    public static Product linearSearch(List<Product> products, String name) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product(101, "Laptop", 55000));
        products.add(new Product(102, "Mobile", 25000));
        products.add(new Product(103, "Headphones", 3000));
        products.add(new Product(104, "Smart Watch", 5000));
        products.add(new Product(105, "Keyboard", 1500));

        String searchItem = "Mobile";

        Product result = linearSearch(products, searchItem);

        if (result != null) {
            System.out.println("Product Found:");
            result.display();
        } else {
            System.out.println("Product Not Found");
        }
    }
}