package SimpleClasses;

import java.util.Scanner;

public class Cuboid {

    public static void main(String[] args) {

        double height =0 , length=0, breadth=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for height");
        height=sc.nextDouble();
        System.out.println("Enter value for length");
        length=sc.nextDouble();
        System.out.println("Enter value for breadth");
        breadth=sc.nextDouble();

        double totalArea = 2*(height*length + length*breadth+height*breadth);
        double volume = height*length*breadth;

        System.out.println("total area is "+totalArea+" volume is "+volume);

    }

}
