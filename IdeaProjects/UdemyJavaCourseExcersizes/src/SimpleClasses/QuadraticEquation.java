package SimpleClasses;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        int a=0,b=0,c=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a");
        a=sc.nextInt();
        System.out.println("Enter value for b");
        b=sc.nextInt();
        System.out.println("Enter value for c");
        c=sc.nextInt();

        double r1 = (-1*b +( Math.sqrt(b*b - 4*a*c ) ))/(2*a);
        double r2 = (-1*b -( Math.sqrt(b*b - 4*a*c ) ))/(2*a);

        System.out.println("r1 is : "+r1+" r2 is : "+r2);
    }

}
