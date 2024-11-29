public class Main {
    public static void main(String[] args) {

        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(10,15);
        Triangle triangle = new Triangle(10, 12, 15);

        Shape[] shapes = {square, rectangle, triangle};
        ShapeCollection shapeCollection = new ShapeCollection(shapes);
        shapeCollection.getPropertyValues();
    }
}