interface Animal {
    void sound();
    void eat();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
    public void eat() {
        System.out.println("Dog eats");
    }
}
public class interfaces1{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.eat();
    }
}