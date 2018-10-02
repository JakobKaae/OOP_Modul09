
public class Shopping {

    public static void main(String[] args) {
        Product product;
        ProductDatabase prodDatabase;

        product = new Product(13, "Milkshake", 20.75);
        Product product2 = new Product(24, "Heroin", 0.95);
        prodDatabase = new ProductDatabase();

        prodDatabase.addProduct(product);
        prodDatabase.addProduct(product2);

        //Linebreak method
        String newLine = System.getProperty("line.separator");

        //Print out current inventory and total
        System.out.println("Current inventory " + prodDatabase + newLine + prodDatabase.getTotalPrice());

        //Illustrating action
        System.out.println("Removing...");

        prodDatabase.removeProduct(13);

        //Print out new inventory and total
        System.out.println("New total inventory " + prodDatabase + newLine + prodDatabase.getTotalPrice());

    }

}
