public interface Drawable {
    void draw();
}
public class Circle implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }
}
public class Rectangle implements Drawable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with width: " + width + " and height: " + height);
    }
}

public class DrawableTest
    public static void main(String[] args) {
        Drawable circle = new Circle(7.5);
        Drawable rectangle = new Rectangle(10, 5);

        circle.draw();
        rectangle.draw();
    }
}
