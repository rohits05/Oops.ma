// Static keyword ~ Use to store common information and save memory
// Can be accessed using class name ..
// Can be used in-place of properties,fn's, blocks, nested classes..
// Memory allocated to Static things is only once at a time and to object it can be given as many times..!
class Student {
    String name;
    static String school; // Common for all

    public static void changeSchool() {
        System.out.println("Schl Updated to RAV");
        school = "RAG";
    }
}

public class Static {
    public static void main(String[] args) {
        Student.school = "GBV"; // class name implementation
        Student s1 = new Student();
        s1.name = "Krish";
        System.out.println(s1.school);
    }
}
