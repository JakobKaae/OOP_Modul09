/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attempt3;

/**
 *
 * @author jakobkaae
 */
public class FoodProduct extends Product {
    
    private String expDate;
    private int temperature;
    
    public FoodProduct (int id, String name, double price, String expDate, int temperature) {
        
        super(id, name, price);
        this.expDate = expDate;
        this.temperature = temperature;
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + super.getName() + " " + expDate;
    }
}
