package decorator2;

public class CheeseDecorator extends BurgerDecorator{

	public CheeseDecorator(Burger decoratedBurger) {
		super(decoratedBurger);
	}
	
	public String getDescription() {
		return super.getDescription() + " + Cheese";
	}
}
