/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;




import java.io.*;
import java.text.NumberFormat;
import java.util.*;



public class Clothing {
    // the setters make the variable private????
    private String description;
    private Double price;
    private String size = "M";
    public final double MIN_PRICE = 10.0;
    public final double TAX = 0.2;


//    public void measure(int value) {
//        size = (value < 10) ? "S" : "M";
//    }
//    
//    public String getSize() {
//        return size;
//    }
//    
//   public void setPrice(double newPrice){
//       price1 = (newPrice > MIN_PRICE) ? newPrice : MIN_PRICE;
//   }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        // to calculate tax. see syntax below
        // price + the tax
        // other expression is: price * (1 + TAX)
        return price;
    }

    public void setPrice(Double price) {
        
          
        this.price = (price > MIN_PRICE ? price : MIN_PRICE);
        
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
