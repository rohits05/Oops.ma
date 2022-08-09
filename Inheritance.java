
// Inheritance ~ inherit from one generation to the next one
// In other words, if one class wants the property of another class into it!
// Increases the reusability - parent/base class & child/sub class
// types ~ 4 ^ Single-level, Multi-level, hierarchial , Hybrid (combin^), Mutliple/Interfaces.

class Shape {
    String color;
    int l = 12;
    int r = 5;
    int h = 14;

    public void printArea() {
        System.out.println("Displays Area!\n");
    }
}

// Now let's inherit the property of the shape class
// 1.> Single-Level Inheritance ( Child class of Shape )
class Traingle extends Shape {
    // No need to define here as it inherits into it
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

// 2.> Multi-Level Inheritance ( derived from Triangle class )
class EquilateralTriangle extends Traingle {
    public void arae(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

// 3.> Hierarchial Inheritance ( child class of Shape )
class Circle extends Shape {
    public void arae(int r) {
        System.out.println((3.14) * r * r);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Traingle t = new Traingle();
        t.color = "Yellow!";
        System.out.println(t.color);
        t.printArea();

        Circle c = new Circle();
        c.color = "Orange!!";
        System.out.println(c.color);
        c.printArea();
    }
}
