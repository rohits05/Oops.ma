// Creating Blue Prints of pen 
class Pen {
    // Defining properties of pen
    String name;
    String color;
    String type; // ballpoint; gel

    // Defining functions/methods of pen
    public void write() {
        System.out.println("`Writing Smoothly!");
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void printType() {
        System.out.println(this.type); // this keyword ~ which object has called this fn.
    }

    public void select() {
        System.out.println("\nSpecialty of " + this.name + " is: ");
    }
}

class Student {
    String name;
    String age;

    public void printInfo() {
        System.out.println("Student name is: " + this.name);
        System.out.println("Age is: " + this.age);
    }

    // Student() {
    // System.out.println("Constructor called.....");
    // }

    // Types of constructors __________________________-
    // 1.> Java automatically creates a constrcutor by default itself

    // 2.> Creating constructor by ourselves ~ parameterized constructor
    // Student(String name, String age) { // assigning to object
    // this.name = name; // Obj & constructor paras' one
    // this.age = age;
    // }

    // 3.> Copy Constructor --- Copies the properties of a student into it
    // Student(Student s5)[
    // this.name = s5.name;
    // this.age = s5.age;
    // ]

    // Student() { -- Need to define the main student constructor of that object s1
    // {In case of Copy constructor}
    // }
}

// Objects of the respective Classes is defined inside main function
public class Oops {
    public static void main(String[] args) {

        Pen pen1 = new Pen(); // Creating our first ever pen from pen class
        pen1.color = "'Green'"; // Here we're setting the desired property values of our pen
        pen1.type = "'Gel-pen'";
        pen1.name = "Cello-Butterflow";

        Pen pen2 = new Pen();
        pen2.color = "'Black'";
        pen2.type = "'Ballpoint'";
        pen2.name = "Ivoc";

        pen1.write(); // Performing the methods of our prn
        // System.out.println(pen1.color);
        // System.out.println(pen1.type);
        pen1.select();
        pen1.printColor();
        pen1.printType();

        pen2.select();
        pen2.printColor();
        pen2.printType();

        // new keyword ~ Allocate object space inside heap memory
        // Student() ~ A special type of fn.. daak-naam "constructor" (of 3 types )
        // having name as same as that of class name - doesnot return anything ~ only
        // constructs an object__
        // Props ____ For an object only one constructor can be called (at Creation
        // time)

        Student s1 = new Student();
        s1.name = "Chetan";
        s1.age = "18";

        Student s2 = new Student();
        s2.name = "Rohit";
        s2.age = "21";

        s1.printInfo();
        s2.printInfo();

        // Student s3 = new Student("Krish","05"); -- parameterized constructor
        // s3.printInfo();

        // Student s5 = new Student(s2); -- copy constructor (assigning props of s1
        // into student s5)
        // s5.printInfo();
    }
}