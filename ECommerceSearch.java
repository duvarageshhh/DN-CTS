import java.util.Arrays;

public class ECommerceSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Main Method for Testing
    public static void main(String[] args) {
        Product[] productArray = {
            new Product(101, "Laptop", "Electronics"),
            new Product(203, "Shoes", "Fashion"),
            new Product(155, "Book", "Education"),
            new Product(302, "Watch", "Accessories")
        };

        // Linear Search
        System.out.println("Linear Search:");
        Product found1 = linearSearch(productArray, 155);
        System.out.println(found1 != null ? found1 : "Product not found");

        // Sort for Binary Search
        Arrays.sort(productArray);

        // Binary Search
        System.out.println("\nBinary Search:");
        Product found2 = binarySearch(productArray, 155);
        System.out.println(found2 != null ? found2 : "Product not found");
    }
}
