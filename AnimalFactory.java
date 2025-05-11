package examples;

//Factory Method Pattern

interface Animal {
 void sound();
}

//Concrete Products
class Dog implements Animal {
 public void sound() {
     System.out.println("Dog barks");
 }
}

class Cat implements Animal {
 public void sound() {
     System.out.println("Cat meows");
 }
}

//Factory
class AnimalFactory {
 public Animal getAnimal(String type) {
     if (type.equalsIgnoreCase("dog")) return new Dog();
     else if (type.equalsIgnoreCase("cat")) return new Cat();
     return null;
 }

 public static void main(String[] args) {
     AnimalFactory factory = new AnimalFactory();
     Animal animal1 = factory.getAnimal("dog");
     animal1.sound(); // Dog barks
 }
}
