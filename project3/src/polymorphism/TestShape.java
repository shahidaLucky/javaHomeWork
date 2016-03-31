package polymorphism;

public class TestShape {

	public static void main(String[] args) {

     Shape shape = new Shape();
     int triangleResult = shape.areaOfLand(10, 12, 8);
     System.out.println(triangleResult);
     int rectangleResult = shape.areaOfLand(10,12,8,15);
     System.out.println(rectangleResult);
     
     ModernShape modernShape = new ModernShape();
     int modernRectangleResult = modernShape.areaOfLand(10, 12, 8,15);
     System.out.println(modernRectangleResult);

	}

}
