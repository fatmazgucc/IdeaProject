package SimpleClasses;
//This is for course number 108. Student challenge
public class Rectangle {

    public double length= 0;
    public double breadth=0;

    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return  2*(length+breadth);
    }

    public boolean isSquare(){
        return length==breadth ? true:false;
    }

}

 class TestRectangle{

     public static void main(String[] args) {
         Rectangle c = new Rectangle();
         c.length=5.0;
         c.breadth=3.0;
         System.out.println("c area is "+ c.area());
         System.out.println("c perimeter is "+ c.perimeter());
         System.out.println("c isSquare is "+ c.isSquare());

     }
}