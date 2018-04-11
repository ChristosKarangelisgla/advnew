package decorator2;

public class Test {
	public static void main(String[] args) {
		
		Burger burger = new CheeseDecorator(new BeefDecorator(new BasicBurger()));
		
		System.out.println(burger.getDescription());
		
	}
}
