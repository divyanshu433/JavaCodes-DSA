public class OOPS_04 {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eats();
        h.walk();

        
    }
    


}

abstract class Animal{
    void eats(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}