interface Shape {
    double getPerimeter();
    double getArea();
    String getFillColor();
    String getBorderColor();
    String getName();
}

class Circle implements Shape {
    private String name;
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(String name, double radius, String fillColor, String borderColor) {
        this.name = name;
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

class Rectangle implements Shape {
    private String name;
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(String name, double width, double height, String fillColor, String borderColor) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

class Triangle implements Shape {
    private String name;
    private double side1;
    private double side2;
    private double side3;
    private String fillColor;
    private String borderColor;

    public Triangle(String name, double side1, double side2, double side3, String fillColor, String borderColor) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

public class Figures {
    public static void main(String[] args) {
        Shape circle = new Circle("Круг", 5.0, "Blue", "Green");
        Shape rectangle = new Rectangle("Прямоугольник", 4.0, 6.0, "Blue", "Yellow");
        Shape triangle = new Triangle("Треугольник", 3.0, 4.0, 5.0, "Yellow", "Green");

        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);
    }

    public static void printShapeInfo(Shape shape) {
        System.out.println("Фигура: " + shape.getName());
        System.out.println("Периметр: " + shape.getPerimeter());
        System.out.println("Площадь: " + shape.getArea());
        System.out.println("Цвет фона: " + shape.getFillColor());
        System.out.println("Цвет границ: " + shape.getBorderColor());
        System.out.println();
    }
}