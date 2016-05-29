import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by User on 07.04.2016.
 */
public class Rectangle extends Shape implements Cloneable{
    private Point leftTop;// = new Point();
    private Point rightBottom;// = new Point();

    public Rectangle(Point leftTop, Point rightBottom) {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    public Rectangle(double left, double top, double right
            , double bottom){
        this.leftTop = new Point(left,top);
        this.rightBottom = new Point( right , bottom );
    }

    @Override
    public void move(double dx, double dy) {
        leftTop.setX( leftTop.getX() + dx);
        leftTop.setY( leftTop.getY() + dy);
        rightBottom.setX( rightBottom.getX() + dx);
        rightBottom.setY( rightBottom.getY() + dy);
    }

    @Override
    public double perimeter() {
        return 2.*(Math.abs(rightBottom.getX() - leftTop.getX()) +
                Math.abs(rightBottom.getY() - leftTop.getY()));
    }

    @Override
    public double square() {
        return Math.abs((rightBottom.getX() - leftTop.getX())*
                (rightBottom.getY() - leftTop.getY()));
    }

    public Point getRightBottom() {
        return rightBottom;
    }

    public void setRightBottom(Point rightBottom) {
        this.rightBottom = rightBottom;
    }

    public Point getLeftTop() {
        return leftTop;
    }

    public void setLeftTop(Point leftTop) {
        this.leftTop = leftTop;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            Rectangle temp = (Rectangle) super.clone();
            temp.leftTop = (Point) this.leftTop.clone();
            temp.rightBottom = (Point) this.rightBottom.clone();
            return temp;
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "leftTop=" + leftTop +
                ", rightBottom=" + rightBottom +
                '}';
    }
}
