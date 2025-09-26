package prog;
class Item{
	private String itemName;
	private String itemidNo;
	private int itemQuantity;
	private double itemPrice;
	
	public String getitemName() {// getter
		return this.itemName;
	}
	
	public String getitemidNo() {// getter
		return this.itemidNo;
	}
	
	public int getitemQuantity() {// getter
		return this.itemQuantity;
	}
	
	public double getitemPrice() {// getter
		return this.itemPrice;
	}
	
	public void setitemName(String itemName) {
		this.itemName = itemName;
	}
	
	public void setitemidNo(String itemidNo) {
		this.itemidNo = itemidNo;
	}
	
	public void setitemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	public void setitemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	// constructor with 4 fields
	public Item(String itemName,String itemidNo,int itemQuantity,double itemPrice) {
		this.itemName = itemName;
        this.itemidNo = itemidNo;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
	}
	// constructor with 3 fields
	public Item(String itemName,String itemidNo,int itemQuantity) {
		this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.itemidNo = itemidNo;
        this.itemPrice = 500.0; // Default initialization
	}
	// constructor with 2 fields
	public Item(String itemName,String itemidNo) {
		this.itemName = itemName;
		this.itemidNo = itemidNo;
		this.itemPrice = 500;
		this.itemQuantity = 1;
	}
	
	public void displayItemDetails() {
        System.out.println("  Name: " + itemName + " (ID: " + itemidNo + ")");
        System.out.println("  Quantity: " + itemQuantity);
        System.out.println("  Price: $" + String.format("%.2f", itemPrice));
        System.out.println("---------------------------------");
    }
}
public class Third {
	public static void main(String[] args) {
		Item item1 = new Item("Laptop Charger", "LC-450", 5, 25.99);
		item1.displayItemDetails();
		
		Item item2 = new Item("Bluetooth Speaker", "BS",2);
        System.out.println("Item B: 3 Fields Init (Price should be 500.0, Qty: 2)");
        item2.displayItemDetails();
        
        Item item3 = new Item("USB-C Cable", "UC-200");
        System.out.println("Item C: 2 Fields Init (Price: 500.0, Qty: 1)");
        item3.displayItemDetails();
        
        item3.setitemPrice(9.99);
        System.out.println("Item C Price Updated using Setter:");
        item3.displayItemDetails();
	}

}
