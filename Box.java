import java.util.Scanner;

abstract class ThreeDObject {
    abstract void volume();
    abstract void surfaceArea();
}

class Box extends ThreeDObject {
    double l, b, h;

    Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    void volume() {
        System.out.println("Volume of Box: " + (l * b * h));
    }

    void surfaceArea() {
        System.out.println("Surface Area of Box: " + 2 * (l * b + b * h + l * h));
    }
}