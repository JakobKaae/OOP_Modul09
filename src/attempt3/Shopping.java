package attempt3;


public class Shopping {

    public static void main(String[] args) {
        Product product;
        ProductDatabase prodDatabase;
        NonFood nonFoods;
        FoodProduct foodprod;

        //Create product
        product = new Product(13, "Milkshake", 20.75);
        Product product2 = new Product(24, "Heroin", 0.95);
        //Create nonfood product
        NonFood nonFood = new NonFood (20, "Hammer", 10, "Pussy and drugs");
        NonFood nonFood2 = new NonFood (21, "Keyboard", 200, "Electronics and shit");
        //Create food product
        FoodProduct food = new FoodProduct (04, "Butter", 3.75, "23/12/2018", 5);
        
        //Initialize ProductDatabase
        prodDatabase = new ProductDatabase();
        
        //Add products
        prodDatabase.addProduct(product);
        /*prodDatabase.addProduct(product2);
        prodDatabase.addProduct(nonFood);
        prodDatabase.addProduct(nonFood2);
        prodDatabase.addProduct(food);*/

        //Linebreak method
        String newLine = System.getProperty("line.separator");

        //Print out current inventory and total
        System.out.println("Current inventory \n" + prodDatabase + "\nCurrent total: " + 
                prodDatabase.getTotalPrice() + "\n");

        //Illustrating action
        System.out.println("Removing... \n");

        prodDatabase.removeProduct(13);

        //Print out new inventory and total
        System.out.println("New total inventory \n" + prodDatabase + 
                "\nTotal price: " + prodDatabase.getTotalPrice() + "\n");
        
        //Print out NonFood
        System.out.println("Nonfoods: \n" + nonFood + "\n" + nonFood2 + "\n");
        
        //Print out food
        System.out.println("Foods: \n" + food + "\n");

    }

}
