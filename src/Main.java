public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	Point point = new Point(1,1);
    Point point2 = point.clone();
    System.out.println(point);
    System.out.println(point2);
    Circle circle = new Circle(point,5);
    Circle circle1 = (Circle) circle.clone();
    System.out.println(circle);
    System.out.println(circle1);
    circle.setCenterCircle(new Point(0,0));
    System.out.println("Changing CeterCircle in the Point (1,1) -> (0,0)");
    System.out.println(circle1);
    System.out.println(circle);
    Rectangle rectangle = new Rectangle(new Point(1,2), new Point(7,0));
    Rectangle rectangle1 = (Rectangle) rectangle.clone();
    System.out.println(rectangle);
    System.out.println(rectangle1);
    rectangle.setRightBottom(new Point(0,7));
    System.out.println("Changing RightBottom in the rectangle1 (7,0) -> (0,7)");
    System.out.println(rectangle);
    System.out.println(rectangle1);

    }
}
