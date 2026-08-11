public class Q9 {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}class A extends Thread {
    public void run() {
        System.out.println("Thread A is Running");
    }
}
class B extends Thread {
    public void run() {
        System.out.println("Thread B is Running");
    }
}
