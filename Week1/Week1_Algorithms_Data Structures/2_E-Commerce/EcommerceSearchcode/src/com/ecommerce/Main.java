package com.ecommerce;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(102, "Laptop", "Electronics"),
            new Product(205, "Shirt", "Clothing"),
            new Product(153, "Smartphone", "Electronics"),
            new Product(89, "Book", "Education"),
            new Product(300, "Shoes", "Footwear")
        };

        System.out.println("Linear Search:");
        Product foundLinear = SearchUtils.linearSearch(products, 153);
        System.out.println(foundLinear != null ? foundLinear : "Product not found");

        System.out.println("Binary Search:");
        SearchUtils.sortProducts(products); 
        Product foundBinary = SearchUtils.binarySearch(products, 153);
        System.out.println(foundBinary != null ? foundBinary : "Product not found");
    }
}
