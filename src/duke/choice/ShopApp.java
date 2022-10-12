/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

/**
 *
 * @author mgobelli
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to Duke Choice Shop");
        //moved tax and total to Customer
//        double tax = 0.2;
//        double total = 0.0;

        System.out.println("Min Price: " + Clothing.MIN_PRICE);

        Customer c1 = new Customer("Pinky", 3);
        //c1.setName("Pinky");
        //c1.setSize("S");

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 8.0, "S");

        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5.0, "S"), new Clothing("Blue T-Shirt", 10.5, "M")};
        
        int measureament = 8;
        
        c1.addItems(items);
        System.out.println("Customer is" + c1.getName() + "." + c1.getSize() + "." + c1.getTotalClothingCost());

        
                
        for (Clothing item : c1.getItems()) {

            System.out.println("Items" + item.getDescription() + "." + item.getSize() + "." + item.getPrice());

        }
        int average = 0;
        int count = 0;
        
        for (Clothing item : c1.getItems()) {

            count++;
            average += item.getPrice();

        }
        average = average / count;
        System.out.println("Average price" + average + "Count " + count);

       

    }
}
