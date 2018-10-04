package attempt3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ProductDatabase 
{
    //Create empty list which can only contain objects from the Product class
    List<Product> productList = new ArrayList<>();
    
    
    //Create constructor
    public ProductDatabase() {}
    
    public String getList() 
    {
        return productList.toString();
    }
    
    //Create addProduct method
    public void addProduct (Product prod) {
        productList.add(prod);
        /*
        //Create new ArrayList called tempList
        List<Product> tempList = new ArrayList<>(productList.size()+1);
        //Copy array to tempList
        System.arraycopy(productList, 0, tempList, 0, productList.size());
        //Sets tempList equal prod argument
        tempList.set(tempList.size()-1, prod);
        //Sets productList equal to tempList
        productList = tempList;
        */
    }
    
    //Create remove method based in id
    public void removeProduct (int id) {
        //Create iterator of Product equal to inventory iterator
        Iterator<Product> ite = productList.iterator();
        
        //While loop with iterator to check for a next
        while(ite.hasNext()) {
            //Make iterator go to next
            Product prod = ite.next();
            
            //If the next id equals target id...
            if (prod.getId() == id) {
                
                //... remove it
                ite.remove();
            }
        }
        
        //For each loop through productList for every product object of Project type
        /*for (Product prod : productList) {
          *  if (prod.getId() == id) {
           *    
                productList.remove(prod);
            }
        }*/
    }

    //Create new toString method for showing inventory
    @Override
    public String toString(){
        
        String print = "";
        for (Product prod : productList) {
            print += prod.toString() + "\n";
        }
        return print;
    }
    
    //Create method to get total price
    public double getTotalPrice() {
        
        //Create manipulative variable
        double totalPrice = 0;
        
        //Create for loop with variable to add
        for (Product prod : productList) {
            
            totalPrice += prod.getPrice();            
        }
        return totalPrice;
    }
    
    
    
    
}
