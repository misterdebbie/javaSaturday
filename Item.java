//Item class for savings tracker

public class Item {
 //fields
 private String itemName;
 private double originalPrice;
 private double percentDisco;

//constructor
//@param iName for item name
//@param iPrice for original item price
//@param iDisco for item discount

 public Item(String iName, double iPrice, double iDisco){
  itemName = iName;
  originalPrice = iPrice;
  percentDisco = iDisco;
 }
 //constructor without arguments
 public Item(){
  itemName = " ";
  originalPrice = 0.0;
  percentDisco = 0.0;
 }
 //set the item name
   public void setName(String iName){
     itemName = iName;
   }
   //set the original item price
   public void setPrice(double iPrice){
     originalPrice = iPrice;
   }
   //set the discount
   public void setDiscount(double iDisco){
     percentDisco = iDisco;
   }
   //get the item name
     public String getName(){
       return itemName;
     }
     //get the item price
     public double getItemprice(){
       return originalPrice;
     }
     //get the item discount
     public double getDiscount(){
       return percentDisco;
     }
     //get the total item discount
     public double getTotalDiscount(){
       return originalPrice * percentDisco;
     }
     //get the total discount
     public double getFinalCost(){
       return originalPrice - (originalPrice * percentDisco);
     }

}
