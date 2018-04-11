package composite5;

public class FileTest {
	public static void main(String[] args) {
		
		Programme mscit = new Programme("mscit");
		mscit.addComponent(new Course("Machine Learning", 20));
		mscit.addComponent(new Course("Adv Prog", 20));
		
		Programme research = new Programme("Research and Readings");
		mscit.addComponent(research);
		research.addComponent(new Course("Information", 5));
		research.addComponent(new Course("Human Computer", 5));
		
		System.out.println(mscit.description());
		System.out.println(mscit.getCredits());
		
	}
}