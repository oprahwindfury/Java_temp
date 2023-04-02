import java.util.Scanner;

public class Volume_3d {

    double volume(double r){
        double v;
        v = (4.0/3.0)*(22.0/7.0)*r*r*r;
        return v;
    }
    double volume(double h, double r){
        double v;
        v = (22.0/7.0)*r*r*h;
        return v;
    }
    double volume(double l, double b, double h){
        double v;
        v = l*b*h;
        return v;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r1,h1,r2,l1,b1,h2,v1,v2,v3;
        Volume_3d ob = new Volume_3d();
        System.out.println("Enter radius for sphere.");
        r1 = in.nextDouble();
        System.out.println("Enter height and radius for cylinder.");
        h1 = in.nextDouble();
        r2 = in.nextDouble();
        System.out.println("Enter length, breadth and height of cuboid.");
        l1 = in.nextDouble();
        b1 = in.nextDouble();
        h2 = in.nextDouble();
        v1 = ob.volume(r1);
        v2 = ob.volume(h1,r2);
        v3 = ob.volume(l1,b1,h2);
        System.out.println("Volume of sphere is: " + v1);
        System.out.println("Volume of cylinder is: " + v2);
        System.out.println("Volume of cuboid is: " + v3);
    }
}
