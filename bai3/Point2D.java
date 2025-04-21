package bai3;
public class Point2D {
    private float x;
    private float y;

    public Point2D() {
        x = 0;
        y = 0;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point2D cong(Point2D p) {
        return new Point2D(this.x + p.x, this.y + p.y);
    }

    public Point2D doiXungHoanh() {
        return new Point2D(this.x, -this.y);
    }

    public void xuatToaDo() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
    Point2D p1 = new Point2D(2, 5);
    Point2D p2 = new Point2D(3, -4);

    System.out.print("Điểm 1: ");
    p1.xuatToaDo();

    System.out.print("Điểm 2: ");
    p2.xuatToaDo();

    Point2D tong = p1.cong(p2);
    System.out.print("Tổng: ");
    tong.xuatToaDo();

    Point2D dx = p1.doiXungHoanh();
    System.out.print("Điểm đối xứng p1 qua trục hoành: ");
    dx.xuatToaDo();
}

    }

