package Opgave2;

public class Main {
    void main() {
        Product product1 = new Product("Laptop", 5999, new String[]{"electronic", "new"});
        Product product2 = new Product("Mouse", 199, new String[]{"electronic", "sale"});
        Product product3 = new Product("Keyboard", 499, new String[]{"electronic", "sale"});
        Product product4 = new Product("Monitor", 2499, new String[]{"electronic"});

        Product[] products = {product1, product2, product3, product4};

        System.out.println("Products on sale");
        for (Product p : products) {
            if (p.hasTags("sale")) {
                p.printInfo();
            }
        }

        System.out.println("\nThe most expensive product");
        Product expensive = findMostExpensive(products);
        expensive.printInfo();
    }

      Product findMostExpensive(Product[] products) {
          Product mostExpensive = products[0];
          for (Product p : products) {
              if (p.price > mostExpensive.price) {
                  mostExpensive = p;
              }
          }
          return mostExpensive;
      }
}
