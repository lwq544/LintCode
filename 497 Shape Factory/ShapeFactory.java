/**
 * Created by Silocean on 2016-04-19.
 */
public class ShapeFactory {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("Triangle");
        if (shape != null) shape.draw();
    }

    /**
     * @param shapeType a string
     * @return Get object of type Shape
     */
    public static Shape getShape(String shapeType) {
        if (shapeType.equals("Square")) {
            return new Square();
        } else if (shapeType.equals("Triangle")) {
            return new Triangle();
        } else if (shapeType.equals("Rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}

/**
 * Your object will be instantiated and called as such:
 * ShapeFactory sf = new ShapeFactory();
 * Shape shape = sf.getShape(shapeType);
 * shape.draw();
 */
interface Shape {
    void draw();
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println(" ---- ");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println(" ---- ");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("  /\\");
        System.out.println(" /  \\");
        System.out.println("/____\\");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println(" ---- ");
        System.out.println("|    |");
        System.out.println(" ---- ");
    }
}