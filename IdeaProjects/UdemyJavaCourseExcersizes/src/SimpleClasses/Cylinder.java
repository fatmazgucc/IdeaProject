package SimpleClasses;
//This is for course number 109. Student challenge
public class Cylinder {

    public double radius=0;
    public double height=0;

    public static double PI = 3.14159;

    public double totalSurfaceArea(){
        return 2*(PI*radius*radius)+ 2*PI*radius*height;
    }
    public double lidArea(){
        return PI*radius*radius;
    }

}
class TestCylinder{
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.height=7;
        c.radius=3;
        System.out.println("c totalSurfaceArea "+c.totalSurfaceArea());
        System.out.println("c lidArea "+c.lidArea());

    }
}