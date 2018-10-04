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

public class NonFood extends Product {
    private String matList;
    
    Product prod;
    
    public NonFood (int id, String name, double price, String matList) {
        
        super(id, name, price);
        this.matList = matList;
    }
    
    public String getMaterials() {
        return matList;
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + matList;
        
    
}
    
}
