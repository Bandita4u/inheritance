package BASIC;

public class ExplainPolymorphism {
    public static void main(String[] args) {
        Parent p = new Child();
        p.print();
        //method of runtime object is executed so it is called Runtime polymorphism.
    }
}
