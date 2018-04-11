package visitor2;

public class Violin implements MyElement{
	public int price;
	public String manufacturer;
	public String recommendedStrings;
	public int stockLevel;
	public int getPrice() { return price; }
	
	public Violin (int price, String manufacturer, String recommendedStrings, int stockLevel)
	{
		this.price = price;
		this.manufacturer = manufacturer;
		this.recommendedStrings = recommendedStrings;
		this.stockLevel = stockLevel;
	}
	public void accept(MyVisitor visitor) {
		
		visitor.visit(this);
	}
}
