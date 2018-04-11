package decorator2;

public class BeefDecorator extends BurgerDecorator{
	
	public BeefDecorator(Burger decoratedBurger) {
		super(decoratedBurger);
	}
	
	public String getDescription() {
		return super.getDescription() + "+ beef";
	}
}
