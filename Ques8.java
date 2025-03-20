import java.util.ArrayList;
import java.util.Scanner;


class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

   
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

 
    public void display() {
        System.out.println(name + " - Price: $" + price + " - Quantity: " + quantity);
    }
}

class Store {
    private ArrayList<Product> products;  // Encapsulated list of products

    public Store() {
        products = new ArrayList<>();
    }


    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("\nNo products available in the store.");
            return;
        }

        System.out.println("\nAvailable Products:");
        for (Product product : products) {
            product.display();
        }
    }

     public void editProduct(String productName, double newPrice, int newQuantity) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                product.setPrice(newPrice);
                product.setQuantity(newQuantity);
                System.out.println("Product updated: " + product.getName());
                return;
            }
        }
        System.out.println("Product not found!");
    }

public void deleteProduct(String productName) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equalsIgnoreCase(productName)) {
                System.out.println("Product deleted: " + products.get(i).getName());
                products.remove(i);
                return;
            }
        }
        System.out.println("Product not found!");
    }
}
// Main class to test the Store system
public class Ques8{
    public static void main(String[] args) {
        Store myStore = new Store();
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Display Menu
            System.out.println("\nRetail Store Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Edit Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1: 
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter product price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = sc.nextInt();
                    myStore.addProduct(new Product(name, price, quantity));
                    break;

                    case 2: 
                    System.out.print("Enter product name to edit: ");
                    String editName = sc.nextLine();
                    System.out.print("Enter new price: ");
                    double newPrice = sc.nextDouble();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = sc.nextInt();
                    myStore.editProduct(editName, newPrice, newQuantity);
                    break;