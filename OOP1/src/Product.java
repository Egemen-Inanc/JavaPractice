
public class Product {
   private String name;
   private double unitPrice;
   private double discount;
   private String imageURL;
   private int unitsInStock;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
}
public double getDiscount() {
	return discount;
}
public void setDiscount(double discount) {
	this.discount = discount;
}
public String getImageURL() {
	return imageURL;
}
public void setImageURL(String imageURL) {
	this.imageURL = imageURL;
}
public int getUnitsInStock() {
	return unitsInStock;
}
public void setUnitsInStock(int unitsInStock) {
	this.unitsInStock = unitsInStock;
}
public void display(){
	System.out.println("Product name: "+this.getName());
	System.out.println("Unit Price: "+this.getUnitPrice());
	System.out.println("Applied discount rate: "+this.getDiscount());
	System.out.println("Current stock: "+this.getUnitsInStock());
	System.out.println("Image: "+this.getImageURL());
}
   
   
}
