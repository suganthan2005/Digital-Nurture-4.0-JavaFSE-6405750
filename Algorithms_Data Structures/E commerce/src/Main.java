import java.util.Arrays;
import java.util.Comparator;

public class Main {

    // Product class
    static class Product {
        int productId;
        String productName;
        String category;

        public Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }

        public String toString() {
            return "[" + productId + ", " + productName + ", " + category + "]";
        }
    }

    // Linear Search
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search (array must be sorted by productName)
    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int comparison = products[mid].productName.compareToIgnoreCase(targetName);

            if (comparison == 0) return products[mid];
            else if (comparison < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    // Main method to test both searches
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Footwear"),
                new Product(103, "Phone", "Electronics"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Shirt", "Clothing")
        };

        // Linear Search Example
        String searchTarget1 = "Phone";
        Product result1 = linearSearch(products, searchTarget1);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Product not found"));

        // Sort the array for Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // Binary Search Example
        String searchTarget2 = "Watch";
        Product result2 = binarySearch(products, searchTarget2);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Product not found"));
    }
}