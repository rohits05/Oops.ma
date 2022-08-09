package bank;

// Packages ~  A related combined things/code put together all into one box(proper manner/format)
// Like ~ Feast packages, Cola packages,etc
// Types ~ Built-in packages, user-defined packages
// Built-in packages ~~~ We import java.util package to use scanner (I/O) class in java (utility classes and fn.s realted to it!!)

class Account {
    public String name;
    protected String email; // access to current and others sub-classes
    private String password;

    // To access private things we use getters & setters in java
    // Creating a fn to get the values and set the values

    // Getter
    public String getPassword() {
        // setPassword(randomPass);
        return this.password;
    }

    // Setter
    public void setPassword(String pass) {
        this.password = pass;

    }
}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Rohit_45_addicted";
        account1.email = "carpediem212045@gmail.com";
        // account1.password = "*****"; // not accessible dut to private boundation

        // Using getter & setter fn. now ~
        account1.setPassword("*****");
        System.out.println(account1.getPassword());

    }
}
