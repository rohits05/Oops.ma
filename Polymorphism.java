// Polymorphism ~ having many forms ..
// Doing one thing in many ways!
// Types ~ Fn. Overloading & fn. Overriding
// 1> Compile time PMPS .. 2> Run time PmPS

class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println("Hyy! My name is: " + name);
    }

    public void printInfo(int age) {
        System.out.println("Buddy, my age is: " + age);
    }

    public void printInfo(String name, int age) {
        System.out.println("My name is: " + name + " and I'm " + age + " yrs old.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rudra";
        s1.age = 5;
        s1.printInfo(s1.name, s1.age);

        Student s2 = new Student();
        s2.printInfo("Krish");

        Student s3 = new Student();
        s3.printInfo(19);
    }
}
