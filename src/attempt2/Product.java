public class Product
{
    //Create attributes for every product inherited by this class
    private int id;
    private String name;
    private double price;
    
    //Create constructors       
    public Product (int id, String name, double price) {
        
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    
    //Create get-Methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    //toString method to show inventory
    public String toString(){
        return "ID: " + id + " name: " + name +  " Price: " + price;
    }
    
    
    
}
