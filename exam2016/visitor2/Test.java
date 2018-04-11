package visitor2;

public class Test {

	public static void main(String[] args) {
		
		Trumpet trumpet = new Trumpet(1000, 30);
		
		Violin violin = new Violin(2000, "Mark", "Medium", 20);
		
		DisplayInfoVisitor displayInfo = new DisplayInfoVisitor();
		
		violin.accept(displayInfo);
		violin.accept(new DisplayInfoVisitor());
		
		trumpet.accept(displayInfo);
	}
}
