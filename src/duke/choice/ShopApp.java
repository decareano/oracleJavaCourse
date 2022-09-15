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

        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize("S");

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};

        item1.setDescription("Blue Jacket");
        item1.setPrice((Double) 20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        //this becomes 10....if price > MIN_PRICE ? price : MIN_PRICE
        item2.setPrice((Double) 8.0);
        item2.setSize("S");

        items[2].setDescription("Green Scarf");
        items[2].setPrice((Double) 5.0);
        items[2].setSize("S");

        items[3].setDescription("Blue T-Shirt");
        items[3].setPrice((Double) 10.5);
        items[3].setSize("M");

        int measurement = 6;
        c1.setSize(measurement);
        c1.addItems(items);
        System.out.println("Customer is: " + c1.getName() + ", " + c1.getSize() + ", " + c1.getTotalClothingCost());
        for (Clothing item : c1.getItems()) {

            System.out.println("Items: " + item.getDescription());

        }

    }
}
