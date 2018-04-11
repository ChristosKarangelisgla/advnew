package visitor2;

public class DisplayInfoVisitor implements MyVisitor{

	public void visit(Trumpet trumpet) {
		System.out.println(" " + trumpet.price + " " + trumpet.stockLevel);
	} 
	
	public void visit(Violin violin) {
		
		System.out.println(" " + violin.price + " " + violin.stockLevel + " " + violin.manufacturer + " " + violin.recommendedStrings );
	}
}
