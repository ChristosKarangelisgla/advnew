package decorator2;

public abstract class BurgerDecorator extends Burger{
	
	protected Burger burgerDecorator;
	
	public BurgerDecorator(Burger burgerDecorator) {
		
		this.burgerDecorator = burgerDecorator;
		
	}
	
	public String getDescription()
	{
		return burgerDecorator.getDescription();
	}
}
