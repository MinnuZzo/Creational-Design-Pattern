package examples;

//Builder Pattern

class Computer {
 String CPU;
 String RAM;
 String storage;

 public String toString() {
     return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage + "]";
 }
}

//Builder
class ComputerBuilder {
 private Computer computer = new Computer();

 public ComputerBuilder setCPU(String cpu) {
     computer.CPU = cpu;
     return this;
 }

 public ComputerBuilder setRAM(String ram) {
     computer.RAM = ram;
     return this;
 }

 public ComputerBuilder setStorage(String storage) {
     computer.storage = storage;
     return this;
 }

 public Computer build() {
     return computer;
 }

 public static void main(String[] args) {
     Computer computer = new ComputerBuilder()
                             .setCPU("Intel i7")
                             .setRAM("16GB")
                             .setStorage("512GB SSD")
                             .build();
     System.out.println(computer);
 }
}
