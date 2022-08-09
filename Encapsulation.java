// Encapsualtion ~ encapsulating data and its fn's. inside a unit
// Properties and methods
// Concept of data hiding _ achievbed by access modidier
// Data hiding is the process of protecting members of class from unintended chamges
class Animal {
    String name;
    int legs = 4;

    public void walk() {
        System.out.println("Animal " + this.name + " is walking..");
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.name = "Chunnu";
        System.out.println(ani.name);
        ani.walk();
    }
}
