package factory;

public class ShapeFactory {
//	public static Shape makeShape(String shapeType) {
//		if(shapeType.equals("RECTANGLE")) {
//			return new Rectangle();
//		}else if(shapeType.equals("CIRCLE")) {
//			return new Circle();
//		}else {
//			return null;
//		}
//	}
	//public static Shape makeShae(String shapeType)
	public static Shape makeShape(String shapeType) {
		if(shapeType.equals("RECTANGLE")) {
			return new Rectangle();
		}else if (shapeType.equals("CIRCLE")) {
			return new Circle();
		}else {return null;}
		
	}
}