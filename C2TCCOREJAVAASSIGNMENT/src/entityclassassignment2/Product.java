package entityclassassignment2;

public class Product {
     private int productid;
     private String productname;
     private int cost;
     private int quantity;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", cost=" + cost + ", quantity="
				+ quantity + "]";
	}
	
     
}
