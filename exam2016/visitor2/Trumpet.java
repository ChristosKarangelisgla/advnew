package visitor2;

public class Trumpet implements MyElement{
	public int price;
	public int stockLevel;
	public int getPrice() { return price; }
	
	public Trumpet(int price,int stockLevel) {
		this.price = price;
		this.stockLevel = stockLevel;
	}
	
	public void accept(MyVisitor visitor) {
		visitor.visit(this);
	}
}
