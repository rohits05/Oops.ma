import java.util.*;
import bank.Bank;

// Access modifier ~ Defines which things/part should get access to others. Sharing desired resources to a particular domain type.
// Types ~ public, private, protective and default
// public ~ accessible to all.
// private ~ can be accessed *within a class only & not outside of it.
// protected ~ accessible into its *own class & only to the *sub-class of others.
// default ~ accessible inside its *own package only and not to others.
public class Account {
    public static void main(String[] args) {
        bank.Account account1 = new bank.Account();
        account1.name = "Chetan";
    }
}
