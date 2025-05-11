package examples;
public class Singleton {
    private static Singleton instance;

    private Singleton() {} // private constructor

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // lazy initialization
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton instance says Hello!");
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.showMessage();
    }
}
