package examples;

class Student implements Cloneable {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student original = new Student("Alice", 20);
        Student copy = original.clone();

        System.out.println(original); // Student{name='Alice', age=20}
        System.out.println(copy);     // Student{name='Alice', age=20}
    }
}
