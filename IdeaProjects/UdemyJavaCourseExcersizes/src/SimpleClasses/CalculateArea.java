package SimpleClasses;

import java.util.Scanner;

public class CalculateArea {

    public static void main(String[] args) {

        int h=0,b=0,x=0,y=0,z=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter eight of first triangle");
        h=sc.nextInt();
        System.out.println("Enter width of first triangle");
        b=sc.nextInt();
        System.out.println("Area of first triangle is "+(h*b)/2);

        System.out.println("");

        System.out.println("Enter first edge of second triangle");
        x=sc.nextInt();
        System.out.println("Enter second edge of second triangle");
        y=sc.nextInt();
        System.out.println("Enter third edge of second triangle");
        z=sc.nextInt();

        int s=(x+y+z)/2;
        double area = Math.sqrt(s*(s-x)*(s-y)*(s-z));

        System.out.println("Enter first edge of second triangle"+area);


    }

}
