// You are using Java
// Base class
class Animal {
    void sound() {
        System.out.println("The Sound of the animal");
    }
}

// Derived class Dog
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Derived class Cat
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
class Main {
    public static void main(String args[]) {
        Animal a1 = new Dog();   // Dog object
        Animal a2 = new Cat();   // Cat object

        a1.sound();  // Outputs: Dog barks
        a2.sound();  // Outputs: Cat meows
    }
}
