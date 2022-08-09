// Abstraction ~ is hiding the implementation details and showing only important/useful parts to the users.
// Use abstract keyword to achieve it!

// Im-pure abstraction -------------------------
abstract class Animals { // A concept but in reality animals will be diff.
    abstract void walk(); // A fn/concept that exists in diff. animals

    Animals() { // Constructor into it
        System.out.println("You're creating a new animal..");
    }

    public void eat() {
        System.out.println("Animal eats..!");
    }
}

class Horse extends Animals {
    Horse() {
        System.out.println("Created a horse..");
    }

    public void walk() {
        System.out.println("Chal mrere Ghode tik-tik-tik..");
    }
}

class Duck extends Animals {
    public void walk() {
        System.out.println("Cuuk-Du-Cuu Walking ..");
    }
}

// Pure-abstraction --------------------------
interface Animal {
    int legs = 2; // Always fixed or Static

    void walk(); // Only defining walk - fn. here ( By default it is public )
    // Animal(){
    // Show an erroe coz interfaces doesn't have constructors into it..
    // }

    // void eat(){
    // This'll also show error coz it neither contains any non-abstract fn nor any
    // fn. implementation
    // }
}

interface Chicku {

}

// To implement abstraction we use implements keyword
class Chicken implements Animal, Chicku {
    public void walk() { // Implementation goes here ..
        System.out.println("Mere desh ki murgi ...Sona - ugle xD!!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Horse husyuiiii = new Horse(); // Constructor chaining
        // husyi.walk(); // Prints ~ Chal mrere Ghode tik-tik-tik..

        // Animals animal = new Animals(); // Run-time error
        // animal.walk();

        // husyi.eat();
        Chicken chicken = new Chicken();
        chicken.walk();

    }
}
