class Product {
    int productId;
    String productName;
    double price;
    void inputProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        productId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        productName = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }
    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
}
class Electronics extends Product {
    int warrantyPeriod;
    void inputElectronics() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Warranty (months): ");
        warrantyPeriod = sc.nextInt();
    }
    void displayElectronics() {
        displayProduct();
        System.out.println("Warranty: " + warrantyPeriod + "
            months ");
        }
    }
    class Clothing extends Product {
        String size, fabricType;
        void inputClothing() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Size: ");
            size = sc.nextLine();
            System.out.print("Enter Fabric Type: ");
            fabricType = sc.nextLine();
        }
        void displayClothing() {
            displayProduct();
            System.out.println("Size: " + size);
            System.out.println("Fabric Type: " + fabricType);
        }
    }
    public class Main2 {
        public static void main(String[] args) {
            Electronics e = new Electronics();
            Clothing c = new Clothing();
            System.out.println("\nEnter Electronics Details:");
            e.inputProduct();
            e.inputElectronics();
            System.out.println("\nEnter Clothing Details:");
            c.inputProduct();
            c.inputClothing();
            System.out.println("\nElectronics Details:");
            e.displayElectronics();
            System.out.println("\nClothing Details:");
            c.displayClothing();
        }
    }
