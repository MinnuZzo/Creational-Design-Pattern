package examples;

//Abstract Factory Pattern

interface Button {
 void paint();
}

interface Checkbox {
 void paint();
}

//Concrete Products for Windows
class WindowsButton implements Button {
 public void paint() {
     System.out.println("Rendering Windows Button");
 }
}
class WindowsCheckbox implements Checkbox {
 public void paint() {
     System.out.println("Rendering Windows Checkbox");
 }
}

//Concrete Products for Mac
class MacButton implements Button {
 public void paint() {
     System.out.println("Rendering Mac Button");
 }
}
class MacCheckbox implements Checkbox {
 public void paint() {
     System.out.println("Rendering Mac Checkbox");
 }
}

//Abstract Factory
interface GUIFactory {
 Button createButton();
 Checkbox createCheckbox();
}

//Concrete Factories
class WindowsFactory implements GUIFactory {
 public Button createButton() { return new WindowsButton(); }
 public Checkbox createCheckbox() { return new WindowsCheckbox(); }
}

class MacFactory implements GUIFactory {
 public Button createButton() { return new MacButton(); }
 public Checkbox createCheckbox() { return new MacCheckbox(); }
}

//Client
class Application {
 private Button button;
 private Checkbox checkbox;

 public Application(GUIFactory factory) {
     button = factory.createButton();
     checkbox = factory.createCheckbox();
 }

 public void paint() {
     button.paint();
     checkbox.paint();
 }

 public static void main(String[] args) {
     GUIFactory factory = new MacFactory(); // Switch to WindowsFactory if needed
     Application app = new Application(factory);
     app.paint();
 }
}
