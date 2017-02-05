//Item class for savings tracker

public class Item {
 //declare instance fields
 private String itemName;
 private double originalPrice;
 private double percentDisco;

//constructor
//@param itemName for item name
//@param originalPrice for original item price
//@param percentDisco for item discount

 public Item(String itemName, double originalPrice, double percentDisco){
  this.itemName = itemName;
  this.originalPrice = originalPrice;
  this.percentDisco = percentDisco;
 }
 //constructor without arguments
 public Item(){
  itemName = " ";
  originalPrice = 0.0;
  percentDisco = 0.0;
 }
 //set the item name
   public void setName(String itemName){
     this.itemName = itemName;
   }
   //set the original item price
   public void setPrice(double originalPrice){
     this.originalPrice = originalPrice;
   }
   //set the discount
   public void setDiscount(double percentDisco){
     this.percentDisco = percentDisco;
   }
   //get the item name
     public String getName(){
       return this.itemName;
     }
     //get the item price
     public double getItemprice(){
       return this.originalPrice;
     }
     //get the item discount
     public double getDiscount(){
       return this.percentDisco;
     }
     //get the total item discount
     public double getTotalDiscount(){
       return this.originalPrice * this.percentDisco;
     }
     //get the total discount
     public double getFinalCost(){
       return this.originalPrice - (this.originalPrice * this.percentDisco);
     }

}
