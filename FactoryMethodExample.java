public class FactoryMethodExample {

    // Product Interface
    interface Shape {
        void draw();
    }

    // Concrete Products
    static class Circle implements Shape {
        public void draw() {
            System.out.println("Drawing Circle");
        }
    }

    static class Rectangle implements Shape {
        public void draw() {
            System.out.println("Drawing Rectangle");
        }
    }

    // Factory Class
    static class ShapeFactory {
        public Shape getShape(String shapeType) {
            if (shapeType == null) {
                return null;
            }

            if (shapeType.equalsIgnoreCase("CIRCLE")) {
                return new Circle();
            } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
                return new Rectangle();
            }

            return null;
        }
    }

    // Main Method
    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = factory.getShape("RECTANGLE");
        shape2.draw();
    }
}