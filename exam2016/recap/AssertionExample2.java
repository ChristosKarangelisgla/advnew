package recap;

public class AssertionExample2 {
	private int myInt;
	public AssertionExample2(int n) {
		myInt = n;
	}
	public void decrement(int d) {
		assert myInt >= d;
		myInt = myInt - d;
	}
	
	public int getInt() {
		return myInt;
	}
	public static void main(String[] args) {
		AssertionExample2 lol = new AssertionExample2(5);
		lol.decrement(10);
		System.out.println(lol.getInt());
	}
}