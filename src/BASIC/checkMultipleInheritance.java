package BASIC;

public class checkMultipleInheritance {
    interface animal{
        void eat();
    }
    interface mammal{
        void walk();
    }
    abstract class dog implements animal{
        public void walk(){
            System.out.println("Dog walk");
        }
        public void eat(){
            System.out.println("Dog eat");
        }

    }

}
